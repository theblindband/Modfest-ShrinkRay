package net.TheBlindBandit6.ShrinkRay.effect;

import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, ShrinkRay.MOD_ID);

    public static final Holder<MobEffect> SHRINK_EFFECT = MOB_EFFECTS.register("shrink",
            () -> new ShrinkEffect(MobEffectCategory.NEUTRAL, 15902107)
                    .addAttributeModifier(Attributes.SCALE,
                            ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID, "shrink"), -0.25f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final Holder<MobEffect> ENLARGE_EFFECT = MOB_EFFECTS.register("enlarge",
            () -> new EnlargeEffect(MobEffectCategory.NEUTRAL, 10217714)
                    .addAttributeModifier(Attributes.SCALE,
                            ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID, "enlarge"), 0.25f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
