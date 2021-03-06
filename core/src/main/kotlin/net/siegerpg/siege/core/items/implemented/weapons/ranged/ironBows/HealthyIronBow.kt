package net.siegerpg.siege.core.items.implemented.weapons.ranged.ironBows

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.PlantMatter
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.RefinedMetal
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.Vine
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.weapons.CustomBow
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class HealthyIronBow() : CustomBow(
    name = "Healthy Iron Bow",
    customModelData = 120008,
    description = listOf("Heavy and durable"),
    levelRequirement = 34,
    material = Material.BOW,
    baseStats = CustomItemUtils.statMap(strength = 30.0, luck = 12.0, health = 20.0),
    recipeList = recipes {
        recipe {
            shaped = true
            s1(Vine.tier(3))
            s2(Vine.tier(3))
            s3(Vine.tier(3))
            s4(RefinedMetal.tier(3))
            s5(PlantMatter.tier(3))
            s6(PlantMatter.tier(3))
            s7(PlantMatter.tier(3))
            item { player, b ->
                val newItem = HealthyIronBow(if (b) 50 else Utils.randRarity())
                newItem.updateMeta(b)
                newItem
            }
        }
    },
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