package com.greenfox.nori.tennisrefactoringkata.service;

import com.greenfox.nori.tennisrefactoringkata.model.Player;
import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 23..
 */
@Component
public class GameLogic {

  public String convertScoreToString(Player player){
    String[] pointNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
    return pointNames[player.getTheScore()];
  }

  public String calculateEqualScore(Player player1, Player player2) {
    return convertScoreToString(player1)+ "-All";
  }

  public String calculateScoreOverThree(Player player1, Player player2) {
    int scoreDifference = player1.getTheScore()-player2.getTheScore();
    if (scoreDifference==1) return "Advantage player1";
    if (scoreDifference ==-1) return "Advantage player2";
    if (scoreDifference>=2) return "Win for player1";
    if (scoreDifference<=-2) return "Win for player2";
    return "Deuce";
  }

  public String calculateCurrentScore(Player player1, Player player2) {
    return convertScoreToString(player1) + "-" + convertScoreToString(player2);
  }
}
