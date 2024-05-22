//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment
import java.util.*;
public class ClientAutomated
{
   public static void main(String[] arg)
   {
      Player p1 = new Player("Tweedle Dee");
      Player p2 = new Player("Tweedle Dum");
      System.out.println("Player 1 name: " + p1.getName());
      System.out.println("Player 2 name: " + p2.getName());
      for(int i = 0; i < 1;)
      {
         boolean pb1 = p1.hasWon();
         boolean pb2 = p2.hasWon();
         p1.mutCherries(Spinner.spin());
         System.out.println(p1.getName() + " spins: " + Spinner.getMessage());
         System.out.println("Tree Cherries: " + p1.getTreeCherries());
         System.out.println("Bucket Cherries: " + p1.getBucketCherries() + "\n\n");
         pb1 = p1.hasWon();
         if(pb1)
         {
            System.out.println("\n\n"+p1.getName() + " wins! ");
            i++;
         }
         if(!(pb1))
         {
         p2.mutCherries(Spinner.spin());
         System.out.println(p2.getName() + " spins: " + Spinner.getMessage());
         System.out.println("Tree Cherries: " + p2.getTreeCherries());
         System.out.println("Bucket Cherries: " + p2.getBucketCherries() + "\n\n");
         pb2 = p2.hasWon();
         }
         if(pb2)
         {
            System.out.println("\n\n"+ p2.getName() + " wins! ");
            i++;
         }
      }
   }//end of main
}//end of class