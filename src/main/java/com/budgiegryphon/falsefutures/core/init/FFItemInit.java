package com.budgiegryphon.falsefutures.core.init;

import com.budgiegryphon.falsefutures.FalseFutures;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FFItemInit {
    public static final DeferredRegister<Item> ITEMS  = DeferredRegister.create(ForgeRegistries.ITEMS,
            FalseFutures.MODID);
    public static final RegistryObject<Item> GELATIN = ITEMS.register("gelatin", () -> new Item
    		(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(8f).build())));
	public static final RegistryObject<BlockItem> JELLYCAKE = ITEMS.register("jellycake", () -> new BlockItem
			(FFBlockInit.JELLYCAKE.get(), new Item.Properties()));
} 
