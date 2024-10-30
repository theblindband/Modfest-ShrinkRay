package net.TheBlindBandit6.ShrinkRay.item.Renderer;

import net.TheBlindBandit6.ShrinkRay.item.custom.ShrinkRayItem;
import net.TheBlindBandit6.ShrinkRay.item.models.ShrinkRayModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ShrinkRayRenderer extends GeoItemRenderer<ShrinkRayItem> {
    public ShrinkRayRenderer() {
        super(new ShrinkRayModel());
    }
}
