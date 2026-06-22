package com.sanatorium.sanatoriummod.datagen;

import com.sanatorium.sanatoriummod.SanatoriumMod;
import com.sanatorium.sanatoriummod.block.Sanatoriumblocks;
import com.sanatorium.sanatoriummod.items.SanatoriumItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SanatoriumMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
         blockWithItem(Sanatoriumblocks.MITHRIL_BLOCK);
          blockWithItem(Sanatoriumblocks.MITHRIL_ORE);
          blockWithItem(Sanatoriumblocks.INFECTED_DEEPSLATE);
    }


   private void blockWithItem (DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
   }

}
