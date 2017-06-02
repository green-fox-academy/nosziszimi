package com.greenfox.nori.tennisrefactoringkata;

import com.greenfox.nori.tennisrefactoringkata.model.Player;
import com.greenfox.nori.tennisrefactoringkata.service.GameLogic;
import org.springframework.beans.factory.annotation.Autowired;

public class TennisGame1 implements TennisGame {

  Player player1;
  Player player2;
  GameLogic gameLogic;


    public TennisGame1(String playername1, String playername2) {
      this.player1 = new Player(playername1);
      this.player2 = new Player(playername2);
      gameLogic = new GameLogic();
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
             player1.incrementScore();
        else
            player2.incrementScore();
    }

    public String getPlayersScore() {
      if (player1.getTheScore()==player2.getTheScore() && player1.getTheScore() < 4)
      {
        return gameLogic.calculateEqualScore(player1, player2);
      }
      if (player1.getTheScore()>=4 || player2.getTheScore()>=4)
      {
        return gameLogic.calculateScoreOverThree(player1, player2);
      }
      return gameLogic.calculateCurrentScore(player1, player2);
    }
}
