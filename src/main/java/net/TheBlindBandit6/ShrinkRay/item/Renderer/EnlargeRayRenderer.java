package net.TheBlindBandit6.ShrinkRay.item.Renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.TheBlindBandit6.ShrinkRay.item.custom.EnlargeRayItem;
import net.TheBlindBandit6.ShrinkRay.item.custom.ShrinkRayItem;
import net.TheBlindBandit6.ShrinkRay.item.models.EnlargeRayModel;
import net.TheBlindBandit6.ShrinkRay.item.models.ShrinkRayModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public final class EnlargeRayRenderer extends GeoItemRenderer<EnlargeRayItem> {
    public EnlargeRayRenderer() {
        super(new EnlargeRayModel());
    }

    /*
    @Override
    protected void renderInGui(ItemDisplayContext transformType, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay, float partialTick) {
        super.renderInGui(transformType, poseStack, bufferSource, packedLight, packedOverlay, partialTick);
    }
     */
}
