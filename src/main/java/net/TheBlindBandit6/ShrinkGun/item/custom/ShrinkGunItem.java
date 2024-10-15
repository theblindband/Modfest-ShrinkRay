package net.TheBlindBandit6.ShrinkGun.item.custom;

import net.TheBlindBandit6.ShrinkGun.ShrinkGun;
import net.TheBlindBandit6.ShrinkGun.effect.ModEffects;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class ShrinkGunItem extends Item {
    public static int SHRINK_LEVEL = 0;
    public static final ResourceLocation SHRINK_GUN_RANGE = ResourceLocation.withDefaultNamespace("shrink_gun_range");
    public ShrinkGunItem(Properties properties, int shrinklevel) {
        super(properties);
        SHRINK_LEVEL = shrinklevel;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.BOW;
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity interactionTarget, InteractionHand usedHand) {
        Level level = player.level();
        level.playSound(player, player, SoundEvents.SHULKER_SHOOT, SoundSource.PLAYERS, 1.0F, 3.0F);
        interactionTarget.addEffect(new MobEffectInstance(ModEffects.SHRINK_EFFECT, 1200, SHRINK_LEVEL), interactionTarget);
        return super.interactLivingEntity(stack, player, interactionTarget, usedHand);
    }

    public static ItemAttributeModifiers createAttributes() {
        return ItemAttributeModifiers.builder()
                .add(
                        Attributes.ENTITY_INTERACTION_RANGE, new AttributeModifier(SHRINK_GUN_RANGE, 27.0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND
                )
                .build();
    }

}
