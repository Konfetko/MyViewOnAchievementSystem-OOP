package com.yeroshevich.game.achievements.global;

import com.yeroshevich.game.Player;
import com.yeroshevich.game.achievements.AchievementDetails;
import com.yeroshevich.game.achievements.IBuffAchievement;
import com.yeroshevich.game.buffs.IBuff;
import lombok.ToString;

import java.util.Objects;

@ToString
public abstract class GlobalAchievement implements IBuffAchievement {
    private final AchievementDetails details;
    protected final Player player;
    protected final IBuff buff;


    protected GlobalAchievement(AchievementDetails details, Player player, IBuff buff) {
        this.details = details;
        this.player = player;
        this.buff = buff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlobalAchievement that = (GlobalAchievement) o;
        return Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass());
    }
}
