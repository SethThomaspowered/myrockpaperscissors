package mygame;

import java.util.Random;
import java.util.Scanner;

public class Welcome {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("mygame.Welcome to Rock, Paper. Scissors");
            System.out.println("Would you like play Two Players or Against the Computer?");
            String opponent = scan.nextLine();
            System.out.println("You choose to play " + opponent + ".");
            System.out.println("What is player One's name?");
            String name1 = scan.nextLine();
            if (opponent.equals("two")){
                System.out.println("What is player Two's name?");
                String name2 = scan.nextLine();
            }
            System.out.println("Select rock, paper, scissors");
            String playerOneChoice = scan.next();
            String computerChoice = getComputerPlay();
            System.out.println(getWinner(name1, playerOneChoice, computerChoice));
            WinningCondition.winner(playerOneChoice, computerChoice);
        }
        public static String getComputerPlay(){
            String[] playOptions = {"rock","paper","scissors"};

            int randomNumber = new Random().nextInt(playOptions.length);
            return playOptions[randomNumber];
        }
        public static String getWinner(String name, String playerOneChoice, String computerChoice){

            return name + " chose " + playerOneChoice + " and  the computer chose " +computerChoice;
        }
}
