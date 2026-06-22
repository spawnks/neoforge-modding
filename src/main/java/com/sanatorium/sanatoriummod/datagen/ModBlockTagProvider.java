package com.sanatorium.sanatoriummod.datagen;

import com.mojang.datafixers.types.templates.Tag;
import com.sanatorium.sanatoriummod.SanatoriumMod;
import com.sanatorium.sanatoriummod.block.Sanatoriumblocks;
import com.sanatorium.sanatoriummod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.html.HTML;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SanatoriumMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
       tag(BlockTags.MINEABLE_WITH_PICKAXE)
               .add(Sanatoriumblocks.MITHRIL_ORE.get())
               .add(Sanatoriumblocks.MITHRIL_BLOCK.get())
               .add(Sanatoriumblocks.INFECTED_DEEPSLATE.get());


       tag(BlockTags.NEEDS_DIAMOND_TOOL)
               .add(Sanatoriumblocks.MITHRIL_ORE.get())
               .add(Sanatoriumblocks.MITHRIL_BLOCK.get());

        tag(ModTags.Blocks.NEEDS_MITHRIL_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_fOR_MITHRIL_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_MITHRIL_TOOL);








    }
}
