package com.sanatorium.sanatoriummod.block;


import com.sanatorium.sanatoriummod.SanatoriumMod;
import com.sanatorium.sanatoriummod.block.custom.MithrilOre;
import com.sanatorium.sanatoriummod.items.SanatoriumItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class Sanatoriumblocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SanatoriumMod.MOD_ID);



    public static final DeferredBlock<MithrilOre> MITHRIL_ORE = registerBlock("mithril_ore",
            () -> new MithrilOre(UniformInt.of (2, 6),
                    BlockBehaviour.Properties.of()
                            .explosionResistance(1500)
                            .strength(15f)
                            .sound(SoundType.DEEPSLATE)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(MithrilOre.LIGHT_LEVEL))));


    public static final DeferredBlock<Block> MITHRIL_BLOCK = registerBlock("mithril_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .explosionResistance(1500)
                    .strength(15f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    private static <T extends Block> DeferredBlock <T> registerBlock (String name, Supplier <T> block) {
        DeferredBlock <T> toreturn = BLOCKS.register(name, block);
        registerBlockItem(name, toreturn);
        return toreturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        SanatoriumItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
         BLOCKS.register(eventBus);
     }


}

