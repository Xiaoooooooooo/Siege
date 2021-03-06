package net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks

import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.misc.CustomMaterial
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class RefinedMetal() : CustomMaterial(
    name = "Refined Metal",
    customModelData = 320009,
    description = listOf("Polished and shiny!"),
    levelRequirement = 0,
    material = Material.FLINT,
    recipeList = recipes {
        recipe {
            shaped = false
            s1(MetalScrap())
            item { player, b ->
                RefinedMetal()
            }
        }
    }
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

    companion object {
        fun tier(tier: Int): RefinedMetal {
            val newItem = RefinedMetal(0)
            newItem.tier = tier
            return newItem
        }
    }

}