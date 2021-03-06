package net.siegerpg.siege.core.drops.mobs.twilight.hostile;

import net.siegerpg.siege.core.drops.MobDropTable;
import net.siegerpg.siege.core.drops.Reward;
import net.siegerpg.siege.core.items.implemented.misc.keys.TwilightDungeonKey;
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.*;
import net.siegerpg.siege.core.items.implemented.misc.statgems.healthGems.FlawedHealthGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.healthGems.SimpleHealthGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.luckGems.FlawedLuckGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.regenerationGems.FlawedRegenerationGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.regenerationGems.SimpleRegenerationGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.strengthGems.SimpleStrengthGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.toughGems.FlawedToughGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.toughGems.SimpleToughGem;
import net.siegerpg.siege.core.items.implemented.weapons.melee.light.CursedSickle;
import net.siegerpg.siege.core.utils.Utils;


public class Corrupted_Skeleton extends MobDropTable {
    public Corrupted_Skeleton() {
        super("Corrupted_Skeleton", 200, 300, 250, 350, new Reward[]{
                new Reward(CorruptCrystal.Companion.tier(1).getUpdatedItem(false).asQuantity(4), 25.0),
                new Reward(CorruptCrystal.Companion.tier(2).getUpdatedItem(false), 5.0),
                new Reward(CursedBone.Companion.tier(1).getUpdatedItem(false).asQuantity(16), 25.0),
                new Reward(CursedBone.Companion.tier(2).getUpdatedItem(false).asQuantity(4), 5.0),

                new Reward(new SimpleHealthGem(0).getUpdatedItem(false), 1.0),
                new Reward(new SimpleToughGem(0).getUpdatedItem(false), 0.5),
                new Reward(new CursedSickle(Utils.randRarity()).getUpdatedItem(false), 5.0),
                new Reward(new TwilightDungeonKey(0).getUpdatedItem(false), 1.0)
        });
    }
}
