package com.yeroshevich.game;


import com.yeroshevich.game.achievements.IBuffPlayerAchievement;

import com.yeroshevich.game.buffs.IBuff;
import com.yeroshevich.game.stats.Stats;
import lombok.ToString;

import java.util.Set;

@ToString
public class Player {
    private final String username;
    private final Stats stats;
    private final Set<IBuffPlayerAchievement> achievements;


    public Player(String username, Stats stats, Set<IBuffPlayerAchievement> achievements) {
        this.username = username;
        this.stats=stats;
        this.achievements = achievements;
    }
    public void useBuff(IBuff buff){
        this.stats.increaseStats(buff);
    }
    public void completeAchievement(IBuffPlayerAchievement achievement){

        if(!this.achievements.contains(achievement))
            achievement.useEffects(this);
        this.achievements.add(achievement);

    }


}
