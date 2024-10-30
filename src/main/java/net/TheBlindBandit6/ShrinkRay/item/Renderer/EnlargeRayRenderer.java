package net.TheBlindBandit6.ShrinkRay.item.Renderer;

import net.TheBlindBandit6.ShrinkRay.item.custom.EnlargeRayItem;
import net.TheBlindBandit6.ShrinkRay.item.models.EnlargeRayModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public final class EnlargeRayRenderer extends GeoItemRenderer<EnlargeRayItem> {
    public EnlargeRayRenderer() {
        super(new EnlargeRayModel());
    }
}
