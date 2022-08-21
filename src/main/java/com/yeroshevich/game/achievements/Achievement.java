package com.yeroshevich.game.achievements;

import com.yeroshevich.game.buffs.IBuff;
import lombok.ToString;

import java.util.Objects;
@ToString
public abstract class Achievement implements IBuffPlayerAchievement {
    protected final AchievementDetails details;
    protected  final IBuff buff;

    public Achievement( AchievementDetails details, IBuff buff) {
        this.details = details;
        this.buff=buff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Achievement that = (Achievement) o;
        return Objects.equals(details,that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass());
    }
}
