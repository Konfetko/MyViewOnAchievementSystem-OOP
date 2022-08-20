package com.yeroshevich.game.buffs;


import com.yeroshevich.game.stats.IStat;
import com.yeroshevich.game.stats.AgilityStat;

public class AgilityBuff extends Buff implements IBuff {

    public AgilityBuff(int buffVolume) {
        super("Увеличение ловкости", buffVolume);
    }


    @Override
    public void buffing(IStat stat) {
        if(stat instanceof AgilityStat)
            stat.influenceToStat(super.getBuffVolume());
    }
}
