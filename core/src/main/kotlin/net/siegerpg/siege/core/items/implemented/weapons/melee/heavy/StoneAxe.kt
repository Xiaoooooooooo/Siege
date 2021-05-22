package net.siegerpg.siege.core.items.implemented.weapons.melee.heavy

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.blocks.Pebble
import net.siegerpg.siege.core.items.implemented.misc.materials.blocks.Stick
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.weapons.CustomMeleeWeapon
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class StoneAxe() : CustomMeleeWeapon(
    name = "Stone Axe",
    customModelData = 130004,
    description = listOf("Commonly used for chopping trees"),
    levelRequirement = 15,
    material = Material.WOODEN_AXE,
    baseStats = CustomItemUtils.statMap(strength = 32.0),
    recipeList = recipes {
        recipe {
            shaped = true
            s1(Pebble.tier(3))
            s2(Pebble.tier(3))
            s4(Pebble.tier(3))
            s5(Stick.tier(3))
            s8(Stick.tier(3))
            item { player, b ->
                val newItem = StoneAxe(if (b) 50 else Utils.randRarity())
                newItem.updateMeta(b)
                newItem
            }
        }
        recipe {
            shaped = true
            s2(Pebble.tier(3))
            s3(Pebble.tier(3))
            s5(Pebble.tier(3))
            s6(Stick.tier(3))
            s9(Stick.tier(3))
            item { player, b ->
                val newItem = StoneAxe(if (b) 50 else Utils.randRarity())
                newItem.updateMeta(b)
                newItem
            }
        }
    },
    attackSpeed = 0.8
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