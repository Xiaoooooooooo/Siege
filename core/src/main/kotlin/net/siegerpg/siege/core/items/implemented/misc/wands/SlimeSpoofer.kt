package net.siegerpg.siege.core.items.implemented.misc.wands

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.misc.CustomWand
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class SlimeSpoofer() : CustomWand(
    name = "Slime Spoofer",
    customModelData = 140004,
    description = listOf("Made from the life force of slimes"),
    levelRequirement = 11,
    material = Material.WOODEN_HOE,
    baseStats = CustomItemUtils.statMap(strength = 12.0, luck = 8.0),
    range = 10,
    red = 153,
    green = 255,
    blue = 51,
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