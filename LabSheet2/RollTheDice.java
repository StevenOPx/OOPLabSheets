package LabSheet2;

import javax.swing.*;

public class RollTheDice {
    public static void main(String[] args) {
        String answer;
        char result;
        int pcWins=0, playerWins=0, gamesNum=0, draws=0;

        answer = JOptionPane.showInputDialog("Would you like to play a game of roll the dice? (yes or no)");

        while(answer.equals("yes"))
        {
            result=rollTheDice();

            if(result=='c')
                pcWins++;
            else if(result=='p')
                playerWins++;
            else
                draws++;

            JOptionPane.showMessageDialog(null, "Games Played: " + gamesNum +
                                          "\nComputer Wins: " + pcWins + "\nPlayer Wins: " + playerWins + "\nDraws: " + draws,
                                          "Game Info", JOptionPane.INFORMATION_MESSAGE);

            answer = JOptionPane.showInputDialog("Would you like to play another game of roll the dice? (yes or no)");
        }

        JOptionPane.showMessageDialog(null, "Thanks for playing the game!",
                                      "Farewell", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

    public static char rollTheDice() {
        int pcRoll, playerRoll;

        pcRoll=(int)(Math.random()*11)+2;
        JOptionPane.showMessageDialog(null, "The computer roll generated the value " + pcRoll +
                                      "... now hit return to see the player roll",
                                      "Computer Roll", JOptionPane.INFORMATION_MESSAGE);

        playerRoll=(int)(Math.random()*11)+2;
        JOptionPane.showMessageDialog(null, "The player roll generated the value " + playerRoll,
                                     "Computer Roll", JOptionPane.INFORMATION_MESSAGE);

        if(pcRoll>playerRoll)
            return 'c';
        else if(playerRoll>pcRoll)
            return 'p';
        else
            return 'd';

    }
}
