package com.yeroshevich.game.buffs;

import com.yeroshevich.game.stats.IStat;

public class NoneBuff implements IBuff{
    @Override
    public void buffing(IStat stat) {

    }

    @Override
    public String toString() {
        return "NoneBuff{}";
    }
}
