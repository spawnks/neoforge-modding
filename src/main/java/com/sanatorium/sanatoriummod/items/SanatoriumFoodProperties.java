package com.sanatorium.sanatoriummod.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class SanatoriumFoodProperties {
    public static final FoodProperties RAW_MONSTER_DRUMSTICK = new FoodProperties.Builder()
            .nutrition(2)
            .alwaysEdible()
            .saturationModifier(3)
            .effect(new MobEffectInstance(MobEffects.POISON, 1200, 2), 1)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 400, 3), 1)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 400, 1), 1)
            .build();

    public static final FoodProperties COOKED_MONSTER_DRUMSTICK = new FoodProperties.Builder()
            .nutrition(5)
            .alwaysEdible()
            .saturationModifier(6)
            .build();




}
