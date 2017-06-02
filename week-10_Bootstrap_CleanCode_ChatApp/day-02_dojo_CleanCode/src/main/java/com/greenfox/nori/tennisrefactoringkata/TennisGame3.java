package com.greenfox.nori.tennisrefactoringkata;

import com.greenfox.nori.tennisrefactoringkata.model.Player;
import com.greenfox.nori.tennisrefactoringkata.service.GameLogic;

public class TennisGame3 implements TennisGame {

    Player player1, player2;
    GameLogic gameLogic = new GameLogic();

    public TennisGame3(String nameOfPlayer1, String nameOfPlayer2) {
        this.player1 = new Player(nameOfPlayer1);
        this.player2 = new Player(nameOfPlayer2);
    }

    public String getPlayersScore() {
        String score;
        if (player1.getTheScore() < 4 && player1.getTheScore() == player2.getTheScore()) {
            return gameLogic.calculateEqualScore(player1, player2);
        }
        if (player1.getTheScore() < 4 && player2.getTheScore() < 4 && player1.getTheScore() != player2.getTheScore())
            return gameLogic.calculateCurrentScore(player1,player2);

        return gameLogic.calculateScoreOverThree(player1,player2);
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            player1.incrementScore();
        else {
            player2.incrementScore();
        }

    }

}
