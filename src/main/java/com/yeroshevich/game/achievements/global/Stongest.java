package com.yeroshevich.game.achievements.global;

import com.yeroshevich.game.Player;
import com.yeroshevich.game.achievements.AchievementDetails;
import com.yeroshevich.game.buffs.IBuff;

public class Stongest extends GlobalAchievement{


    public Stongest(AchievementDetails details, Player player, IBuff buff) {
        super(details, player, buff);
    }

    @Override
    public void useEffects() {
        super.player.useBuff(super.buff);
    }
}
