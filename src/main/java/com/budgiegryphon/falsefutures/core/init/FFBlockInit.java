package com.budgiegryphon.falsefutures.core.init;

import com.budgiegryphon.falsefutures.FalseFutures;
import com.budgiegryphon.falsefutures.common.block.JellycakeBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FFBlockInit {
	public static final DeferredRegister<Block> BLOCKS  = DeferredRegister.create(ForgeRegistries.BLOCKS,
            FalseFutures.MODID);
	
	public static final RegistryObject<Block> JELLYCAKE = BLOCKS.register("jellycake", () -> new JellycakeBlock
			(BlockBehaviour.Properties.of(Material.CLAY).instabreak().sound(SoundType.SLIME_BLOCK)));

}
