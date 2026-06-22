package com.sanatorium.sanatoriummod.items;

import com.sanatorium.sanatoriummod.SanatoriumMod;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.crafting.IngredientType;

import javax.xml.stream.Location;
import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final Holder<ArmorMaterial> MITHRIL_ARMOR_MATERIAL = register("mithril",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 4);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 10);
                attribute.put(ArmorItem.Type.BODY, 15);

            }), 19, 5f, 16f, () -> SanatoriumItems.MITHRIL_PLATE.get());


    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> TypeProtection,
                                                  int enchantability, float toughness, float KnockbackResistance,
                                                  Supplier<Item> ingredientItem ) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(SanatoriumMod.MOD_ID, name);
        Holder<SoundEvent> equipsong = SoundEvents.ARMOR_EQUIP_NETHERITE;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typemap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typemap.put(type, TypeProtection.get(type));

            return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                    new ArmorMaterial(TypeProtection, enchantability, equipsong, ingredient, layers, toughness, KnockbackResistance));
        }

        return null;
    }}



