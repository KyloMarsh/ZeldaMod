package net.kylo_m.zeldamod.entity.client;

import net.kylo_m.zeldamod.ZeldaMod;
import net.kylo_m.zeldamod.entity.custom.HylianEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class HylianRenderer extends GeoEntityRenderer<HylianEntity> {
    public HylianRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new HylianModel());
    }

    @Override
    public Identifier getTextureLocation(HylianEntity animatable) {
        return new Identifier(ZeldaMod.MOD_ID, "textures/entity/hylian.png");
    }

    @Override
    public void render(HylianEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {

        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

}
