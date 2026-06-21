package com.sanatorium.sanatoriummod.datagen;

import com.sanatorium.sanatoriummod.block.Sanatoriumblocks;
import com.sanatorium.sanatoriummod.items.SanatoriumItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.server.ReloadableServerRegistries;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModLootTableProvider extends BlockLootSubProvider {
    protected ModLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(Sanatoriumblocks.MITHRIL_BLOCK.get());

        add(Sanatoriumblocks.MITHRIL_ORE.get(),
                block -> createOreDrop(Sanatoriumblocks.MITHRIL_ORE.get(), SanatoriumItems.RAW_MITHRIL.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Sanatoriumblocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}

