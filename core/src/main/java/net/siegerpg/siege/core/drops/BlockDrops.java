package net.siegerpg.siege.core.drops;

import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.*;
import net.siegerpg.siege.core.items.implemented.misc.wands.LivingTwig;
import net.siegerpg.siege.core.utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public enum BlockDrops {

    /**
     * Waiting on Ghost to fix Class.tier(int) to use for the item objects
     */

    //WOOD
    SPRUCE_LOG(Material.SPRUCE_LOG, new Object[][]{
            {Stick.Companion.tier(1).getUpdatedItem(false), 100.0},
            {new LivingTwig(Utils.randRarity()).getUpdatedItem(false), 1.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20),
    SPRUCE_WOOD(Material.SPRUCE_WOOD, new Object[][]{
            {Stick.Companion.tier(1).getUpdatedItem(false), 100.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20),

    //DIRT TERRAIN
    GRASS_BLOCK(Material.GRASS_BLOCK, new Object[][]{
            {PlantMatter.Companion.tier(1).getUpdatedItem(false), 20.0},
            {Seed.Companion.tier(1).getUpdatedItem(false), 20.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20),
    GREEN_TERRACOTTA(Material.GREEN_TERRACOTTA, new Object[][]{
            {PlantMatter.Companion.tier(1).getUpdatedItem(false), 25.0},
            {Seed.Companion.tier(1).getUpdatedItem(false), 35.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20),
    GREEN_CONCRETE(Material.GREEN_CONCRETE, new Object[][]{
            {PlantMatter.Companion.tier(1).getUpdatedItem(false), 35.0},
            {Seed.Companion.tier(1).getUpdatedItem(false), 25.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20),
    LIME_TERRACOTTA(Material.LIME_TERRACOTTA, new Object[][]{
            {PlantMatter.Companion.tier(1).getUpdatedItem(false), 40.0},
            {Seed.Companion.tier(1).getUpdatedItem(false), 40.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20),
    DIRT(Material.DIRT, new Object[][]{
            {Pebble.Companion.tier(1).getUpdatedItem(false), 20.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20),
    COARSE_DIRT(Material.COARSE_DIRT, new Object[][]{
            {Pebble.Companion.tier(1).getUpdatedItem(false), 30.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20),

    //STONE TERRAIN
    STONE(Material.STONE, new Object[][]{
            {Pebble.Companion.tier(1).getUpdatedItem(false), 100.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20),
    LIGHT_GRAY_CONCRETE(Material.LIGHT_GRAY_CONCRETE, new Object[][]{
            {Pebble.Companion.tier(1).getUpdatedItem(false), 30.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20),
    ANDESITE(Material.ANDESITE, new Object[][]{
            {Pebble.Companion.tier(1).getUpdatedItem(false), 40.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20),

    //ORES
    COAL_ORE(Material.COAL_ORE, new Object[][]{
            {Coal.Companion.tier(1).getUpdatedItem(false), 100.0}
    }, new Integer[]{0, 0}, new Integer[]{1, 4}, 100),
    IRON_ORE(Material.IRON_ORE, new Object[][]{
            {MetalScrap.Companion.tier(1).getUpdatedItem(false), 100.0}
    }, new Integer[]{4, 8}, new Integer[]{0, 0}, 200),

    //DECOR TERRAIN
    VINE(Material.VINE, new Object[][]{
            {Vine.Companion.tier(1).getUpdatedItem(false), 100.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20),
    CHAIN(Material.CHAIN, new Object[][]{
            {Chain.Companion.tier(1).getUpdatedItem(false), 100.0}
    }, new Integer[]{0, 0}, new Integer[]{0, 0}, 20);

    private final Material block;
    private final Object[][] rewards;
    private final Integer[] numGold;
    private final Integer[] numExp;
    private final Integer regenTime;

    BlockDrops(Material block, Object[][] rewards, Integer[] numGold, Integer[] numExp, Integer regenTime) {
        this.block = block;
        this.rewards = rewards;
        this.numGold = numGold;
        this.numExp = numExp;
        this.regenTime = regenTime;
    }

    public static boolean containsBlockDrops(String str) {
        for (BlockDrops blocks : BlockDrops.values()) {
            if (blocks.name().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static BlockDrops matchCaseBlockDrops(String str) {
        for (BlockDrops blocks : BlockDrops.values()) {
            if (blocks.name().equalsIgnoreCase(str)) {
                return blocks;
            }
        }
        return null;
    }

    public ArrayList<ItemStack> getRewards(Double luckChance) {
        ArrayList<ItemStack> itemList = new ArrayList<>();
        for (Object[] reward : rewards) {
            if (Utils.randTest((Double) reward[1])) {
                if ((Math.random() * 100) <= luckChance) {
                    itemList.add((ItemStack) reward[0]);
                }
                itemList.add((ItemStack) reward[0]);
            }
        }
        return itemList;
    }

    public Material getBlock() { return block; }
    public Integer getGold(boolean rand) {
        if (rand) {
            double randomGold = (Math.random() * numGold[1]) + numGold[0];
            return (int) Math.round(randomGold);
        }
        return numGold[1];
    }
    public Integer getExp(boolean rand) {
        if (rand) {
            double randomExp = (Math.random() * numExp[1]) + numExp[0];
            return (int) Math.round(randomExp);
        }
        return numExp[1];
    }
    public Integer getRegenTime() { return regenTime; }
}