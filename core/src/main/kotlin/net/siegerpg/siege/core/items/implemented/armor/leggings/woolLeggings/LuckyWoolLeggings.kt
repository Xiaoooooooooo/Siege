package net.siegerpg.siege.core.items.implemented.armor.leggings.woolLeggings

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.Feather
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.Wool
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.armor.CustomLeggings
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Color
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class LuckyWoolLeggings() : CustomLeggings(
    name = "Lucky Wool Leggings",
    customModelData = 1,
    description = listOf("Dressed for the winter"),
    levelRequirement = 9,
    material = Material.LEATHER_LEGGINGS,
    baseStats = CustomItemUtils.statMap(health = 8.0, luck = 5.0, regeneration = 5.0),
    recipeList = recipes {
        recipe {
            shaped = true
            s1(Wool.tier(2))
            s2(Wool.tier(2))
            s3(Wool.tier(2))
            s4(Feather.tier(2))
            s6(Feather.tier(2))
            s7(Feather.tier(2))
            s9(Feather.tier(2))
            item { player, b ->
                val newItem = LuckyWoolLeggings(if (b) 50 else Utils.randRarity())
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