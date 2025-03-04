package dev.itsmeow.betteranimalsplus.client.model.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.itsmeow.betteranimalsplus.common.entity.EntitySaltwaterEel;
import dev.itsmeow.imdlib.client.util.RenderUtil;
import dev.itsmeow.betteranimalsplus.util.ModMathHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

/**
 * EelSaltwater - Batman Created using Tabula 7.0.1
 */
public class ModelSaltwaterEel<T extends LivingEntity> extends EntityModel<T> {
    public ModelPart body00;
    public ModelPart body01;
    public ModelPart head;
    public ModelPart topFin01;
    public ModelPart lowFin01;
    public ModelPart lFin;
    public ModelPart rFin;
    public ModelPart body02;
    public ModelPart topFin02;
    public ModelPart lowFin02;
    public ModelPart body03;
    public ModelPart topFin03;
    public ModelPart lowFin03;
    public ModelPart body04;
    public ModelPart topFin04;
    public ModelPart lowFin04;
    public ModelPart body05;
    public ModelPart topFin05;
    public ModelPart lowFin05;
    public ModelPart body06;
    public ModelPart topFin06;
    public ModelPart lowFin06;
    public ModelPart topFin07;
    public ModelPart lowFin07;
    public ModelPart topJaw;
    public ModelPart lowerJaw;
    public ModelPart topTeethL;
    public ModelPart topTeethR;
    public ModelPart snout;
    public ModelPart lCrest;
    public ModelPart rCrest;
    public ModelPart lowerJawUnder;
    public ModelPart lowJawPieceL;
    public ModelPart lowJawPieceR;
    public ModelPart lowTeethL;
    public ModelPart lowTeethR;
    private boolean inWater = true;

