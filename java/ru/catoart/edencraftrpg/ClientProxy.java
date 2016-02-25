package ru.catoart.edencraftrpg;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends CommonProxy 
{
	@Override
	public void registerRenderers() 
	{
	    RenderingRegistry.registerEntityRenderingHandler(ZombiKek.class, new RenderZombiKek(new ModelBiped(), 0.5F));  
	}

}
