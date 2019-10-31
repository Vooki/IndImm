package io.github.vooki.indimm.init;

import java.util.ArrayList;
import java.util.List;

import io.github.vooki.indimm.objects.blocks.BlockResourceBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Resources
	public static final Block BLOCK_COPPER = new BlockResourceBase("block_copper", Material.IRON);
	
	public static final Block BLOCK_STEEL = new BlockResourceBase("block_steel", Material.IRON);
	
	//Machines
}
