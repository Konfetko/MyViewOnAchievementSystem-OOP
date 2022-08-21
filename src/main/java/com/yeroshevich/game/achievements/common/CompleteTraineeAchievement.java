package com.yeroshevich.game.achievements.common;

import com.yeroshevich.game.Player;
import com.yeroshevich.game.achievements.Achievement;
import com.yeroshevich.game.achievements.AchievementDetails;
import com.yeroshevich.game.buffs.IBuff;

public class CompleteTraineeAchievement extends Achievement {


    public CompleteTraineeAchievement( AchievementDetails details, IBuff buff) {
        super( details, buff);
    }

    @Override
    public void useEffects(Player player) {
        player.useBuff(buff);
    }
}
