package se.jannat.diceGame;
//Import Scanner for Player input
import java.util.InputMismatchException;
import java.util.Scanner;

//main class that controls the game
public class Main {//open
    public static void main(String[] args) {

        //create Scanner object for input to player input
        Scanner input = new Scanner(System.in);

        //Player1 name input
        System.out.println(" Player1 please enter your name: ");
        String player1name = input.nextLine();
        //create a player object for player1 using name
        Player player1 = new Player(player1name);

        //Player2 name input
        System.out.println("Player2 please enter your name: ");
        String player2name = input.nextLine();
        //create a player object for player2 using name
        Player player2 = new Player(player2name);

        //Int variable to count game rounds
        int playcount = 1;

        //Start the game loop with do while
        do {

            //Ask player1 to throw the dice
            System.out.println(player1name + " press 1 and throw your dice");
            //Input from player1 to start the dice throw using switch
            try {// Error handling for catching string
                int player1choice = input.nextInt();
                switch (player1choice) {
                    case 1:
                        player1.dicevalue();
                        break;
                    //Error handling
                    default:
                        System.out.println("Invalid choice, please press 1 to continue: ");
                }
            } catch (InputMismatchException e) { //catch input mismatch error
                System.out.println("Invalid choice, please press 1 to continue: ");
                input.next(); //clear scanner of mismatch value
            }


            //Ask player2 to throw the dice
            System.out.println(player2name + " press 1 and throw your dice");
            //Input from player2 to start the dice throw using switch
            try { // Error handling for catching string
                int player2choice = input.nextInt();
                switch (player2choice) {
                    case 1:
                        player2.dicevalue();
                        break;
                    default:
                        System.out.println("Invalid choice, please press 1 to continue: ");
                }
            } catch (InputMismatchException e) { //catch input mismatch error
                System.out.println("Invalid choice, please press 1 to continue: ");
                input.next(); //clear scanner of mismatch value
            }

            //Comparing player1 and player2 for dice throw
            if (player1.getScore() > player2.getScore()) {//if player1 score higher than player2, player1 wins
                System.out.println(player1.getName() + " You have won the game");
            } else if (player1.getScore() < player2.getScore()) {//if player1 score lower than player2,player2 wins
                System.out.println(player2.getName() + " You have won the game");
            } else if (player1.getScore() == player2.getScore()) {// if both of the player have same score match draw
                System.out.println("match draw");
            }
            playcount++;// update play count variable with plus 1
            System.out.println("continue playing...");

        } while (playcount < 6);//loop until the game is running,until the condition is met
        System.out.println("game over");// end of the game


    }


        }//end



