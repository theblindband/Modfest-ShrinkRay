package net.TheBlindBandit6.ShrinkRay.item.models;

import net.TheBlindBandit6.ShrinkRay.ShrinkRay;
import net.TheBlindBandit6.ShrinkRay.item.custom.ShrinkRayItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ShrinkRayModel extends GeoModel<ShrinkRayItem> {
    @Override
    public ResourceLocation getModelResource(ShrinkRayItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"geo/item/shrink_ray.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ShrinkRayItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"textures/item/shrink_ray.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ShrinkRayItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ShrinkRay.MOD_ID,"animations/item/shrink_ray.animation.json");
    }
}
