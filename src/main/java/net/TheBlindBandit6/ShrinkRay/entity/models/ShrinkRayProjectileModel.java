package net.TheBlindBandit6.ShrinkRay.entity.models;

import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.TheBlindBandit6.ShrinkRay.entity.custom.ShrinkRayProjectileEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ShrinkRayProjectileModel extends GeoModel<ShrinkRayProjectileEntity> {
    //This model is using placeholders while waiting for the model files
    @Override
    public ResourceLocation getModelResource(ShrinkRayProjectileEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"geo/entity/shrink_ray_projectile.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ShrinkRayProjectileEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"textures/entity/shrink_ray_projectile.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ShrinkRayProjectileEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"animations/entity/shrink_ray_projectile.animation.json");
    }
}
