package net.siegerpg.siege.core.drops.mobs.hillyWoods.hostile;

import net.siegerpg.siege.core.drops.MobDropTable;
import net.siegerpg.siege.core.drops.Reward;
import net.siegerpg.siege.core.items.implemented.misc.food.*;
import net.siegerpg.siege.core.items.implemented.misc.keys.HillyWoodsDungeonKey;
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.*;
import net.siegerpg.siege.core.items.implemented.misc.statgems.healthGems.RawHealthGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.luckGems.CrackedLuckGem;
import net.siegerpg.siege.core.items.implemented.misc.statgems.luckGems.RawLuckGem;
import net.siegerpg.siege.core.utils.Utils;

public class ForestSpider extends MobDropTable {
    public ForestSpider() {
        super("ForestSpider", 13, 16, 19, 22, new Reward[]{
                new Reward(Vine.Companion.tier(1).getUpdatedItem(false), 100.0),
                new Reward(Vine.Companion.tier(2).getUpdatedItem(false), 10.0),
                new Reward(new SusStew(Utils.randRarity()).getUpdatedItem(false), 1.0),
                new Reward(new RawHealthGem(0).getUpdatedItem(false), 2.0),
                new Reward(new CrackedLuckGem(0).getUpdatedItem(false), 1.0),
                new Reward(new RawLuckGem(0).getUpdatedItem(false), 2.0),
                new Reward(new HillyWoodsDungeonKey(0).getUpdatedItem(false), 0.75)
        });
    }
}
