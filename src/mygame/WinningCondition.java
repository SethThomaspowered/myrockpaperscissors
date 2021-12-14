package mygame;

public class WinningCondition {
    public static void winner(String playerOne, String playerTwo) {
        playerOne = playerOne.toLowerCase();
        playerTwo = playerTwo.toLowerCase();
        if (playerOne.equals(playerTwo)) {
            System.out.println("It's a tie");
        } else if ((playerOne.equals("rock")) && (playerTwo.equals("scissors"))) {
            System.out.println("Player One is the Winner");
        } else if ((playerOne.equals("scissors")) && (playerTwo.equals("paper"))) {
            System.out.println("Player One is the Winner");
        } else if ((playerOne.equals("paper")) && (playerTwo.equals("rock"))) {
            System.out.println("Player One is the Winner");
        } else {
            System.out.println("Player Two is the winner");
        }
    }
}
