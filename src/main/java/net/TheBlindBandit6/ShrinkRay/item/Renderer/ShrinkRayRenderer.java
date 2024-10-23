package net.TheBlindBandit6.ShrinkRay.item.Renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.TheBlindBandit6.ShrinkRay.item.custom.ShrinkRayItem;
import net.TheBlindBandit6.ShrinkRay.item.models.ShrinkRayModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.Items;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ShrinkRayRenderer extends GeoItemRenderer<ShrinkRayItem> {
    public ShrinkRayRenderer() {
        super(new ShrinkRayModel());
    }
}
