package net.TheBlindBandit6.ShrinkRay.entity;

import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.TheBlindBandit6.ShrinkRay.entity.custom.EnlargeRayProjectileEntity;
import net.TheBlindBandit6.ShrinkRay.entity.custom.ShrinkRayProjectileEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, ShrinkRay.MOD_ID);

    public static final DeferredHolder<EntityType<?>, EntityType<ShrinkRayProjectileEntity>> SHRINK_RAY_PROJECTILE =
            ENTITY_TYPES.register("shrink_ray_projectile", () -> EntityType.Builder.of(ShrinkRayProjectileEntity::new, MobCategory.MISC)
                    .sized(0.2F, 0.2F).build("shrink_ray_projectile"));
    public static final DeferredHolder<EntityType<?>, EntityType<EnlargeRayProjectileEntity>> ENLARGE_RAY_PROJECTILE =
            ENTITY_TYPES.register("enlarge_ray_projectile", () -> EntityType.Builder.of(EnlargeRayProjectileEntity::new, MobCategory.MISC)
                    .sized(0.2F, 0.2F).build("enlarge_ray_projectile"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}



