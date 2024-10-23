package net.TheBlindBandit6.ShrinkRay.item.models;

import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.TheBlindBandit6.ShrinkRay.item.custom.EnlargeRayItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class EnlargeRayModel extends GeoModel<EnlargeRayItem> {
    @Override
    public ResourceLocation getModelResource(EnlargeRayItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"geo/item/enlarge_ray.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EnlargeRayItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"textures/item/enlarge_ray_model.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EnlargeRayItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"animations/item/enlarge_ray.animation.json");
    }
}
