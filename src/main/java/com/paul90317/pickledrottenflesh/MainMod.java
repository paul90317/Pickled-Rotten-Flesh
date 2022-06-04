package com.paul90317.pickledrottenflesh;

import com.paul90317.pickledrottenflesh.core.init.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MainMod.MOD_ID)
public class MainMod {
    public static final String MOD_ID = "pickledrottenflesh";
    public static final CreativeModeTab MOD_TAB=new CreativeModeTab(MOD_ID){
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.PickledRottenFlesh.get());
        }
    };

    public MainMod() {
        IEventBus bus=FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.Items.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}