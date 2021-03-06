package net.siegerpg.siege.core.items.implemented.armor.helmet.chainHelmets

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.Chain
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.armor.CustomHelmet
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class ToughChainHelmet() : CustomHelmet(
    name = "Tough Chain Helmet",
    customModelData = 1,
    description = listOf("Top heavy"),
    levelRequirement = 29,
    material = Material.CHAINMAIL_HELMET,
    baseStats = CustomItemUtils.statMap(health = 20.0, toughness = 40.0),
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