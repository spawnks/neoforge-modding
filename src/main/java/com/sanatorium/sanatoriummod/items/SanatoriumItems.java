package com.sanatorium.sanatoriummod.items;

import com.sanatorium.sanatoriummod.SanatoriumMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SanatoriumItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SanatoriumMod.MOD_ID);

    public static final DeferredItem<Item> MITHRIL = ITEMS.register("mithril",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MITHRIL_PLATE = ITEMS.register("mithril_plate",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MITHRIL_MASK = ITEMS.register("mithril_mask",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIAMOND_MASK = ITEMS.register("diamond_mask",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_MONSTER_DRUMSTICK = ITEMS.register("raw_monster_drumstick",
            () -> new Item(new Item.Properties().food(SanatoriumFoodProperties.RAW_MONSTER_DRUMSTICK)));

    public static final DeferredItem<Item> COOKED_MONSTER_DRUMSTICK = ITEMS.register("cooked_monster_drumstick",
            () -> new Item(new Item.Properties().food(SanatoriumFoodProperties.COOKED_MONSTER_DRUMSTICK)));



    public static void register(IEventBus eventBus)  {
         ITEMS.register(eventBus);
    }




}


