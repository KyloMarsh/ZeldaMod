package net.kylo_m.zeldamod.entity.client;

import net.kylo_m.zeldamod.ZeldaMod;
import net.kylo_m.zeldamod.entity.custom.HylianEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class HylianModel extends GeoModel<HylianEntity> {
    @Override
    public Identifier getModelResource(HylianEntity animatable) {
        return new Identifier(ZeldaMod.MOD_ID, "geo/hylian.geo.json");
    }

    @Override
    public Identifier getTextureResource(HylianEntity animatable) {
        return new Identifier(ZeldaMod.MOD_ID, "textures/entity/hylian.png");
    }

    @Override
    public Identifier getAnimationResource(HylianEntity animatable) {
        return new Identifier(ZeldaMod.MOD_ID, "animations/hylian.animation.json");
    }

    @Override
    public void setCustomAnimations(HylianEntity animatable, long instanceId, AnimationState<HylianEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
