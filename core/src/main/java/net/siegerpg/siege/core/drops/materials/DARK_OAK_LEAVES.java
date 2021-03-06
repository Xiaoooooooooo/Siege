package net.siegerpg.siege.core.drops.materials;

import net.siegerpg.siege.core.drops.BlockDropTable;
import net.siegerpg.siege.core.drops.Reward;
import net.siegerpg.siege.core.items.implemented.misc.food.Apple;
import net.siegerpg.siege.core.items.implemented.misc.materials.drops.blocks.*;
import org.bukkit.Material;

public class DARK_OAK_LEAVES extends BlockDropTable {
    public DARK_OAK_LEAVES() {
        super(200, Material.DARK_OAK_LEAVES, 0, 0, 1, 1, new Reward[]{
                new Reward(new Apple(100).getUpdatedItem(false), 5.0),
                new Reward(new Apple(50).getUpdatedItem(false), 10.0),
                new Reward(Stick.Companion.tier(1).getUpdatedItem(false), 25)
        });
    }
}
