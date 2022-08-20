package com.yeroshevich.game.buffs;


import com.yeroshevich.game.stats.IStat;
import com.yeroshevich.game.stats.StrengthStat;

public class StrengthBuff extends Buff implements IBuff{
    public StrengthBuff( int buffVolume) {
        super("Увеличение силы", buffVolume);
    }

    @Override
    public void buffing(IStat stat) {
        if(stat instanceof StrengthStat)
            stat.influenceToStat(super.getBuffVolume());
    }
}
