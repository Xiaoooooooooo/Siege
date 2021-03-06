package net.siegerpg.siege.core.drops.mobs.hillyWoods.neutral;

import net.siegerpg.siege.core.drops.MobDropTable;
import net.siegerpg.siege.core.drops.Reward;
import net.siegerpg.siege.core.items.implemented.armor.leggings.BeePants;
import net.siegerpg.siege.core.items.implemented.misc.keys.HillyWoodsDungeonKey;
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.*;
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.mobs.*;
import net.siegerpg.siege.core.utils.Utils;

public class GiantHornet extends MobDropTable {
    public GiantHornet() {
        super("GiantHornet", 4, 7, 10, 13, new Reward[]{
                new Reward(Magma.Companion.tier(1).getUpdatedItem(false), 25.0),
                new Reward(Magma.Companion.tier(2).getUpdatedItem(false), 5.0),
                new Reward(Seed.Companion.tier(1).getUpdatedItem(false), 50.0),
                new Reward(Seed.Companion.tier(2).getUpdatedItem(false), 5.0),
                new Reward(new BeePants(Utils.randRarity()).getUpdatedItem(false), 2.5),
                new Reward(new HillyWoodsDungeonKey(0).getUpdatedItem(false), 0.5)
        });
    }
}
