package com.yeroshevich.game.achievements;


import com.yeroshevich.game.achievements.global.GlobalAchievement;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;
@ToString
public class AchievementManager {
    private final Set<GlobalAchievement> achievements=  new HashSet<>();
    public void completeAchievement(GlobalAchievement achievement){
        if(!this.achievements.contains(achievement))
            achievement.useEffects();
        this.achievements.add(achievement);



    }
}
