package com.sanatorium.sanatoriummod.datagen;

import com.sanatorium.sanatoriummod.SanatoriumMod;
import com.sanatorium.sanatoriummod.items.SanatoriumItems;
import com.sanatorium.sanatoriummod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SanatoriumMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {


 tag(ItemTags.SWORDS)
         .add(SanatoriumItems.MITHRIL_SWORD.get());
tag(ItemTags.AXES)
         .add(SanatoriumItems.MITHRIL_AXE.get());
tag(ItemTags.PICKAXES)
         .add(SanatoriumItems.MITHRIL_PICKAXE.get());
tag(ItemTags.SHOVELS)
         .add(SanatoriumItems.MITHRIL_SHOVEL.get());
tag(ItemTags.HOES)
         .add(SanatoriumItems.MITHRIL_HOE.get());























    }
}
