package com.zipcodewilmington.assessment1.part1;

import java.util.HashMap;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissors";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
    String answer = "";

    if (handSign.equals(ROCK)) {
        answer = PAPER;
    } else if (handSign.equals(PAPER)) {
        answer = SCISSOR;
    } else if (handSign.equals(SCISSOR)){
        answer.equals(ROCK);
    }
    return answer;

    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String answer = "";

        if (handSign.equals(ROCK)) {
            answer = SCISSOR;
        } else if (handSign.equals(PAPER)) {
            answer = ROCK;
        } else if (handSign.equals(SCISSOR)){
            answer.equals(PAPER);
        }
        return answer;


    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winner = "";
        if (handSignOfPlayer1.equals(ROCK) && (handSignOfPlayer2.equals(SCISSOR))) {
            winner = ROCK;
        }
        else if (handSignOfPlayer1.equals(ROCK) && handSignOfPlayer2.equals(PAPER)) {
            winner = PAPER;
        }
        else if (handSignOfPlayer1.equals(PAPER) && handSignOfPlayer2.equals(ROCK)) {
            winner = PAPER;
        }
        else if (handSignOfPlayer1.equals(PAPER) && handSignOfPlayer2.equals(SCISSOR)) {
            winner = SCISSOR;
        }
        else if (handSignOfPlayer1.equals(SCISSOR) && handSignOfPlayer2.equals(ROCK)) {
            winner = SCISSOR;
        }
        else if (handSignOfPlayer1.equals(SCISSOR) && handSignOfPlayer2.equals(PAPER)) {
            winner = PAPER;
        }
        return  winner;
    }
}
