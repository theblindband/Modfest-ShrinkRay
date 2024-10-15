package net.TheBlindBandit6.ShrinkGun.entity;

import net.TheBlindBandit6.ShrinkGun.ShrinkGun;
import net.TheBlindBandit6.ShrinkGun.entity.custom.ShrinkGunProjectile;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, ShrinkGun.MOD_ID);



    public static final DeferredHolder<EntityType<?>, EntityType<ShrinkGunProjectile>> SHRINK_GUN_PROJECTILE =
            ENTITY_TYPES.register("shrink_gun_projectile", () -> EntityType.Builder.of(ShrinkGunProjectile::new, MobCategory.MISC)
                    .sized(1F, 1F).build("shrink_gun_projectile"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}