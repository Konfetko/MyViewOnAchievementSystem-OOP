package com.yeroshevich.game;


import com.yeroshevich.game.buffs.IBuff;
import com.yeroshevich.game.stats.Stats;
import lombok.ToString;

@ToString
public class Player {
    private final String username;
    private final Stats stats;


    public Player(String username, Stats stats) {
        this.username = username;
        this.stats=stats;
    }
    public void useBuff(IBuff buff){
        this.stats.increaseStats(buff);
    }

}
