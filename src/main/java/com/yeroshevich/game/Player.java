package com.yeroshevich.game;


import com.yeroshevich.game.achievements.Achievement;
import com.yeroshevich.game.buffs.IBuff;
import com.yeroshevich.game.stats.Stats;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@ToString
public class Player {
    private final String username;
    private final Stats stats;
    private final Set<Achievement> achievements;


    public Player(String username, Stats stats, Set<Achievement> achievements) {
        this.username = username;
        this.stats=stats;
        this.achievements = achievements;
    }
    public void useBuff(IBuff buff){
        this.stats.increaseStats(buff);
    }
    public void completeAchievement(Achievement achievement){
        this.achievements.add(achievement);
    }

}
