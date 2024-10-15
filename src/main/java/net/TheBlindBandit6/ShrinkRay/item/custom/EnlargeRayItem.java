package net.TheBlindBandit6.ShrinkRay.item.custom;

import net.TheBlindBandit6.ShrinkRay.effect.ModEffects;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;

public class EnlargeRayItem extends Item {
    public static int ENLARGE_LEVEL = 0;
    public static final ResourceLocation ENLARGE_GUN_RANGE = ResourceLocation.withDefaultNamespace("enlarge_gun_range");
    public EnlargeRayItem(Properties properties, int enlargelevel) {
        super(properties);
        ENLARGE_LEVEL = enlargelevel;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        level.playSound(player, player, SoundEvents.SHULKER_SHOOT, SoundSource.PLAYERS, 0.8F, 3.0F);
        return super.use(level, player, usedHand);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity interactionTarget, InteractionHand usedHand) {
        interactionTarget.removeEffect(ModEffects.SHRINK_EFFECT);
        interactionTarget.addEffect(new MobEffectInstance(ModEffects.ENLARGE_EFFECT, 1200, ENLARGE_LEVEL), interactionTarget);
        return super.interactLivingEntity(stack, player, interactionTarget, usedHand);
    }

    public static ItemAttributeModifiers createAttributes() {
        return ItemAttributeModifiers.builder()
                .add(
                        Attributes.ENTITY_INTERACTION_RANGE, new AttributeModifier(ENLARGE_GUN_RANGE, 27.0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND
                )
                .build();
    }

}
