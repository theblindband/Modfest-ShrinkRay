package net.TheBlindBandit6.ShrinkRay.entity.models;

import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.TheBlindBandit6.ShrinkRay.entity.custom.EnlargeRayProjectileEntity;
import net.TheBlindBandit6.ShrinkRay.entity.custom.ShrinkRayProjectileEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class EnlargeRayProjectileModel extends GeoModel<EnlargeRayProjectileEntity> {
    //This model is using placeholders while waiting for the model files
    @Override
    public ResourceLocation getModelResource(EnlargeRayProjectileEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"geo/entity/shrink_ray_projectile.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EnlargeRayProjectileEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"textures/entity/enlarge_ray_projectile.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EnlargeRayProjectileEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"animations/entity/shrink_ray_projectile.animation.json");
    }
}
