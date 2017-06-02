package com.greenfox.nori.tennisrefactoringkata;

import com.greenfox.nori.tennisrefactoringkata.model.Player;
import com.greenfox.nori.tennisrefactoringkata.model.Player2;

public class TennisGame2 implements TennisGame {

    Player2 player1, player2;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1 = new Player2(player1Name);
        this.player2 = new Player2(player1Name);
    }

    public String getPlayersScore(){
        String score = "";
        if (player1.getPoint() == player2.getPoint() && player1.getPoint() < 4)
        {
            if (player1.getPoint()==0)
                score = "Love";
            if (player1.getPoint()==1)
                score = "Fifteen";
            if (player1.getPoint()==2)
                score = "Thirty";
            if (player1.getPoint()==3)
                score = "Forty";
            score += "-All";
        }
        if (player1.getPoint()==player2.getPoint() && player1.getPoint()>3)
            score = "Deuce";

        if (player1.getPoint() < 4 && player2.getPoint() < 4 && player1.getPoint() != player2.getPoint())
        {
            score = player1.getResult() + "-" + player2.getResult();
        }

        if (player1.getPoint() > player2.getPoint() && player2.getPoint() >= 3)
        {
            score = "Advantage player1";
        }

        if (player2.getPoint() > player1.getPoint() && player1.getPoint() >= 3)
        {
            score = "Advantage player2";
        }

        if (player1.getPoint()>=4 && player2.getPoint()>=0 && (player1.getPoint()-player2.getPoint())>=2)
        {
            score = "Win for player1";
        }
        if (player2.getPoint()>=4 && player1.getPoint()>=0 && (player2.getPoint()-player1.getPoint())>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

    public void SetP1Score(int number){

        for (int i = 0; i < number; i++)
        {
            player1.incrementPoint();
        }

    }

    public void SetP2Score(int number){

        for (int i = 0; i < number; i++)
        {
          player2.incrementPoint();
        }

    }


    public void wonPoint(String player) {
        if (player == "player1")
            player1.incrementPoint();
        else
            player2.incrementPoint();
    }
}
