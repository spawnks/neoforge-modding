package com.sanatorium.sanatoriummod.items;

import com.sanatorium.sanatoriummod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier MITHRIL = new SimpleTier(ModTags.Blocks.INCORRECT_fOR_MITHRIL_TOOL,
            1800, 8.0f, 3f, 16, () -> Ingredient.of(SanatoriumItems.MITHRIL));
}
