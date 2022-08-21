package com.yeroshevich;


import com.yeroshevich.game.Player;
import com.yeroshevich.game.achievements.AchievementDetails;
import com.yeroshevich.game.achievements.AchievementManager;
import com.yeroshevich.game.achievements.common.CompleteTraineeAchievement;
import com.yeroshevich.game.achievements.global.Stongest;
import com.yeroshevich.game.buffs.AgilityBuff;
import com.yeroshevich.game.buffs.NoneBuff;
import com.yeroshevich.game.buffs.StrengthBuff;
import com.yeroshevich.game.stats.Stats;

import java.io.*;
import java.sql.SQLException;
import java.util.HashSet;

public class Main {
  
    public static void main(String[] args) throws IOException, SQLException {


        AchievementManager manager = new AchievementManager();
        Player player = new Player("konfetko",new Stats(5,5),new HashSet<>());

        System.out.println(player);
        System.out.println();
        System.out.println(manager);
        System.out.println();
        manager.completeAchievement(new Stongest(new AchievementDetails("вы стали сильнешим","сильнейший"),player,new StrengthBuff(10)));
        manager.completeAchievement(new Stongest(new AchievementDetails("вы стали сильнешим","сильнейший"),player,new StrengthBuff(10)));
        player.completeAchievement(new CompleteTraineeAchievement(new AchievementDetails("вы успешно закончили тренировку","конец страданиям"),new AgilityBuff(5)));
        player.completeAchievement(new CompleteTraineeAchievement(new AchievementDetails("вы успешно закончили тренировку","конец страданиям"),new AgilityBuff(5)));
        System.out.println(player);
        System.out.println();

        System.out.println(manager);
        System.out.println();

    }

}
