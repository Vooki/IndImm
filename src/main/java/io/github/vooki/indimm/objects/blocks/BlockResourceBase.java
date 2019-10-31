package io.github.vooki.indimm.objects.blocks;

import io.github.vooki.indimm.IndImmMain;
import io.github.vooki.indimm.init.ModBlocks;
import io.github.vooki.indimm.init.ModItems;
import io.github.vooki.indimm.lib.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockResourceBase extends Block implements IHasModel
{
	public BlockResourceBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(IndImmMain.indimm_resources);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		IndImmMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