    public ModelSaltwaterEel() {
        this.texWidth = 50;
        this.texHeight = 200;
        this.lowerJawUnder = new ModelPart(this, 16, 74);
        this.lowerJawUnder.setPos(0.0F, -1.0F, -6.9F);
        this.lowerJawUnder.addBox(-1.5F, 0.0F, 0.0F, 2, 1, 7, 0.0F);
        this.setRotateAngle(lowerJawUnder, -0.136659280431156F, 0.0F, 0.0F);
        this.lowFin03 = new ModelPart(this, 0, 150);
        this.lowFin03.setPos(0.0F, 2.9F, 0.0F);
        this.lowFin03.addBox(0.0F, 0.0F, 0.0F, 0, 4, 9, 0.0F);
        this.lowFin07 = new ModelPart(this, 0, 168);
        this.lowFin07.setPos(0.0F, 1.5F, 0.0F);
        this.lowFin07.addBox(0.0F, 0.0F, 0.0F, 0, 5, 13, 0.0F);
        this.lowTeethR = new ModelPart(this, 30, 4);
        this.lowTeethR.setPos(-0.7F, -1.5F, -6.5F);
        this.lowTeethR.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.lowFin01 = new ModelPart(this, 0, 140);
        this.lowFin01.setPos(0.0F, 2.9F, 0.0F);
        this.lowFin01.addBox(0.0F, 0.0F, 0.0F, 0, 4, 9, 0.0F);
        this.lCrest = new ModelPart(this, 0, 0);
        this.lCrest.setPos(0.4F, 0.5F, 4.3F);
        this.lCrest.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 0, 0.0F);
        this.setRotateAngle(lCrest, 0.0F, 0.0F, 0.31869712141416456F);
        this.topFin06 = new ModelPart(this, 0, 125);
        this.topFin06.setPos(0.0F, -2.9F, 0.0F);
        this.topFin06.addBox(0.0F, -4.0F, 0.0F, 0, 5, 9, 0.0F);
        this.lowFin02 = new ModelPart(this, 0, 145);
        this.lowFin02.setPos(0.0F, 2.9F, 0.0F);
        this.lowFin02.addBox(0.0F, 0.0F, 0.0F, 0, 4, 9, 0.0F);
        this.body02 = new ModelPart(this, 0, 33);
        this.body02.setPos(0.0F, 0.0F, 9.0F);
        this.body02.addBox(-1.5F, -3.0F, 0.0F, 3, 6, 9, 0.0F);
        this.lowFin04 = new ModelPart(this, 0, 155);
        this.lowFin04.setPos(0.0F, 2.9F, 0.0F);
        this.lowFin04.addBox(0.0F, 0.0F, 0.0F, 0, 4, 9, 0.0F);
        this.lowTeethL = new ModelPart(this, 30, 4);
        this.lowTeethL.mirror = true;
        this.lowTeethL.setPos(-0.3F, -1.5F, -6.5F);
        this.lowTeethL.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.topFin01 = new ModelPart(this, 0, 99);
        this.topFin01.setPos(0.0F, -2.9F, 0.0F);
        this.topFin01.addBox(0.0F, -4.0F, 0.0F, 0, 4, 9, 0.0F);
        this.topFin03 = new ModelPart(this, 0, 109);
        this.topFin03.setPos(0.0F, -2.9F, 0.0F);
        this.topFin03.addBox(0.0F, -4.0F, 0.0F, 0, 4, 9, 0.0F);
        this.body05 = new ModelPart(this, 0, 80);
        this.body05.setPos(0.0F, 0.0F, 9.0F);
        this.body05.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 9, 0.0F);
        this.topTeethR = new ModelPart(this, 20, 0);
        this.topTeethR.setPos(-0.3F, 4.0F, -1.0F);
        this.topTeethR.addBox(-1.0F, 0.0F, -5.5F, 1, 1, 6, 0.0F);
        this.snout = new ModelPart(this, 26, 16);
        this.snout.setPos(0.0F, -1.0F, -4.0F);
        this.snout.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(snout, 0.4061381169390805F, 0.0F, 0.0F);
        this.body03 = new ModelPart(this, 0, 49);
        this.body03.setPos(0.0F, 0.0F, 9.0F);
        this.body03.addBox(-1.0F, -3.0F, 0.0F, 2, 6, 9, 0.0F);
        this.lowFin05 = new ModelPart(this, 0, 160);
        this.lowFin05.setPos(0.0F, 2.0F, 0.0F);
        this.lowFin05.addBox(0.0F, 0.0F, 0.0F, 0, 5, 9, 0.0F);
        this.lowerJaw = new ModelPart(this, 16, 59);
        this.lowerJaw.setPos(0.5F, 5.0F, 0.3F);
        this.lowerJaw.addBox(-2.0F, -1.0F, -7.0F, 3, 1, 7, 0.0F);
        this.topFin04 = new ModelPart(this, 0, 114);
        this.topFin04.setPos(0.0F, -2.9F, 0.0F);
        this.topFin04.addBox(0.0F, -4.0F, 0.0F, 0, 4, 9, 0.0F);
        this.topFin05 = new ModelPart(this, 0, 119);
        this.topFin05.setPos(0.0F, -2.9F, 0.0F);
        this.topFin05.addBox(0.0F, -4.0F, 0.0F, 0, 5, 9, 0.0F);
        this.body04 = new ModelPart(this, 0, 65);
        this.body04.setPos(0.0F, 0.0F, 9.0F);
        this.body04.addBox(-1.0F, -2.5F, 0.0F, 2, 5, 9, 0.0F);
        this.topFin07 = new ModelPart(this, 0, 127);
        this.topFin07.setPos(0.0F, -2.5F, 0.0F);
        this.topFin07.addBox(0.0F, -4.0F, 0.0F, 0, 8, 13, 0.0F);
        this.topJaw = new ModelPart(this, 21, 45);
        this.topJaw.setPos(0.0F, 3.0F, -3.0F);
        this.topJaw.addBox(-1.5F, -1.0F, -4.0F, 3, 2, 4, 0.0F);
        this.lFin = new ModelPart(this, 18, 11);
        this.lFin.setPos(2.5F, 0.8F, 4.0F);
        this.lFin.addBox(0.0F, -1.0F, 0.0F, 0, 2, 6, 0.0F);
        this.setRotateAngle(lFin, 0.0F, 0.27314402793711257F, 0.0F);
        this.body06 = new ModelPart(this, 0, 94);
        this.body06.setPos(0.0F, 0.0F, 9.0F);
        this.body06.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 9, 0.0F);
        this.body01 = new ModelPart(this, 0, 16);
        this.body01.setPos(0.0F, 0.0F, 9.0F);
        this.body01.addBox(-2.0F, -3.0F, 0.0F, 4, 6, 9, 0.0F);
        this.topFin02 = new ModelPart(this, 0, 104);
        this.topFin02.setPos(0.0F, -2.9F, 0.0F);
        this.topFin02.addBox(0.0F, -4.0F, 0.0F, 0, 4, 9, 0.0F);
        this.lowJawPieceL = new ModelPart(this, 4, 3);
        this.lowJawPieceL.setPos(0.0F, -0.5F, -6.4F);
        this.lowJawPieceL.addBox(0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F);
        this.setRotateAngle(lowJawPieceL, 0.31869712141416456F, -0.18203784098300857F, 0.0F);
        this.head = new ModelPart(this, 17, 32);
        this.head.setPos(0.0F, -3.0F, 0.1F);
        this.head.addBox(-2.0F, 0.0F, -3.0F, 4, 4, 3, 0.0F);
        this.lowJawPieceR = new ModelPart(this, 4, 3);
        this.lowJawPieceR.setPos(-1.5F, -0.5F, -6.4F);
        this.lowJawPieceR.addBox(0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F);
        this.setRotateAngle(lowJawPieceR, 0.31869712141416456F, 0.18203784098300857F, 0.0F);
        this.topTeethL = new ModelPart(this, 20, 0);
        this.topTeethL.mirror = true;
        this.topTeethL.setPos(0.3F, 4.0F, -1.0F);
        this.topTeethL.addBox(0.0F, 0.0F, -5.5F, 1, 1, 6, 0.0F);
        this.body00 = new ModelPart(this, 0, 0);
        this.body00.setPos(0.5F, 17.0F, -8.0F);
        this.body00.addBox(-2.5F, -3.0F, 0.0F, 5, 6, 9, 0.0F);
        this.rCrest = new ModelPart(this, 0, 0);
        this.rCrest.setPos(-0.5F, 0.5F, 4.3F);
        this.rCrest.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 0, 0.0F);
        this.setRotateAngle(rCrest, 0.0F, 0.0F, -0.31869712141416456F);
        this.rFin = new ModelPart(this, 18, 11);
        this.rFin.setPos(-2.5F, 0.8F, 4.0F);
        this.rFin.addBox(0.0F, -1.0F, 0.0F, 0, 2, 6, 0.0F);
        this.setRotateAngle(rFin, 0.0F, -0.27314402793711257F, 0.0F);
        this.lowFin06 = new ModelPart(this, 0, 166);
        this.lowFin06.setPos(0.0F, 1.9F, 0.0F);
        this.lowFin06.addBox(0.0F, 0.0F, 0.0F, 0, 5, 9, 0.0F);
        this.lowerJaw.addChild(this.lowerJawUnder);
        this.body02.addChild(this.lowFin03);
        this.body06.addChild(this.lowFin07);
        this.lowerJaw.addChild(this.lowTeethR);
        this.body00.addChild(this.lowFin01);
        this.snout.addChild(this.lCrest);
        this.body05.addChild(this.topFin06);
        this.body01.addChild(this.lowFin02);
        this.body01.addChild(this.body02);
        this.body03.addChild(this.lowFin04);
        this.lowerJaw.addChild(this.lowTeethL);
        this.body00.addChild(this.topFin01);
        this.body02.addChild(this.topFin03);
        this.body04.addChild(this.body05);
        this.head.addChild(this.topTeethR);
        this.topJaw.addChild(this.snout);
        this.body02.addChild(this.body03);
        this.body04.addChild(this.lowFin05);
        this.head.addChild(this.lowerJaw);
        this.body03.addChild(this.topFin04);
        this.body04.addChild(this.topFin05);
        this.body03.addChild(this.body04);
        this.body06.addChild(this.topFin07);
        this.head.addChild(this.topJaw);
        this.body00.addChild(this.lFin);
        this.body05.addChild(this.body06);
        this.body00.addChild(this.body01);
        this.body01.addChild(this.topFin02);
        this.lowerJaw.addChild(this.lowJawPieceL);
        this.body00.addChild(this.head);
        this.lowerJaw.addChild(this.lowJawPieceR);
        this.head.addChild(this.topTeethL);
        this.snout.addChild(this.rCrest);
        this.body00.addChild(this.rFin);
        this.body05.addChild(this.lowFin06);
    }

    @Override
    public void renderToBuffer(PoseStack stack, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        stack.pushPose();
        if (!inWater) {
            stack.translate(0F, 0.5F, 0F);
        }
        this.body00.render(stack, bufferIn, packedLightIn, packedOverlayIn);
        stack.popPose();
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float partialTicks = Minecraft.getInstance().getFrameTime();
        float ticks = ageInTicks / 5F + (float) entity.getDeltaMovement().length() * 0.05F;
        float factor = 1F;
        float offset = 0F;
        float amplitude = (float) Math.min(entity.getDeltaMovement().length() * 2.5F + 0.25F, 0.5F);
        if (!entity.isInWater()) {
            amplitude = 0.15F;
            ticks = ageInTicks / 2F;
        }
        this.body00.xRot = 0F;
        if (entity instanceof EntitySaltwaterEel) {
            EntitySaltwaterEel eel = (EntitySaltwaterEel) entity;
            if (entity.getDeltaMovement().length() > 0) {
                float rotX = (float) Math.toRadians(headPitch);
                if (rotX < 0) {
                    rotX /= 2;
                }
                this.body00.xRot = Mth.lerp(partialTicks, eel.lastBodyRotation, rotX);
                eel.lastBodyRotation = rotX;
            }
            this.head.yRot = Mth.sin((float) RenderUtil.partLocation(this.body00, this.head).z() * factor - ticks) * 0.5F + ((float) Math.toRadians(netHeadYaw) * 0.0625F);
            float z01 = (float) RenderUtil.partLocation(this.body00, this.body01).z();
            float z02 = (float) RenderUtil.partLocation(this.body00, this.body01, this.body02).z();
            float z03 = (float) RenderUtil.partLocation(this.body00, this.body01, this.body02, this.body03).z();
            float z04 = (float) RenderUtil.partLocation(this.body00, this.body01, this.body02, this.body03, this.body04).z();
            float z05 = (float) RenderUtil.partLocation(this.body00, this.body01, this.body02, this.body03, this.body04, this.body05).z();
            float z06 = (float) RenderUtil.partLocation(this.body00, this.body01, this.body02, this.body03, this.body04, this.body05, this.body06).z();
            float newBody01 = -Mth.sin(z01 * factor + ticks) * amplitude + offset;
            float newBody02 = -Mth.sin(z02 * factor + ticks) * amplitude + offset;
            float newBody03 = Mth.sin(z03 * factor + ticks) * amplitude + offset;
            float newBody04 = Mth.sin(z04 * factor + ticks) * amplitude + offset;
            float newBody05 = Mth.sin(z05 * factor + ticks) * amplitude + offset;
            float newBody06 = -Mth.sin(z06 * factor + ticks) * amplitude + offset;
            this.body01.yRot = ModMathHelper.interpolateRotation(eel.body01, newBody01, partialTicks);
            this.body02.yRot = ModMathHelper.interpolateRotation(eel.body02, newBody02, partialTicks);
            this.body03.yRot = ModMathHelper.interpolateRotation(eel.body03, newBody03, partialTicks);
            this.body04.yRot = ModMathHelper.interpolateRotation(eel.body04, newBody04, partialTicks);
            this.body05.yRot = ModMathHelper.interpolateRotation(eel.body05, newBody05, partialTicks);
            this.body06.yRot = ModMathHelper.interpolateRotation(eel.body06, newBody06, partialTicks);
            eel.body01 = newBody01;
            eel.body02 = newBody02;
            eel.body03 = newBody03;
            eel.body04 = newBody04;
            eel.body05 = newBody05;
            eel.body06 = newBody06;
            this.body00.x = 0.5F + Mth.sin((float) RenderUtil.partLocation(this.body00).z() * factor + ticks) * (10F * amplitude);
        }
        this.inWater = entity.isInWater();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelPart ModelRenderer, float x, float y, float z) {
        ModelRenderer.xRot = x;
        ModelRenderer.yRot = y;
        ModelRenderer.zRot = z;
    }
}
