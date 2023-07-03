package com.company.Notes;
import java.util.Scanner;
import java.util.Random;

class guessTheNumber{
    int a,b;

       public guessTheNumber(){
           Random rand = new Random();
            a = rand.nextInt(1000);

           System.out.println();
           System.out.println("Welcome to GUESS THE NUMBER Game");
           System.out.println();
           System.out.println("-------------------- Rules of game -------------------------");
           System.out.println();
           System.out.println("With the initialization of game, computer will choose a random number between 0 - 1000, let it be x. ");
           System.out.println("Now you have to choose a random number between 0 - 1000, If your number remains less than or greater than x, you will get notified respectively.");
           System.out.println("According to the notification you have to alter your choice and enter new number.");
           System.out.println("When your number becomes equal to x, you will win the game. Now lets start the game.");
           System.out.println();
       }

       public void play() {
           int i;

           System.out.print("Enter the number : ");
           Scanner s = new Scanner(System.in);
           b = s.nextInt();

           for ( i = 1; b<a || b>a ; i++){
               if (a > b) {
                   System.out.println("You've chosen a smaller number");
                   System.out.println();
                   System.out.print("Enter the number again : ");
                   b = s.nextInt();
               }
               else if (a < b) {
                   System.out.println("You've chosen a larger number");
                   System.out.println();
                   System.out.print("Enter the number again : ");
                   b = s.nextInt();
               }
       }
           System.out.println();
           System.out.printf("*********** Congratulations, you've won the game in %d trials **************", i);
       }
}

public class Java_tut_50_Ex_3_Guess_the_Number_Game {
    public static void main(String[] args) {


      guessTheNumber play = new guessTheNumber();
      play.play();

    }
}
