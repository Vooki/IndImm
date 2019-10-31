package io.github.vooki.indimm.init;

import java.util.ArrayList;
import java.util.List;

import io.github.vooki.indimm.objects.items.ItemResourceBase;
import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Resources
	public static final Item INGOT_COPPER = new ItemResourceBase("ingot_copper");
	
	public static final Item INGOT_STEEL = new ItemResourceBase("ingot_steel");
}