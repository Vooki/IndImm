package io.github.vooki.indimm.creative_tabs;

import io.github.vooki.indimm.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class IndImmResourcesTab extends CreativeTabs
{

	public IndImmResourcesTab(String label) 
	{
		super("indimm_resources");
		this.setBackgroundImageName("resources.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.INGOT_STEEL);
	}

}
