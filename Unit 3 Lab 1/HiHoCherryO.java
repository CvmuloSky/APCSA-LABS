import java.util.*;
public class HiHoCherryO 
{
   private static Scanner input = new Scanner(System.in);
   
   
   public static void main(String[] arg)
   {
      System.out.println("Enter the number of players today: ");
      int numPlayers = input.nextInt();
      input.nextLine();
      Player[] players = new Player[numPlayers];
      getNames(players);
      System.out.println("Here are today's players: ");
      for(int i = 0; i < players.length; i++)
      {
         System.out.println(players[i].getName());
      }
      play(players);
   }   
   public static void play(Player[] arg)
   {
      while(true)
      {
         for(int i = 0; i<arg.length; i++)
         {
            System.out.println("\n"+arg[i].getName()+"'s turn, they spin:");
            int cherries = Spinner.spin();
            System.out.println(Spinner.getMessage());
            arg[i].mutCherries(cherries);
            System.out.println(arg[i]);
            if(arg[i].hasWon())
            {
               System.out.println("\nCongrats, "+arg[i].getName() + " WINS!!!!");
               return;
            }
         }
      }
   }
      
   public static void getNames(Player[] arg)
   {
      for(int i = 0; i< arg.length; i++)
      {
         System.out.println("Enter Player #" + (i+1) + " 's name: ");
         String name = input.nextLine();
         arg[i] = new Player(name);
      }
   }//end of main
}//end of class