package net.siegerpg.siege.core.items.implemented.weapons.ranged.pebbleShooters

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.Pebble
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.Stick
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.Vine
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.Wheat
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.weapons.CustomBow
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class HealingPebbleShooter() : CustomBow(
    name = "Healing Pebble Shooter",
    customModelData = 120003,
    description = listOf("Now comes with pebble", "shooting support!"),
    levelRequirement = 10,
    material = Material.BOW,
    baseStats = CustomItemUtils.statMap(strength = 18.0, regeneration = 5.0),
    recipeList = recipes {
        recipe {
            shaped = true
            s1(Stick.tier(3))
            s2(Stick.tier(3))
            s3(Pebble.tier(3))
            s4(Vine.tier(3))
            s5(Wheat.tier(3))
            s6(Wheat.tier(3))
            item { player, b ->
                val newItem = HealingPebbleShooter(if (b) 50 else Utils.randRarity())
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