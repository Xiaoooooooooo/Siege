package net.siegerpg.siege.core.items.implemented.armor.leggings.woolLeggings

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.Wheat
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.Wool
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.armor.CustomLeggings
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Color
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class HealingWoolLeggings() : CustomLeggings(
    name = "Healing Wool Leggings",
    customModelData = 1,
    description = listOf("Dressed for the winter"),
    levelRequirement = 9,
    material = Material.LEATHER_LEGGINGS,
    baseStats = CustomItemUtils.statMap(health = 6.0, regeneration = 7.0),
    recipeList = recipes {
        recipe {
            shaped = true
            s1(Wool.tier(2))
            s2(Wool.tier(2))
            s3(Wool.tier(2))
            s4(Wool.tier(2))
            s6(Wheat.tier(2))
            s7(Wheat.tier(2))
            s9(Wheat.tier(2))
            item { player, b ->
                val newItem = HealingWoolLeggings(if (b) 50 else Utils.randRarity())
                newItem.updateMeta(b)
                newItem
            }
        }
    },
    leatherColor = Color.WHITE
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