package ca.robotnick.rpgMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSoul extends Item{
	
	public ItemSoul() {
		
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("soul");
		this.setTextureName("robotnick:ItemSoul");	
	}

}
