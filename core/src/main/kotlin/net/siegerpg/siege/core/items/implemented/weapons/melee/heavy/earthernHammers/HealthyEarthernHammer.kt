package net.siegerpg.siege.core.items.implemented.weapons.melee.heavy.earthernHammers

import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.PlantMatter
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.Stick
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.weapons.CustomMeleeWeapon
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class HealthyEarthernHammer() : CustomMeleeWeapon(
    name = "Healthy Earthern Hammer",
    customModelData = 130010,
    description = listOf("Let's go clobbing!"),
    levelRequirement = 39,
    material = Material.WOODEN_AXE,
    baseStats = CustomItemUtils.statMap(strength = 65.0, health = 7.0),
    recipeList = recipes {
        recipe {
            shaped = true
            s1(PlantMatter.tier(4))
            s2(Stick.tier(3))
            s3(Stick.tier(3))
            s4(Stick.tier(3))
            s5(PlantMatter.tier(3))
            s6(PlantMatter.tier(3))
            s7(PlantMatter.tier(3))
            s8(PlantMatter.tier(3))
            item { player, b ->
                val newItem = HealthyEarthernHammer(if (b) 50 else Utils.randRarity())
                newItem.updateMeta(b)
                newItem
            }
        }
    },
    attackSpeed = 0.7
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