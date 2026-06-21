package com.sanatorium.sanatoriummod.datagen;

import com.sanatorium.sanatoriummod.block.Sanatoriumblocks;
import com.sanatorium.sanatoriummod.items.SanatoriumItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

                 // lista para colocar minerios

        List<ItemLike> MITHRIL_SMELTABLES = List.of(SanatoriumItems.RAW_MITHRIL, Sanatoriumblocks.MITHRIL_ORE);



         //crafting table items. o nome do json vem do item resultante MITHRIL.BLOCK por exemplo vira mithril_block.json, para varias receitas de resultado igual
        // voce especifica o nome no id .save(recipeoutput "nome do item novo 1,2,3,4" se não ele da erro e não roda o codigo. ver a comida

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SanatoriumItems.MITHRIL.get(), 9)
                .requires(Sanatoriumblocks.MITHRIL_BLOCK)
                .unlockedBy("has_mithril_block", has(Sanatoriumblocks.MITHRIL_BLOCK)).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Sanatoriumblocks.MITHRIL_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', SanatoriumItems.MITHRIL.get())
                .unlockedBy("has_mithril", has(SanatoriumItems.MITHRIL)).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SanatoriumItems.MITHRIL_PLATE.get())
                .pattern("PP")
                .pattern("PP")
                .define('P', SanatoriumItems.MITHRIL.get())
                .unlockedBy("has_mithril", has(SanatoriumItems.MITHRIL)).save(recipeOutput);



        //cooking items comida ////////// mudar id de item resultante para resultado de comida igual


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(SanatoriumItems.RAW_MONSTER_DRUMSTICK.get()),RecipeCategory.FOOD,
                SanatoriumItems.COOKED_MONSTER_DRUMSTICK.get(), 0.55f, 100)
                        .unlockedBy("has_raw_monster_drumstick", has(SanatoriumItems.RAW_MONSTER_DRUMSTICK.get())).
                save(recipeOutput,"cooked_monster_drumstick_from_smelting");



        SimpleCookingRecipeBuilder.smoking(Ingredient.of(SanatoriumItems.RAW_MONSTER_DRUMSTICK.get()),RecipeCategory.FOOD,
                SanatoriumItems.COOKED_MONSTER_DRUMSTICK.get(),055f,100)
                .unlockedBy("has_raw_monster_drumstick", has(SanatoriumItems.RAW_MONSTER_DRUMSTICK.get())).
                save(recipeOutput, "cooked_monster_drumstick_from_smoking");



        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(SanatoriumItems.RAW_MONSTER_DRUMSTICK.get()),RecipeCategory.FOOD,
                SanatoriumItems.COOKED_MONSTER_DRUMSTICK.get(),0.55f, 600 )
                .unlockedBy("has_raw_monster_drumstick", has(SanatoriumItems.RAW_MONSTER_DRUMSTICK.get())).
                save(recipeOutput,"cooked_monster_drumstick_from_campfire_cooking");



        //ore smelting minerios derretimento //////////


        oreSmelting(recipeOutput, MITHRIL_SMELTABLES, RecipeCategory.MISC, SanatoriumItems.MITHRIL.get(), 1f, 200, "mithril");
        oreBlasting(recipeOutput, MITHRIL_SMELTABLES, RecipeCategory.MISC, SanatoriumItems.MITHRIL.get(),1f, 100, "mithril");












    }
}




