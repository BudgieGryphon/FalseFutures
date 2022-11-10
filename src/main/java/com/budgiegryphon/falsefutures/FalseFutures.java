package com.budgiegryphon.falsefutures;

import com.budgiegryphon.falsefutures.core.init.FFBlockInit;
import com.budgiegryphon.falsefutures.core.init.FFItemInit;
import com.mojang.logging.LogUtils;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;

import org.slf4j.Logger;

@Mod(FalseFutures.MODID)
public class FalseFutures
{
    public static final String MODID = "falsefutures";
    private static final Logger LOGGER = LogUtils.getLogger();


    public FalseFutures() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FFItemInit.ITEMS.register(modEventBus);
        FFBlockInit.BLOCKS.register(modEventBus);
        
        GeckoLib.initialize();

        MinecraftForge.EVENT_BUS.register(this);
    }

}
