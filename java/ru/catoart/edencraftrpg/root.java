package ru.catoart.edencraftrpg;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;

@Mod (modid = "edencraftrpg", name = "EdenCraft RPG", version = "1.0")

public class root {
	@Instance("edencraftrpg")
	public static root instance;
	@SidedProxy(clientSide = "ru.catoart.edencraftrpg.ClientProxy", serverSide = "ru.catoart.edencraftrpg.CommonProxy")
	public static CommonProxy proxy;
	
	public static Item noviceSword;
	
	
		
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		noviceSword = new NoviceSword().setUnlocalizedName("NoviceSword");
		GameRegistry.registerItem(noviceSword, "NoviceSword");
		registerEntity(ZombiKek.class, "Zombi Kek", 0x00FFFF, 0x00008B);
		proxy.registerRenderers();
	}
	
	public static void registerEntity(Class entityClass, String name, int primaryColor, int secondaryColor) 
	{
	    int entityID = EntityRegistry.findGlobalUniqueEntityId();
	    long seed = name.hashCode();

	    EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
	    EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
	    
	    EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID,primaryColor, secondaryColor)); 
	}
}
