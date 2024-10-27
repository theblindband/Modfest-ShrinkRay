package net.TheBlindBandit6.ShrinkRay.item;

import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.TheBlindBandit6.ShrinkRay.item.custom.EnlargeRayItem;
import net.TheBlindBandit6.ShrinkRay.item.custom.ShrinkRayItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ShrinkRay.MOD_ID);

    //Items
    public static final DeferredItem<ShrinkRayItem> SHRINK_RAY = ITEMS.register("shrink_ray",
            () -> new ShrinkRayItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final DeferredItem<EnlargeRayItem> ENLARGE_RAY = ITEMS.register("enlarge_ray",
            () -> new EnlargeRayItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
