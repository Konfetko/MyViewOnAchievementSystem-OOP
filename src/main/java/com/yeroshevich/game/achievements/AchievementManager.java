package com.yeroshevich.game.achievements;

import com.yeroshevich.game.achievements.uniqueAchievements.BuffingAchievement;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;
@ToString
public class AchievementManager {
    private final Set<BuffingAchievement> achievements=  new HashSet<>();
    public void completeAchievement(BuffingAchievement achievement){
        if(!this.achievements.contains(achievement))
            achievement.useEffects();
        this.achievements.add(achievement);



    }
}
