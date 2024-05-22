//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment
import java.util.*;
public class PersonalCasionVer{
   public static void main(String[] args){
      Scanner sc1 = new Scanner(System.in);
      System.out.print("Choose a Name: ");
      String pn = sc1.next();
      Player player = new Player(pn);
      int spins = 0;
      SlotMachine machine;
      boolean bcon1 = true;
      String continue1;
      boolean bcon2 = false;
      String continue2;
      boolean bcon3 = false;
      String continue3;
      int  winnings = 0;
      int totalWinnings = 0;
       //automatically select the cost of the machine
      if (Math.random() < .5){
         machine = new SlotMachine(5);
         System.out.println("Welcome, " + player.getName());
         System.out.println("You will be using the original machine today, which costs 5 coins");
      }
      else{
         machine = new SlotMachine(10);
         System.out.println("Welcome, " + player.getName());
         System.out.println("You will be using the modded machine today, which costs 10 coins");
      }
    
       //keep playing while the player has enough money
      while (player.getMoney() >= machine.getCost()){
         spins++;
         machine.pull();
         System.out.println(machine);
         player.setMoney(player.getMoney() - machine.getCost());
         winnings = (int)machine.calculate();
         totalWinnings += winnings;
         if(winnings > 0){
            System.out.println("HIT!!! You win " + winnings + " coins!");
            player.setMoney(player.getMoney() + winnings);
         }
         else{
            System.out.println("Too bad! No win on this pull.");
         }
         if(winnings > 0 && bcon2)
         {
            break;
         }
         if(!bcon2){
            System.out.println("Want to go all in?(Rolls until you win Yes/No)");
            continue2 = sc1.next();
            if(continue2.equalsIgnoreCase("Yes"))
            {
               bcon2 = true;
            }
            else
            {
               bcon2 = false;
            }
            if(!bcon2){
               System.out.println(player + "\n\n");
               System.out.println("Do you want to continue? (Yes/No)");
               continue1 = sc1.next();
               if(continue1.equalsIgnoreCase("Yes"))
               {
                  bcon1 = true;
               }
               else if(continue1.equalsIgnoreCase("No"))
               {
                  bcon1 = false;
               }
               if(!bcon1)
               {
                  break;
               }
            }
         }
      }
      if(!bcon1)
      {
         System.out.print("GAME OVER! You were able to pull " + spins + " times before quitting! You're so bad at gambling, don't you know that 99.9% of gamblers quit before they hit it big??" + "\nYou won $" + totalWinnings + " before going out.\n");
      }
      else if(bcon2 && winnings > 0)
      {
         System.out.print("GAME OVER! You were able to pull " + spins + " times before winning. Now go off with the money you earned, just know you were too scared to go all in.... \nYou won $" + totalWinnings + " before going out\n.");
      }
      else
      {
         System.out.println("GAME OVER! You were able to pull " + spins + " times before going broke!" + "\nYou won $" + totalWinnings + " before going out.(Noob)\n");
      }
      if(totalWinnings == 0 && bcon1)
      {
         System.out.println("\nNo shot you just spent your life savings gambling to not even win once.");
      }
   }
}
