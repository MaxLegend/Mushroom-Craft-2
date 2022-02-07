package ru.tesmio.MushroomCraft2;

import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.tesmio.MushroomCraft2.MushroomCore.MushroomTab;
import ru.tesmio.MushroomCraft2.blocks.MushroomUnderOak;

public class RegBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			MushroomCore.MODID);

	public static void register(IEventBus bus) {
		BLOCKS.register(bus);
	}
	
	 public static final RegistryObject<Block> MUSHROOM_UNDER_OAK = registerBlock("mushroom_under_oak", () -> new MushroomUnderOak(AbstractBlock.Properties.of(Material.CLAY)));
	 
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
		RegItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MushroomTab.MUSHROOM_MAIN)));
	}

}
