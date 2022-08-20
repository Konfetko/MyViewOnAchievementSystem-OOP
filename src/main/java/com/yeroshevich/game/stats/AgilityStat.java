package com.yeroshevich.game.stats;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AgilityStat implements IStat {
    private int agility;
    @Override
    public void influenceToStat(int influence) {
        agility+=influence;
    }
}
