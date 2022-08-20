package com.yeroshevich;

import com.yeroshevich.game.Player;
import com.yeroshevich.game.achievements.Achievement;
import com.yeroshevich.game.achievements.AchievementManager;
import com.yeroshevich.game.achievements.uniqueAchievements.FasterInTheWorldAchievement;
import com.yeroshevich.game.buffs.StrengthBuff;
import com.yeroshevich.game.stats.Stats;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
  
    public static void main(String[] args) throws IOException, SQLException {


        AchievementManager manager = new AchievementManager();
        Player player = new Player("konfetko",new Stats(5,2),new HashSet<>());
        System.out.println(player);
        System.out.println(manager);
        manager.completeAchievement(new FasterInTheWorldAchievement("Вы освоили скорость",player,new StrengthBuff(5)));
        //думаю что бафф можно ставить сразу внутри конструктора, а не передавать как параметр, так как по сути эти достижения уникальны
        player.completeAchievement(new Achievement("прошёл обучение"));
        player.completeAchievement(new Achievement("прошёл обучение"));
        System.out.println();
        manager.completeAchievement(new FasterInTheWorldAchievement("Вы освоили скорость",player,new StrengthBuff(5)));
        System.out.println(player);

        System.out.println(manager);

    }

}
