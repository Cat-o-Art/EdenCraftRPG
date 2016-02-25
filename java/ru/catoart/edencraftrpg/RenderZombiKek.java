package ru.catoart.edencraftrpg;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderZombiKek extends RenderBiped {

	private static final ResourceLocation textureLocation = new ResourceLocation("edencraftrpg:textures/entity/steve.png");

	public RenderZombiKek(ModelBiped model, float shadowSize)   
	{
	    super(model, shadowSize);   
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)  
	{
	    return textureLocation;     
	}
}
