package net.siegerpg.siege.core.items.implemented.misc.food

import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.misc.CustomFood
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class Beetroot() : CustomFood(
    name = "Beetroot",
    customModelData = 330004,
    description = listOf("The fruit can take a beating"),
    levelRequirement = 0,
    material = Material.BEETROOT, //change this to cooked chicken later
    potion = listOf(
        PotionEffect(PotionEffectType.REGENERATION, 100, 1),
        PotionEffect(PotionEffectType.HUNGER, 200, 1))
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