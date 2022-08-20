package com.yeroshevich.game.stats;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class StrengthStat implements IStat {
    private int strength;

    @Override
    public void influenceToStat(int influence) {
        strength+=influence;
    }


}
