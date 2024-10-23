package net.TheBlindBandit6.ShrinkRay.datagen;

import net.TheBlindBandit6.ShrinkRay.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //Generates the item recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SHRINK_RAY.get(), 1)
                .group("rays")
                .pattern("INI")
                .pattern("OXS")
                .pattern("IRI")
                .define('I', Items.COPPER_INGOT)
                .define('N', Items.NETHER_STAR)
                .define('O', Blocks.OBSERVER)
                .define('X', Items.POPPED_CHORUS_FRUIT)
                .define('S', Blocks.CHISELED_COPPER)
                .define('R', Blocks.REPEATER)
                .unlockedBy("has_nether_star", has(Items.NETHER_STAR)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ENLARGE_RAY.get(), 1)
                .group("rays")
                .pattern("INI")
                .pattern("OXS")
                .pattern("ICI")
                .define('I', Items.COPPER_INGOT)
                .define('N', Items.NETHER_STAR)
                .define('O', Blocks.OBSERVER)
                .define('X', Items.POPPED_CHORUS_FRUIT)
                .define('S', Blocks.CHISELED_COPPER)
                .define('C', Blocks.COMPARATOR)
                .unlockedBy("has_nether_star", has(Items.NETHER_STAR)).save(recipeOutput);
    }
}
