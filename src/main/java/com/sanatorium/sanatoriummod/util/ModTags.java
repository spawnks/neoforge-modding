package com.sanatorium.sanatoriummod.util;

import com.sanatorium.sanatoriummod.SanatoriumMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

       public static final TagKey<Block> NEEDS_MITHRIL_TOOL = createtag("needs_mithril_tool");
       public static final TagKey<Block> INCORRECT_fOR_MITHRIL_TOOL = createtag("incorrect_for_mithril_tool");






        private static TagKey<Block> createtag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SanatoriumMod.MOD_ID, name));
        }
    }
}
