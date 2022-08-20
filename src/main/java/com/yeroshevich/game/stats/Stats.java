package com.yeroshevich.game.stats;

import com.yeroshevich.game.buffs.IBuff;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
public class Stats {
    private List<IStat> stats;
    public Stats(int strength,int agility){
        stats=new ArrayList<>();
        stats.add(new AgilityStat(agility));
        stats.add(new StrengthStat(strength));
    }

    public void increaseStats(IBuff buff){
        stats.forEach(buff::buffing);
    }
}
