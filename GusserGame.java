package gussergame;
import java . util.*;
import javax.lang.model.util.ElementScanner6;

class Gusser {
    int guessNum;
    
  int   guessingNum(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Gusser!! Guess the number ");
      guessNum = sc.nextInt();
      return guessNum;
          }
}

class Player{
    int  guessNum;
    
    int  guessingNumber(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Player!! Give ur number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire{
            int numFromGusser;
             int numFromPlayer1;
              int numFromPlayer2;
               int numFromPlayer3;
               
             void collectNumFromGusser(){
                   Gusser g = new Gusser();
                   numFromGusser = g.guessingNum();
               }
             void collectNumFromPlayer(){
                 Player p1 = new Player();
                 Player p2 = new Player();
                 Player p3 = new Player();
                 
                 numFromPlayer1 =  p1.guessingNumber();
                    numFromPlayer2 =  p2.guessingNumber();
                       numFromPlayer3 =  p3.guessingNumber();
             }
             
             void comapre(){
                 if(numFromGusser == numFromPlayer1)
                 {
                         if(numFromGusser == numFromPlayer2 && numFromGusser==numFromPlayer3){
                         System.out.println("All players are winner");
                         }
                        else if(numFromGusser == numFromPlayer2){
                         System.out.println("Player 1 and Player 2 wins");
                         }
                        else if (numFromGusser == numFromPlayer3){
                         System.out.println("Player 1 and Player 3 wins");
                        }
                        else{
                        System.out.println("Player1 wins "); 
                        }
                 }
                 else if(numFromGusser == numFromPlayer2){
                     if(numFromGusser == numFromPlayer3)
                     {
                     System.out.println("Player2 and Player3  wins ");
                     }
                     else{
                         System.out.println("Player2 wins");
                     }
                 }
                   else  if(numFromGusser == numFromPlayer3){
                     System.out.println("Player3 wins ");
                 }
                   else{
                     System.out.println("No one wins!! ");
                 }
             }
}

public class GusserGame {

  
    public static void main(String[] args) {
        System.out.println("Game started");
        Umpire u = new Umpire();
        u.collectNumFromGusser();
        u.collectNumFromPlayer();
        u.comapre();
    }
    
}
