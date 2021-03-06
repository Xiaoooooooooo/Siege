package net.siegerpg.siege.core.items.implemented.misc.wands

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.Coal
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.PlantMatter
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.Seed
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.misc.CustomWand
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class CrystalCane() : CustomWand(
    name = "Crystal Cane",
    customModelData = 140012,
    description = listOf("Old person reference"),
    levelRequirement = 47,
    material = Material.WOODEN_HOE,
    baseStats = CustomItemUtils.statMap(strength = 40.0, toughness = -100.0, health = -80.0, regeneration = -20.0),
    range = 16,
    red = 127,
    green = 194,
    blue = 199,
    damageRadius = 4.0
) {

    constructor(quality: Int): this() {
        this.quality = quality
        this.rarity = Rarity.getFromInt(quality)
        this.serialize()
    }

    constructor(item: ItemStack): this() {
        this.item = item
        deserialize()
    }

}