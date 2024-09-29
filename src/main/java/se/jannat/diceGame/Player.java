package se.jannat.diceGame;
import java.util.Random;// import the random class for generating random number

//Player class with 2 objects name and dicenumber
public class Player {//open
   private String name;
   private int dicenumber;

   //Initialize the player and dice number
   public Player(String name) {
       this.name = name;
       this.dicenumber = dicenumber;

   }
    //This is methods simulate a dice roll using  Random
    public void dicevalue() {
       //A new Random object
       Random random = new Random();
       //Generate a random number between 1 to 6
        dicenumber  = random.nextInt(6) + 1;
        // Display the dice result
        System.out.println(" your dice score is " + dicenumber );

    }

    // Returns the players name
    public String getName() {
        return name;
    }

    //Returns the player dice score
    public int getScore() {
       return dicenumber;
    }




}//end
