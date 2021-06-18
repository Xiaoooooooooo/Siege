package net.siegerpg.siege.core.items.implemented.armor.helmet.boneHelmets

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.Bone
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.armor.CustomHelmet
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Color
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class StrongBoneHelmet() : CustomHelmet(
    name = "Strong Bone Helmet",
    customModelData = 1,
    description = listOf("A second skull"),
    levelRequirement = 23,
    material = Material.LEATHER_HELMET,
    baseStats = CustomItemUtils.statMap(health = 15.0, strength = 8.0),
    recipeList = recipes {
        recipe {
            shaped = true
            s1(Bone.tier(2))
            s2(Bone.tier(2))
            s3(Bone.tier(2))
            s4(Bone.tier(2))
            s6(Bone.tier(2))
            s6(Bone.tier(2))
            item { player, b ->
                val newItem = StrongBoneHelmet(if (b) 50 else Utils.randRarity())
                newItem.updateMeta(b)
                newItem
            }
        }
    },
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