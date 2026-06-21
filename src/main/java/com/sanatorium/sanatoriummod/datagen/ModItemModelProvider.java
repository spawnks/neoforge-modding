package com.sanatorium.sanatoriummod.datagen;

import com.sanatorium.sanatoriummod.SanatoriumMod;
import com.sanatorium.sanatoriummod.items.SanatoriumItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SanatoriumMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(SanatoriumItems.RAW_MITHRIL.get());
        basicItem(SanatoriumItems.MITHRIL.get());
        basicItem(SanatoriumItems.MITHRIL_PLATE.get());
        basicItem(SanatoriumItems.COOKED_MONSTER_DRUMSTICK.get());



    }
}


