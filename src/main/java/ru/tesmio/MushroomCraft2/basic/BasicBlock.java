package ru.tesmio.MushroomCraft2.basic;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicBlock extends Block {

	public BasicBlock(Properties p, Material m, String name) {
		super(AbstractBlock.Properties.of(m));
		this.setRegistryName(name);
	}

}
