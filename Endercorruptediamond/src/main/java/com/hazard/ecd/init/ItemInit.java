package com.hazard.ecd.init;

import com.google.common.base.Supplier;
import com.hazard.ecd.EnderCorruptediamonds;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EnderCorruptediamonds.MOD_ID);
    
    public static final RegistryObject<Item> ender_corrupted_diamond = register("ender_corrupted_diamond", () -> new Item (new Item.Properties().tab(EnderCorruptediamonds.ECD_TAB)));

    
    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
    	return ITEMS.register(name, item);
    }
 }
