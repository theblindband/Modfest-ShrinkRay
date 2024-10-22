package net.TheBlindBandit6.ShrinkRay.item.Renderer;

import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.TheBlindBandit6.ShrinkRay.item.custom.EnlargeRayItem;
import net.TheBlindBandit6.ShrinkRay.item.custom.ShrinkRayItem;
import net.TheBlindBandit6.ShrinkRay.item.models.EnlargeRayModel;
import net.TheBlindBandit6.ShrinkRay.item.models.ShrinkRayModel;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public final class EnlargeRayRenderer extends GeoItemRenderer<EnlargeRayItem> {
    public EnlargeRayRenderer() {
        super(new EnlargeRayModel());
    }
}
