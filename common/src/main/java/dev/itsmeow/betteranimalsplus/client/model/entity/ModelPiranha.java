package dev.itsmeow.betteranimalsplus.client.model.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

/**
 * Piranha - Batman
 * Created using Tabula 8.0.0
 */
public class ModelPiranha<T extends Entity> extends EntityModel<T> {
    public ModelPart body;
    public ModelPart neck;
    public ModelPart rear;
    public ModelPart TopFin;
    public ModelPart leftFin;
    public ModelPart RightFin;
    public ModelPart throat;
    public ModelPart TopJaw;
    public ModelPart LowerJaw;
    public ModelPart snout;
    public ModelPart TopTeeth01;
    public ModelPart TopTeeth02;
    public ModelPart TopTeeth03;
    public ModelPart LowTeeth;
    public ModelPart tail01;
    public ModelPart LowFin01;
    public ModelPart tail02;
    public ModelPart LowFin02;
    public ModelPart SmallTopFin;
    public ModelPart TailFin;
    public ModelPart LowFin03;
    private boolean isInWater;

    public ModelPiranha() {
        this.texWidth = 36;
        this.texHeight = 160;
        this.rear = new ModelPart(this, 0, 63);
        this.rear.setPos(0.0F, 0.0F, 0.0F);
        this.rear.addBox(-2.0F, -4.5F, 0.0F, 4, 8, 3, 0.0F);
        this.throat = new ModelPart(this, 0, 34);
        this.throat.setPos(0.0F, -0.9F, -3.9F);
        this.throat.addBox(-2.5F, 0.0F, 0.0F, 5, 4, 5, 0.0F);
        this.setRotateAngle(throat, -0.5462880558742251F, 0.0F, 0.0F);
        this.TopTeeth01 = new ModelPart(this, 0, 139);
        this.TopTeeth01.setPos(-1.8F, 1.3F, -2.6F);
        this.TopTeeth01.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F);
        this.body = new ModelPart(this, 0, 0);
        this.body.setPos(0.0F, 13.0F, 4.0F);
        this.body.addBox(-2.5F, -5.0F, -9.0F, 5, 10, 9, 0.0F);
        this.leftFin = new ModelPart(this, 26, 20);
        this.leftFin.setPos(2.0F, 3.5F, -7.0F);
        this.leftFin.addBox(0.0F, 0.0F, -1.5F, 0, 6, 3, 0.0F);
        this.setRotateAngle(leftFin, 0.6373942428283291F, 0.0F, -2.1399481958702475F);
        this.TopJaw = new ModelPart(this, 0, 44);
        this.TopJaw.setPos(0.0F, -1.0F, -5.5F);
        this.TopJaw.addBox(-2.5F, -1.5F, -3.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(TopJaw, -0.18203784098300857F, 0.0F, 0.0F);
        this.snout = new ModelPart(this, 0, 51);
        this.snout.setPos(0.0F, -1.5F, -3.0F);
        this.snout.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(snout, 0.6829473363053812F, 0.0F, 0.0F);
        this.LowFin01 = new ModelPart(this, 0, 92);
        this.LowFin01.setPos(0.0F, 3.0F, 0.0F);
        this.LowFin01.addBox(0.0F, 0.0F, 0.0F, 0, 5, 3, 0.0F);
        this.LowFin03 = new ModelPart(this, 0, 105);
        this.LowFin03.setPos(0.0F, 2.0F, 0.0F);
        this.LowFin03.addBox(0.0F, 0.0F, 0.0F, 0, 6, 3, 0.0F);
        this.TopTeeth03 = new ModelPart(this, 7, 138);
        this.TopTeeth03.setPos(0.0F, 1.3F, -2.5F);
        this.TopTeeth03.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F);
        this.TopFin = new ModelPart(this, 0, 125);
        this.TopFin.setPos(0.0F, -4.8F, -5.0F);
        this.TopFin.addBox(0.0F, -4.0F, -1.0F, 0, 4, 7, 0.0F);
        this.setRotateAngle(TopFin, -0.091106186954104F, 0.0F, 0.0F);
        this.LowTeeth = new ModelPart(this, 0, 145);
        this.LowTeeth.setPos(0.0F, -1.5F, -2.5F);
        this.LowTeeth.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.LowFin02 = new ModelPart(this, 0, 98);
        this.LowFin02.setPos(0.0F, 2.0F, 0.0F);
        this.LowFin02.addBox(0.0F, 0.0F, 0.0F, 0, 6, 3, 0.0F);
        this.tail02 = new ModelPart(this, 0, 86);
        this.tail02.setPos(0.0F, -1.0F, 3.0F);
        this.tail02.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 3, 0.0F);
        this.RightFin = new ModelPart(this, 26, 20);
        this.RightFin.setPos(-2.0F, 3.5F, -7.0F);
        this.RightFin.addBox(0.0F, 0.0F, -1.5F, 0, 6, 3, 0.0F);
        this.setRotateAngle(RightFin, 0.6373942428283291F, 0.0F, 2.1399481958702475F);
        this.neck = new ModelPart(this, 0, 20);
        this.neck.setPos(0.0F, -0.5F, -8.0F);
        this.neck.addBox(-3.0F, -4.5F, -6.0F, 6, 7, 6, 0.0F);
        this.setRotateAngle(neck, 0.136659280431156F, 0.0F, 0.0F);
        this.tail01 = new ModelPart(this, 0, 76);
        this.tail01.setPos(0.0F, -0.5F, 3.0F);
        this.tail01.addBox(-1.5F, -3.5F, 0.0F, 3, 6, 3, 0.0F);
        this.SmallTopFin = new ModelPart(this, 0, 135);
        this.SmallTopFin.setPos(0.0F, -5.3F, 1.7F);
        this.SmallTopFin.addBox(0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F);
        this.setRotateAngle(SmallTopFin, -0.27314402793711257F, 0.0F, 0.0F);
        this.TopTeeth02 = new ModelPart(this, 0, 139);
        this.TopTeeth02.setPos(1.8F, 1.3F, -2.6F);
        this.TopTeeth02.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F);
        this.LowerJaw = new ModelPart(this, 0, 57);
        this.LowerJaw.setPos(0.0F, 1.4F, -5.5F);
        this.LowerJaw.addBox(-2.0F, -1.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(LowerJaw, -0.22759093446006054F, 0.0F, 0.0F);
        this.TailFin = new ModelPart(this, 0, 106);
        this.TailFin.setPos(0.0F, 0.5F, 2.5F);
        this.TailFin.addBox(0.0F, -8.5F, 0.0F, 0, 16, 9, 0.0F);
        this.body.addChild(this.rear);
        this.neck.addChild(this.throat);
        this.TopJaw.addChild(this.TopTeeth01);
        this.body.addChild(this.leftFin);
        this.neck.addChild(this.TopJaw);
        this.TopJaw.addChild(this.snout);
        this.rear.addChild(this.LowFin01);
        this.tail02.addChild(this.LowFin03);
        this.TopJaw.addChild(this.TopTeeth03);
        this.body.addChild(this.TopFin);
        this.LowerJaw.addChild(this.LowTeeth);
        this.tail01.addChild(this.LowFin02);
        this.tail01.addChild(this.tail02);
        this.body.addChild(this.RightFin);
        this.body.addChild(this.neck);
        this.rear.addChild(this.tail01);
        this.tail01.addChild(this.SmallTopFin);
        this.TopJaw.addChild(this.TopTeeth02);
        this.neck.addChild(this.LowerJaw);
        this.tail02.addChild(this.TailFin);
    }

    @Override
    public void renderToBuffer(PoseStack stack, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        stack.pushPose();
        {
            if (!this.isInWater) {
                stack.mulPose(Vector3f.ZP.rotationDegrees(90F));
                stack.translate(2F, -1F, 0F);
            }
            this.body.render(stack, bufferIn, packedLightIn, packedOverlayIn);
        }
        stack.popPose();
    }

    @Override
    public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float factor = (float) entityIn.getDeltaMovement().length() * 10;
        this.body.yRot = Mth.cos(ageInTicks * 0.3F) * (float) Math.PI * 0.05F * factor;
        this.tail01.yRot = this.body.yRot * 1.5F;
        this.isInWater = entityIn.isInWater();
    }

    public void setRotateAngle(ModelPart ModelRenderer, float x, float y, float z) {
        ModelRenderer.xRot = x;
        ModelRenderer.yRot = y;
        ModelRenderer.zRot = z;
    }
}
