package net.siegerpg.siege.core.items.implemented.misc.tools

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.misc.CustomTool
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemStack

class IronAxe() : CustomTool(
    name = "Iron Axe",
    customModelData = 430007,
    description = listOf("Industrializing!"),
    levelRequirement = 23,
    material = Material.IRON_AXE,
    baseStats = CustomItemUtils.statMap(),
    recipeList = recipes {

    },
    enchantments = hashMapOf(
    )
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