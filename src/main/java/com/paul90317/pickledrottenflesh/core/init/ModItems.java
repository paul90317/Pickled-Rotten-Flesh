package com.paul90317.pickledrottenflesh.core.init;
import com.paul90317.pickledrottenflesh.MainMod;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> Items= DeferredRegister.create(ForgeRegistries.ITEMS, MainMod.MOD_ID);

    public static final RegistryObject<Item> PickledRottenFlesh = Items.register("pickledrottenflesh",
            () -> new Item(new Item.Properties().tab(MainMod.MOD_TAB)
                    .food(new FoodProperties.Builder()
                            .effect(()->new MobEffectInstance(MobEffects.CONFUSION,200,0),0.4f)
                            .nutrition(2).saturationMod(0.8f).build())));
    public static final RegistryObject<Item> RegeneratedLeather = Items.register("raw_leather",
            () -> new Item(new Item.Properties().tab(MainMod.MOD_TAB)));
    public static final RegistryObject<Item> RegeneratedRabbitHide = Items.register("raw_rabbit_hide",
            () -> new Item(new Item.Properties().tab(MainMod.MOD_TAB)));
    public static final RegistryObject<Item> RegeneratedRabbitFoot = Items.register("raw_rabbit_foot",
            () -> new Item(new Item.Properties().tab(MainMod.MOD_TAB)));
    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}