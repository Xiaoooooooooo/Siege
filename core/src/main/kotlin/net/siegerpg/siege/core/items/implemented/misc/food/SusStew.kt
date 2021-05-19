package net.siegerpg.siege.core.items.implemented.misc.food

import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.misc.CustomFood
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class SusStew() : CustomFood(
    name = "Suspicious Stew",
    customModelData = 310015,
    description = listOf("Looks just like my grandma's goulash!"),
    levelRequirement = 0,
    material = Material.SUSPICIOUS_STEW,
    recipeList = recipes {

    },
    health = 30,
) {

    constructor(quality: Int): this() {
        this.quality = quality
        this.rarity = Rarity.getFromInt(quality)
        this.serialize()
    }

    constructor(item: ItemStack): this() {
        this.item = item
        this.deserialize()
    }

}