package com.borcheltski.ternaryredstone.objects.item;

import com.borcheltski.ternaryredstone.Main;
import com.borcheltski.ternaryredstone.init.ItemInit;
import com.borcheltski.ternaryredstone.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.REDSTONE);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
		
	}
}
