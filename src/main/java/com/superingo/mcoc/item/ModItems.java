package com.superingo.mcoc.item;

import com.superingo.mcoc.Mcoc;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.swing.*;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mcoc.MOD_ID);

    public static final RegistryObject<Item> TRANSFORMATION_AMULET = ITEMS.register("transformation_amulet",
            () -> new Item(new Item.Properties().durability(10).tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
