package net.TheBlindBandit6.ShrinkRay.entity;

import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.TheBlindBandit6.ShrinkRay.entity.custom.ShrinkRayProjectileEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = ShrinkRay.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEntityClientEvents {


    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {


    }



    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {

    }
}
