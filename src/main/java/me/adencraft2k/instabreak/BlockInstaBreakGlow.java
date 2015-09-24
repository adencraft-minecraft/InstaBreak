package me.adencraft2k.instabreak;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInstaBreakGlow extends Block {
	public BlockInstaBreakGlow(Material Material) {
		super(Material);
		this.setLightLevel(1.0F);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
}
