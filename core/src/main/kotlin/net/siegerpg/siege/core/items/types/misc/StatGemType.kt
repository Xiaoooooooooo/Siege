package net.siegerpg.siege.core.items.types.misc

import net.kyori.adventure.text.format.Style
import net.kyori.adventure.text.format.TextDecoration
import net.siegerpg.siege.core.items.CustomItem
import net.siegerpg.siege.core.items.enums.ItemTypes
import net.siegerpg.siege.core.items.enums.Rarity
import net.siegerpg.siege.core.items.enums.StatTypes
import net.siegerpg.siege.core.items.getNbtTag
import net.siegerpg.siege.core.items.recipes.CustomRecipeList
import net.siegerpg.siege.core.items.setNbtTags
import net.siegerpg.siege.core.utils.Utils
import org.bukkit.Material
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ItemStack

abstract class StatGemType(
    override val name: String,
    override val customModelData: Int? = null,
    override val levelRequirement: Int? = null,
    override val description: List<String>,
    override val material: Material,
    final override var quality: Int = -1,
    override var item: ItemStack = ItemStack(material),
    override val type: ItemTypes = ItemTypes.STATGEM,
    override val recipeList: CustomRecipeList? = null,
    val statType: StatTypes
) : CustomItem {

    override var rarity: Rarity = Rarity.COMMON

    open var statAmount: Double = 0.0
        set(value) {
            field = value
            this.serialize()
        }

    init {
        this.rarity = Rarity.getFromInt(this.quality)
    }

    override fun serialize() {
        super.serialize()
        item = item.setNbtTags(
            "statGemTypeStat" to statType,
            "statGemTypeAmount" to statAmount
        )
    }
    override fun deserialize() {
        super.deserialize()
        item.getNbtTag<Double>("statGemTypeAmount")?.let {
            statAmount = it
        }
    }

    override fun updateMeta(hideRarity: Boolean): ItemStack {

        val meta = item.itemMeta

        val shownRarity = if (hideRarity) Rarity.UNCOMMON else rarity

        meta.displayName(Utils.lore(if (shownRarity == Rarity.SPECIAL) "<r><rainbow><b>$name</b></rainbow>" else "<r>${shownRarity.color}$name"))

        val newLore =
            mutableListOf(Utils.lore(if (shownRarity == Rarity.SPECIAL) "<r><rainbow><b>${shownRarity.id}</b></rainbow> <gray>${if (hideRarity) 50 else quality}%" else "<r>${shownRarity.color}${shownRarity.id} <gray>${if (hideRarity) 50 else quality}%"))
        newLore.add(Utils.lore(" "))
        newLore.add(Utils.lore("<r><color:#FF3CFF>+${statAmount} <light_purple>${statType.stylizedName} Gem"))
        newLore.add(Utils.lore(" "))
        description.forEach {
            newLore.add(Utils.lore("<r><dark_gray>$it"))
        }
        newLore.add(Utils.lore(" "))
        newLore.add(Utils.lore("<r><gray>Level: $levelRequirement"))
        if (hideRarity) newLore.add(Utils.lore("<r><red>This is not the real item"))
        meta.lore(newLore)

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE)
        item.itemMeta = meta
        return item
    }

}