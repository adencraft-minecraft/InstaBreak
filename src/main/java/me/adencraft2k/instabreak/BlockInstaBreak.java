package me.adencraft2k.instabreak;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInstaBreak extends Block {
	public BlockInstaBreak(Material Material) {
		super(Material);
		
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
}
