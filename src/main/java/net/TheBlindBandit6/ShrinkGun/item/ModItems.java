package net.TheBlindBandit6.ShrinkGun.item;

import net.TheBlindBandit6.ShrinkGun.ShrinkGun;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ShrinkGun.MOD_ID);

    //Items
    public static final DeferredItem<Item> SHRINK_GUN = ITEMS.register("shrink_gun",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
