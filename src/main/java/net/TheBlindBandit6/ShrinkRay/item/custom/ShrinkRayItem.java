package net.TheBlindBandit6.ShrinkRay.item.custom;

import net.TheBlindBandit6.ShrinkRay.effect.ModEffects;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;

public class ShrinkRayItem extends Item {
    public static int SHRINK_LEVEL = 0;
    public static final ResourceLocation SHRINK_GUN_RANGE = ResourceLocation.withDefaultNamespace("shrink_gun_range");
    public ShrinkRayItem(Properties properties, int shrinklevel) {
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
        interactionTarget.removeEffect(ModEffects.ENLARGE_EFFECT);
        interactionTarget.addEffect(new MobEffectInstance(ModEffects.SHRINK_EFFECT, 1200, SHRINK_LEVEL), interactionTarget);
        player.getCooldowns().addCooldown(this, 40);
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
