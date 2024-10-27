package net.TheBlindBandit6.ShrinkRay.item.custom;

import net.TheBlindBandit6.ShrinkRay.entity.custom.EnlargeRayProjectileEntity;
import net.TheBlindBandit6.ShrinkRay.entity.custom.ShrinkRayProjectileEntity;
import net.TheBlindBandit6.ShrinkRay.item.Renderer.EnlargeRayRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

import static net.TheBlindBandit6.ShrinkRay.entity.ModEntities.ENLARGE_RAY_PROJECTILE;
import static net.TheBlindBandit6.ShrinkRay.entity.ModEntities.SHRINK_RAY_PROJECTILE;

public class EnlargeRayItem extends Item implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    public EnlargeRayItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        if (usedHand == InteractionHand.MAIN_HAND) {
            level.playSound(player, player, SoundEvents.SHULKER_SHOOT, SoundSource.PLAYERS, 0.8F, 3.0F);
            if (!level.isClientSide) {
                ItemStack itemStack = player.getItemInHand(usedHand);

                // Start using the item to trigger the animation
                player.startUsingItem(usedHand);

                // Get the player's look direction
                Vec3 lookVec = player.getLookAngle();

                // Create the new entity (replace CustomEntity with your entity class)
                ShrinkRayProjectileEntity entity = new ShrinkRayProjectileEntity(ENLARGE_RAY_PROJECTILE.get(), level);
                entity.setPos(player.getX(), player.getY() + player.getEyeHeight() - 0.22, player.getZ());

                // Set the entity's motion in the direction the player is looking
                entity.setDeltaMovement(lookVec.scale(3)); // Adjust the scale for desired momentum

                // Spawn the entity in the world
                level.addFreshEntity(entity);

                player.getCooldowns().addCooldown(this, 20);
                return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide());
            }
        }
        return InteractionResultHolder.pass(player.getItemInHand(usedHand));
    }

    //GeckoLib
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private EnlargeRayRenderer renderer;

            @Override
            public BlockEntityWithoutLevelRenderer getGeoItemRenderer() {
                if (this.renderer == null)
                    this.renderer = new EnlargeRayRenderer();

                return this.renderer;
            }
        });
    }
}
