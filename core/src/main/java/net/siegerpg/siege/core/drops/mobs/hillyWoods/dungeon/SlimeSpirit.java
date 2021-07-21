package net.siegerpg.siege.core.drops.mobs.hillyWoods.dungeon;

import net.siegerpg.siege.core.drops.MobDropTable;
import net.siegerpg.siege.core.drops.Reward;
import net.siegerpg.siege.core.items.implemented.armor.boots.*;
import net.siegerpg.siege.core.items.implemented.armor.chestplate.*;
import net.siegerpg.siege.core.items.implemented.armor.helmet.*;
import net.siegerpg.siege.core.items.implemented.armor.leggings.*;
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.*;
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.*;
import net.siegerpg.siege.core.items.implemented.misc.wands.*;
import net.siegerpg.siege.core.items.implemented.weapons.ranged.*;
import net.siegerpg.siege.core.utils.Utils;

public class SlimeSpirit extends MobDropTable {
    public SlimeSpirit() {
        super("SlimeSpirit", 600, 700, 350, 450, new Reward[]{
                new Reward(Slime.Companion.tier(1).getUpdatedItem(false).asQuantity(6), 25.0),
                new Reward(Slime.Companion.tier(1).getUpdatedItem(false).asQuantity(6), 25.0),
                new Reward(Slime.Companion.tier(1).getUpdatedItem(false).asQuantity(6), 25.0),
                new Reward(Slime.Companion.tier(1).getUpdatedItem(false).asQuantity(6), 25.0),
                new Reward(Slime.Companion.tier(2).getUpdatedItem(false).asQuantity(4), 30.0),
                new Reward(Seed.Companion.tier(3).getUpdatedItem(false), 50.0),
                new Reward(new SlimeSpoofer(Utils.randRarity()).getUpdatedItem(false), 50.0),
                new Reward(new SlimyHelmet(Utils.randRarity()).getUpdatedItem(false), 30.0),
                new Reward(new SlimyChestplate(Utils.randRarity()).getUpdatedItem(false), 30.0),
                new Reward(new SlimyLeggings(Utils.randRarity()).getUpdatedItem(false), 30.0),
                new Reward(new SlimyBoots(Utils.randRarity()).getUpdatedItem(false), 30.0)
        });
    }
}