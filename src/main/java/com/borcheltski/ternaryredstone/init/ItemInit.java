package com.borcheltski.ternaryredstone.init;

import java.util.ArrayList;
import java.util.List;

import com.borcheltski.ternaryredstone.objects.item.ItemBase;

import net.minecraft.item.Item;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item TERNARY_STONE = new ItemBase("ternstone_dust");
}
