package net.TheBlindBandit6.ShrinkGun.item;

import net.TheBlindBandit6.ShrinkGun.ShrinkGun;
import net.TheBlindBandit6.ShrinkGun.item.custom.ShrinkGunItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ShrinkGun.MOD_ID);

    //Items
    public static final DeferredItem<ShrinkGunItem> SHRINK_GUN = ITEMS.register("shrink_gun",
            () -> new ShrinkGunItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).attributes(ShrinkGunItem.createAttributes()),1));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
