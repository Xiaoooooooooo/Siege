package net.siegerpg.siege.core.items.implemented.armor.leggings.boneLeggings

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.PlantMatter
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.Bone
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.armor.CustomLeggings
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Color
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class HealthyBoneLeggings() : CustomLeggings(
    name = "Healthy Bone Leggings",
    customModelData = 1,
    description = listOf("Protects your bone...s"),
    levelRequirement = 24,
    material = Material.LEATHER_LEGGINGS,
    baseStats = CustomItemUtils.statMap(health = 35.0),
    leatherColor = Color.GRAY
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