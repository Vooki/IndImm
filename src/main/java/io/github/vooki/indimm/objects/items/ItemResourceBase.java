package io.github.vooki.indimm.objects.items;

import io.github.vooki.indimm.IndImmMain;
import io.github.vooki.indimm.init.ModItems;
import io.github.vooki.indimm.lib.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemResourceBase extends Item implements IHasModel
{
	public ItemResourceBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(IndImmMain.indimm_resources);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		IndImmMain.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
