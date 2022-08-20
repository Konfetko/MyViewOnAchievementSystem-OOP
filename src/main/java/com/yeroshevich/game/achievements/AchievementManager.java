package com.yeroshevich.game.achievements;

import java.util.ArrayList;
import java.util.List;

public class AchievementManager {
    private final List<Achievement> achievements=  new ArrayList<>();
    public void completeAchievement(Achievement achievement){
        achievement.useEffects();
        this.achievements.add(achievement);

    }
}
