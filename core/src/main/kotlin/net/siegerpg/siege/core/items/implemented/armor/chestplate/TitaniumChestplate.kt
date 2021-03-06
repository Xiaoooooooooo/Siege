package net.siegerpg.siege.core.items.implemented.armor.chestplate

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.Bone
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.armor.CustomChestplate
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Color
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class TitaniumChestplate() : CustomChestplate(
    name = "Titanium Chestplate",
    customModelData = 1,
    description = listOf("One of the hardest","materials known"),
    levelRequirement = 50,
    material = Material.IRON_CHESTPLATE,
    baseStats = CustomItemUtils.statMap(health = 80.0, toughness = 300.0, regeneration = 15.0, luck = -35.0, strength = -50.0),
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