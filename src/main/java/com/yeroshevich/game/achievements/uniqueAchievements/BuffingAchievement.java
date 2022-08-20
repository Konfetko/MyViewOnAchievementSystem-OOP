package com.yeroshevich.game.achievements.uniqueAchievements;

import com.yeroshevich.game.Player;
import com.yeroshevich.game.achievements.Achievement;
import com.yeroshevich.game.buffs.IBuff;

import java.util.Objects;


public abstract class BuffingAchievement extends Achievement {
    protected final Player player;
    protected final IBuff buff;

    public BuffingAchievement(String description, Player player, IBuff buff) {
        super(description);
        this.player = player;
        this.buff = buff;
    }
    public void useEffects(){
        this.player.useBuff(this.buff);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuffingAchievement that = (BuffingAchievement) o;
        return  Objects.equals(this.player,that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass());
    }
}
