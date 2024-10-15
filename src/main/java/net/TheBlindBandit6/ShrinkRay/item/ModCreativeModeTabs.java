package net.TheBlindBandit6.ShrinkRay.item;

import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShrinkRay.MOD_ID);

    //Creates the creative item tab
    public static final Supplier<CreativeModeTab> SHRINK_GUN_TAB = CREATIVE_MODE_TAB.register("shrinkray_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((ItemLike) ModItems.SHRINK_RAY))
                    .title(Component.translatable("creativetab.shrinkray"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.SHRINK_RAY);
                        output.accept(ModItems.ENLARGE_RAY);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
