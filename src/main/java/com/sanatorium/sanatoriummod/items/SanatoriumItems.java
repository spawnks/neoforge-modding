package com.sanatorium.sanatoriummod.items;

import com.sanatorium.sanatoriummod.SanatoriumMod;
import net.minecraft.world.item.*;
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

    public static final DeferredItem<SwordItem> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.MITHRIL,6,-2.0f))));

    public static final DeferredItem<AxeItem> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.MITHRIL, 6f, -3f))));

    public static final DeferredItem<PickaxeItem> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.MITHRIL,1.0f, -2.0f))));

    public static final DeferredItem<ShovelItem> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.MITHRIL,1.5f, -3.0f))));

    public static final DeferredItem<HoeItem> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.MITHRIL,-3.0f, 0.0f))));

    public static final DeferredItem<ArmorItem> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(37))));

    public static final DeferredItem<ArmorItem> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(37))));

    public static final DeferredItem<ArmorItem> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                     new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(37))));

    public static final DeferredItem<ArmorItem> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(37))));






    public static void register(IEventBus eventBus)  {
         ITEMS.register(eventBus);
    }




}


