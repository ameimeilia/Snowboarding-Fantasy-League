/*
Name: Amelia Chen
Date: 9/10/2021
Period: 5
Program Description: Calculates scores for 2 fantasy snowboarding teams.
On my honor, by submitting this code I am claiming that it was written
and tested by me.
Any help I received was in the form of asking questions for clarification
and no direct copying was done.
*/

import java.util.Scanner;     //imports the Scanner class to allow for input

public class SnowboardingFantasyLeague    //open class
{
   public static void main(String[] args)    //2nd class
   {
      Scanner scan = new Scanner(System.in);    //creates a Scanner class, calls the object "scan"
      String team1,     //declares the string variables relating to the team/team names
             team2,
             teamMem1,
             teamMem2,
             teamMem3;
      int randJump,      //declares the int variables relating to the points and counters
          railPts,
          boxPts,
          jumpPts,
          penaltyPts,
          counter1,
          counter2,
          totalPts,
          teamMem1Pts,
          teamMem2Pts,
          teamMem3Pts,
          team1TotalPts,
          team2TotalPts;
      
      //prints the scoring guidelines
      System.out.println("Snowboarding Fantasy League\nScoring Guidelines");
      System.out.println("2 rails = 2 points each\n2 boxes = 2 points each");
      System.out.println("jump: 360, 540, 720, 900, 1080 degrees = 30, 45, 70, 80, 92 pts respectively");
      System.out.println("penalties = -2 points each\nmax points = 100\n");
      
      //initializes certain variables to prevent a compile error
      team1 = "";
      team2 = "";
      teamMem1Pts = 0;
      teamMem2Pts = 0;
      teamMem3Pts = 0;
      team1TotalPts = 0;
      team2TotalPts = 0;
      counter1 = 1; //sets counter1==1, does not reset in the second loop of the code below
       
      for (int i=0; i<2; i++){      //beginning of for loop, repeats 2 times
         counter2 = 1;     //sets counter2 equal to 1, will reset during the 2nd loop. represents the team member number
         if (counter1 ==1){      //beginning of if/else statement; if counter1 equals 1 
            System.out.println("What is the name of the first team?");     //asks the user to input the name of the first team
            team1 = scan.nextLine();      //assigns user input to the variable team1
            } else {    //else (if counter1 is not equal to 1)
               System.out.println("\nWhat is the name of the second team?");     //asks the user to input the name of the second team
               team2 = scan.nextLine();      //assigns user input to the variable team2
                  }     //end of if/else statement
         System.out.println("What is the first team member's name?");      //asks the user to input the name of the first team member
         teamMem1 = scan.nextLine();      //assigns the user input to teamMem1
         System.out.println("What is the second team member's name?");     //asks the user to input the name of the second team member
         teamMem2 = scan.nextLine();      //assigns the user input to teamMem2
         System.out.println("What is the third team member's name?");      //asks the user to input the name of the third team member
         teamMem3 = scan.nextLine();      //assigns the user input to teamMem3
      
         for (int j=0; j<3; j++){      //beginning of for loop, repeats 3 times  
            railPts = ((int)(Math.random()*2+1))*2;      //picks a random integer between 1-2 inclusive, represents the number of numbers of rails hit. multiplies the number of rails hit by the number of points per rail(2)    
            boxPts = ((int)(Math.random()*2+1))*2;      //picks a random integer between 1-2 inclusive, represents the number of numbers of boxes hit. multiplies the number of boxes hit by the number of points per box(2)
            penaltyPts = ((int)(Math.random()*4))*(-2);     //picks a random integer between 0-3 inclusive, represents the number of numbers of penalties. multiplies the number of penalties by the number of points per penalty(-2)
            randJump = ((int)(Math.random()*5));      //picks a random integer between 0-4 inclusive, used to determine the points scored from the jump 
            jumpPts = 0;      //initializes jumpPts to prevent a compile error
            if (randJump == 0){     //beginning of if/else statement. if randJump equals 0
               jumpPts = 30;     //sets jumpPts to 30 (represents a jump with a 360 degree turn)
               } else if (randJump == 1){    //else if randJump equals 1
                     jumpPts = 45;     //sets jumpPts to 45 (represents a jump with a 540 degree turn)
                     } else if (randJump == 2){    //else if randJump equals 2
                           jumpPts = 70;     //sets jumpPts to 70 (represents a jump with a 720 degree turn)
                           } else if (randJump == 3){    //else if randJump equals 3
                                 jumpPts = 80;     //sets jumpPts to 80 (represents a jump with a 900 degree turn)
                                 } else if (randJump == 4){    //else if randJump equals 4
                                       jumpPts = 92;     //sets jumpPts to 92 (represents a jump with a 1080 degree turn)
                                       }
          totalPts = railPts + boxPts + jumpPts + penaltyPts;     //calculates the total points by adding together each of the sub points
          if (counter2 == 1){    //beginning of if/else statement, if counter2 equals 1
             System.out.println("\n" + teamMem1 + " scored " + totalPts); //prints the total points for team member 1
             teamMem1Pts = totalPts;      //assigns the total points to team member 1's points
             counter2++;      //adds one to the counter
             } else if (counter2 == 2){      //if counter2 equals 2
                   System.out.println(teamMem2 + " scored " + totalPts);      //prints the total points for team member 2
                   teamMem2Pts = totalPts;      //assigns the total points to team member 2's points
                   counter2++;      //adds one to the counter
                   } else if (counter2 == 3){      //if counter equals 3
                         System.out.println(teamMem3 + " scored " + totalPts);      //prints the total points for team member 3
                         teamMem3Pts = totalPts;      //assigns the total points to team member 3's points
                       }      //end of if/else statement
          }    //end of repeat 3 loop
         if (counter1 == 1){     //beginning of if/else statement, if counter1 equals 1  
            team1TotalPts = teamMem1Pts + teamMem2Pts + teamMem3Pts;    //calculates the total points for team 1 by adding the points for each team member
            System.out.println("Team " + team1 + " scored " + team1TotalPts + " points!");      //prints the total points of team 1
            counter1++;    //adds one to the counter
            } else {    //else (when counter1 does not equal 1)
                  team2TotalPts = teamMem1Pts + teamMem2Pts + teamMem3Pts;    //calculates the total points for team 2 by adding the points for each team member
                  System.out.println("Team " + team2 + " scored " + team2TotalPts + " points!\n");    //prints the total points of team 2
                  }     //end of if/else statement
            }     //end of repeat 2 loop
       if (team1TotalPts >  team2TotalPts){     //if the first team has more points
         System.out.println("Team " + team1 + " won!");     //prints that the first team won
         //prints the logo for team 1
         System.out.println("   _                         _");
         System.out.println(" (__)                 *     (__)");
         System.out.println(" \\   \\                     /   /");
         System.out.println("  \\   \\                   /   /");
         System.out.println("   \\   \\      ______     /   /");
         System.out.println("    \\   \\   /     ____\\ /   /");
         System.out.println("*    \\   \\ | _/( __/\\_)/   /");
         System.out.println("      \\   \\\\| ___ v _//   /");
         System.out.println("       \\         \\/      /      *");
         System.out.println("     *  \\         |     /");
         System.out.println("         |        |    |");
         System.out.println("         |        |    |   *");
         System.out.println("  *      |        |    |");
         System.out.println("         |        |    |            *");
         System.out.println("         |________|___ |");
         System.out.println("         |     / o|    |      *");
         System.out.println("        /  __ /        \\");
         System.out.println("*      |        _      |                  *");
         System.out.println("       /       /        \\");
         System.out.println("      |       / \\       |      *");
         System.out.println("     /       /   \\       \\               *");
         System.out.println("    |       /    \\       |");
         System.out.println("   /       /      \\       \\                      *");
         System.out.println("  /       /        \\       |");
         System.out.println("  |_______|    *   \\_______\\      *");
         System.out.println("  | |---| |        | |---| |");
         System.out.println("  | | x | |        | | x | |              *");
         System.out.println("  |_|_x_| |  *     | |_x_| |");
         System.out.println("__(_______)________(_______)_______/`/");
         System.out.println("------------------------------------/");
         } else if (team1TotalPts < team2TotalPts){      //else if the second team has more points
               System.out.println("Team " + team2 + " won!");     //prints that team 2 won
               //prints the logo for team 2
               System.out.println("              *         /---\\_       *");
               System.out.println("    *                __/      .\\      /\\__");
               System.out.println("         ,,,       _/   .-  /   \\   _/ .  \\   *");
               System.out.println("        /  .\\_  _/  ///    \\     \\ /  \\ -  \\");
               System.out.println("   ____/______\\/______//_____\\\\__\\\\_________\\___");
               System.out.println(" /             \\  \\ \\         / /  /             \\");
               System.out.println("|      .... ....\\  \\ \\       / /  /.... ....      |");
               System.out.println("|      ```` ```` \\  \\ \\     / /  / ```` ````      |");
               System.out.println(" \\ _______________\\  \\ \\___/ /  /________________/");
               System.out.println("                   \\  \\ \\ / /  /");
               System.out.println("                    \\  \\_|_/  /");
               System.out.println("                    .-``   `` -.");
               System.out.println("                 .``   . --.    ``.");
               System.out.println("                 |    /_/| |      |");
               System.out.println("                 |      _| |_     |");
               System.out.println("                  -._ `------` _.-");
               System.out.println("                     `--....--`");
               } else if (team1TotalPts == team2TotalPts){     //else if the scores of both teams are equal
                  System.out.println(team1 + " and " + team2 + " were tied!");      //prints a tie statement 
                  }     //end of if/else statment
   }     //end of 2nd bracket
}     //end of 1st bracket