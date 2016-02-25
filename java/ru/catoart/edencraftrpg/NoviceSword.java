package ru.catoart.edencraftrpg;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class NoviceSword extends ItemSword {

	 protected NoviceSword() {
         super(ToolMaterial.WOOD);
         this.setCreativeTab(CreativeTabs.tabCombat);
         this.setTextureName("edencraftrpg:NoviceSword");
        
 }
}
