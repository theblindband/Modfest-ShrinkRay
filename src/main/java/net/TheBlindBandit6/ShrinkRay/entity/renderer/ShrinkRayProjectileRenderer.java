package net.TheBlindBandit6.ShrinkRay.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.TheBlindBandit6.ShrinkRay.entity.custom.ShrinkRayProjectileEntity;
import net.TheBlindBandit6.ShrinkRay.entity.models.ShrinkRayProjectileModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ShrinkRayProjectileRenderer extends GeoEntityRenderer<ShrinkRayProjectileEntity> {
    public ShrinkRayProjectileRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ShrinkRayProjectileModel());
    }

    @Override
    public ResourceLocation getTextureLocation(ShrinkRayProjectileEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"textures/entity/shrink_ray_projectile.png");
    }

    @Override
    public void render(ShrinkRayProjectileEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
