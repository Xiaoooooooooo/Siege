package net.siegerpg.siege.core.items.implemented.armor.chestplate.boneChestplates

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.Bone
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.Feather
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.armor.CustomChestplate
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Color
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class LuckyBoneChestplate() : CustomChestplate(
    name = "Lucky Bone Chestplate",
    customModelData = 1,
    description = listOf("Spare ribs"),
    levelRequirement = 24,
    material = Material.LEATHER_CHESTPLATE,
    baseStats = CustomItemUtils.statMap(health = 25.0, toughness = 50.0, luck = 6.0),
    recipeList = recipes {
        recipe {
            shaped = true
            s1(Bone.tier(2))
            s3(Bone.tier(2))
            s4(Bone.tier(2))
            s5(Bone.tier(2))
            s6(Feather.tier(2))
            s7(Feather.tier(2))
            s8(Feather.tier(2))
            s9(Feather.tier(2))
            item { player, b ->
                val newItem = LuckyBoneChestplate(if (b) 50 else Utils.randRarity())
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