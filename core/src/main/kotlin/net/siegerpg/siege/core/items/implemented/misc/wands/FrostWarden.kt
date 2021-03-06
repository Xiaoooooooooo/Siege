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

class FrostWarden() : CustomWand(
    name = "Frost Warden",
    customModelData = 140014,
    description = listOf("Command the ice","and shoot it!"),
    levelRequirement = 60,
    material = Material.WOODEN_HOE,
    baseStats = CustomItemUtils.statMap(strength = 90.0, toughness = 50.0, luck = -100.0, regeneration = -20.0),
    range = 22,
    red = 70,
    green = 215,
    blue = 230,
    damageRadius = 2.0
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