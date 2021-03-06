package net.siegerpg.siege.shops.shop

import net.siegerpg.siege.core.items.implemented.misc.materials.*
import net.siegerpg.siege.core.items.implemented.weapons.melee.light.Dagger
import net.siegerpg.siege.core.items.implemented.weapons.melee.light.Shank
import net.siegerpg.siege.core.items.implemented.weapons.melee.light.WoodenSword
import net.siegerpg.siege.core.items.implemented.weapons.melee.light.daggers.*
import net.siegerpg.siege.core.items.implemented.weapons.melee.light.shanks.*
import net.siegerpg.siege.core.items.implemented.weapons.melee.light.woodenSwords.*
import net.siegerpg.siege.core.utils.*
import net.siegerpg.siege.shops.*

class Barney : Shop() {
    override var name: String = "Barney"
    override var permission: String = "siege.shops.shop.barney"
    override var items: List<ShopItem> = listOf(
    //SHANK
        ShopItem(Shank(-1), 1500, hashMapOf(), false) {
            Shank(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(GRAYFILLER(-1), -1, hashMapOf(), false) {
            GRAYFILLER(-1).getUpdatedItem(false)
        },
        ShopItem(LuckyShank(-1), 1750, hashMapOf(), false) {
            LuckyShank(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(StrongShank(-1), 1750, hashMapOf(), false) {
            StrongShank(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(ToughShank(-1), 1750, hashMapOf(), false) {
            ToughShank(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(HealthyShank(-1), 1750, hashMapOf(), false) {
            HealthyShank(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(HealingShank(-1), 1750, hashMapOf(), false) {
            HealingShank(Utils.randRarity()).getUpdatedItem(false)
        },

        //DAGGERS
        ShopItem(Dagger(-1), 2000, hashMapOf(), false) {
            Dagger(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(GRAYFILLER(-1), -1, hashMapOf(), false) {
            GRAYFILLER(-1).getUpdatedItem(false)
        },
        ShopItem(LuckyDagger(-1), 2250, hashMapOf(), false) {
            LuckyDagger(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(StrongDagger(-1), 2250, hashMapOf(), false) {
            StrongDagger(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(ToughDagger(-1), 2250, hashMapOf(), false) {
            ToughDagger(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(HealthyDagger(-1), 2250, hashMapOf(), false) {
            HealthyDagger(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(HealingDagger(-1), 2250, hashMapOf(), false) {
            HealingDagger(Utils.randRarity()).getUpdatedItem(false)
        },

        //WOODEN SWORDS
        ShopItem(WoodenSword(-1), 2500, hashMapOf(), false) {
            WoodenSword(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(GRAYFILLER(-1), -1, hashMapOf(), false) {
            GRAYFILLER(-1).getUpdatedItem(false)
        },
        ShopItem(LuckyWoodenSword(-1), 2750, hashMapOf(), false) {
            LuckyWoodenSword(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(StrongWoodenSword(-1), 2750, hashMapOf(), false) {
            StrongWoodenSword(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(ToughWoodenSword(-1), 2750, hashMapOf(), false) {
            ToughWoodenSword(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(HealthyWoodenSword(-1), 2750, hashMapOf(), false) {
            HealthyWoodenSword(Utils.randRarity()).getUpdatedItem(false)
        },
        ShopItem(HealingWoodenSword(-1), 2750, hashMapOf(), false) {
            HealingWoodenSword(Utils.randRarity()).getUpdatedItem(false)
        },
    )
}