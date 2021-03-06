package net.siegerpg.siege.core.drops.mobs.twilight.bosses;

import net.siegerpg.siege.core.drops.MobDropTable;
import net.siegerpg.siege.core.drops.Reward;
import net.siegerpg.siege.core.items.implemented.misc.food.GoldenCarrot;
import net.siegerpg.siege.core.items.implemented.misc.keys.TwilightDungeonKey;
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.Bone;
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.Leather;
import net.siegerpg.siege.core.items.implemented.misc.statgems.healthGems.PristineHealthGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.healthGems.SimpleHealthGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.regenerationGems.PolishedRegenerationGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.regenerationGems.SimpleRegenerationGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.strengthGems.SimpleStrengthGem;
import net.siegerpg.siege.core.items.implemented.weapons.melee.heavy.DoubleBladedAxe;
import net.siegerpg.siege.core.items.implemented.weapons.ranged.LuminousBow;
import net.siegerpg.siege.core.utils.Utils;

public class Unicorn extends MobDropTable {
    public Unicorn() {
        super("Unicorn", 400, 600, 900, 1000, new Reward[]{
                new Reward(new LuminousBow(Utils.randRarity()).getUpdatedItem(false), 25.0),
                new Reward(Bone.Companion.tier(3).getUpdatedItem(false).asQuantity(16), 50.0),
                new Reward(Bone.Companion.tier(4).getUpdatedItem(false).asQuantity(4), 50.0),
                new Reward(Leather.Companion.tier(3).getUpdatedItem(false).asQuantity(16), 50.0),
                new Reward(new GoldenCarrot(100).getUpdatedItem(false).asQuantity(4), 100.0),
                new Reward(new PristineHealthGem(0).getUpdatedItem(false), 20.0),
                new Reward(new PolishedRegenerationGem(0).getUpdatedItem(false), 20.0),
                new Reward(new TwilightDungeonKey(0).getUpdatedItem(false), 100.0)
        });
    }
}