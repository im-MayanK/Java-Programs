import java.util.Scanner;
class Guesser
{
    int guesser()
    {
        
        System.out.println("Guesser guess the value");
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        return a;
    }
}
class Player
{
    Scanner scan= new Scanner(System.in);
    int player()
    {
        System.out.println("Hey! Player  Enter the input");
        int a=scan.nextInt();
        return a;
    }
    
}
class Empire{
 

     void compare()
     {
     Guesser a= new Guesser();
     int inputFromGuesser = a.guesser();
     Player b=new Player();
     int inputFromPlayer1= b.player();
      int inputFromPlayer2= b.player();
      int inputFromPlayer3= b.player();
     
         if (inputFromGuesser==inputFromPlayer1)
         {
            if (inputFromGuesser==inputFromPlayer2 && inputFromGuesser==inputFromPlayer3)
            {
                System.out.println("All players won the game");
                }
                else if (inputFromGuesser==inputFromPlayer2)
                {
                    System.out.println("PLayer 1 And Player 2 won the game");
                }
                else if (inputFromGuesser==inputFromPlayer3)
                {
                    System.out.println("PLayer 1 And Player 2 won the game");
                }
                else {
                    System.out.println("PLayer 1 won the game");
                }
                }

            
         else if (inputFromGuesser==inputFromPlayer2)
         {
            
            if (inputFromGuesser==inputFromPlayer3)
            {
                System.out.println(" Player 2 And Player 3 won the game");
            }
            else {
            System.out.println("PLayer 2 won the game");
            }
         }
         else if (inputFromGuesser==inputFromPlayer3)
         {
             System.out.println(" Player 3 won the game");
         }
         else 
         {
            System.out.println("Nobody won the game");
         }



     }

}

public class LaunchGame {
    public static void main(String[] args) {
      ;
        Empire c=new Empire();
        c.compare();
      
        
    }
    
}
