package com.sanatorium.sanatoriummod.items;

import com.sanatorium.sanatoriummod.SanatoriumMod;
import com.sanatorium.sanatoriummod.block.Sanatoriumblocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SanatoriumMod.MOD_ID);



    public static final Supplier<CreativeModeTab> SANATORIUM_ITEMS_TAB = CREATIVE_MODE_TAB.register( "sanatorium_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SanatoriumItems.MITHRIL.get()))
                    .title(Component.translatable("creativetab.sanatoriummod"))
                    .displayItems((ItemDisplayParameters, output) -> {

                        output.accept(SanatoriumItems.MITHRIL);
                        output.accept(SanatoriumItems.RAW_MITHRIL);
                        output.accept(Sanatoriumblocks.MITHRIL_BLOCK);
                        output.accept(Sanatoriumblocks.MITHRIL_ORE);
                        output.accept(SanatoriumItems.MITHRIL_PLATE);
                        output.accept(SanatoriumItems.COOKED_MONSTER_DRUMSTICK);
                        output.accept(SanatoriumItems.RAW_MONSTER_DRUMSTICK);




                    }
                            )
                    .build());



    public static void register(IEventBus eventBus){
     CREATIVE_MODE_TAB.register(eventBus);
 }






}
