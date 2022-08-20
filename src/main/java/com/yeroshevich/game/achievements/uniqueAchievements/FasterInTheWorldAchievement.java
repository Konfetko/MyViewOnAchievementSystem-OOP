package com.yeroshevich.game.achievements.uniqueAchievements;

import com.yeroshevich.game.Player;
import com.yeroshevich.game.buffs.AgilityBuff;
import com.yeroshevich.game.buffs.IBuff;
import com.yeroshevich.game.buffs.StrengthBuff;
import lombok.ToString;

@ToString
public class FasterInTheWorldAchievement extends BuffingAchievement {


    public FasterInTheWorldAchievement(String description, Player player, IBuff buff) {
        super(description, player, buff);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
