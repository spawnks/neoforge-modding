package com.sanatorium.sanatoriummod.datagen;

import com.sanatorium.sanatoriummod.SanatoriumMod;
import com.sanatorium.sanatoriummod.block.Sanatoriumblocks;
import com.sanatorium.sanatoriummod.items.SanatoriumItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

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

        simpleBlockItem(Sanatoriumblocks.INFECTED_DEEPSLATE.get());

        handheldItem(SanatoriumItems.MITHRIL_AXE);
        handheldItem(SanatoriumItems.MITHRIL_HOE);
        handheldItem(SanatoriumItems.MITHRIL_SWORD);
        handheldItem(SanatoriumItems.MITHRIL_PICKAXE);
        handheldItem(SanatoriumItems.MITHRIL_SHOVEL);

        handheldItem(SanatoriumItems.MITHRIL_BOOTS);
        handheldItem(SanatoriumItems.MITHRIL_LEGGINGS);
        handheldItem(SanatoriumItems.MITHRIL_CHESTPLATE);
        handheldItem(SanatoriumItems.MITHRIL_HELMET);



    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SanatoriumMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}


