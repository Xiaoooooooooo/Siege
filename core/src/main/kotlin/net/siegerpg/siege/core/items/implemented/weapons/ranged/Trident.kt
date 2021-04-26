package net.siegerpg.siege.core.items.implemented.weapons.melee

import com.sk89q.worldedit.world.item.ItemTypes.CROSSBOW
import net.siegerpg.siege.core.items.CustomItemUtils
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.implemented.misc.materials.mobDrops.*
import net.siegerpg.siege.core.items.implemented.misc.materials.blockDrops.*
import net.siegerpg.siege.core.items.recipes.recipes
import net.siegerpg.siege.core.items.types.weapons.CustomBow
import net.siegerpg.siege.core.items.types.weapons.CustomMeleeWeapon
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class Trident() : CustomBow(
    name = "Trident",
    customModelData = 0,
    description = listOf("Poesiden's fork"),
    levelRequirement = 34,
    material = Material.TRIDENT,
    baseStats = CustomItemUtils.statMap(strength = 25.0, luck = 17.0),
    recipeList = recipes {
    },
) {

    constructor(quality: Int): this() {
        this.quality = quality
        this.rarity = Rarity.getFromInt(quality)
    }

    constructor(item: ItemStack): this() {
        this.item = item
        deserialize()
    }

}