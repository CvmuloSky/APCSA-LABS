//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment
import java.util.*;
public class Spinner
{
   private static String message = "";
   public static int spin()
   {
      int ran1 = (int)(Math.random() * 7) + 1;
      if(ran1 == 1)
      {
         message = "Take 1 cherry from the tree.";
         return ran1;
      }
      else if (ran1 == 2)
      {
         message = "Take 2 cherries from the tree.";
         return ran1;
      }
      else if (ran1 == 3)
      {
         message = "Take 3 cherries from the tree.";
         return ran1;
      }
      else if (ran1 == 4)
      {
         message = "Take 4 cherries from the tree.";
         return ran1;
      }
      else if (ran1 == 5)
      {
         message = "Oh no, a dog has come and eaten some of your cherries. Put 3 cherries back on your tree";
         return -3;
      }
      else if (ran1 == 6)
      {
         message = "Oh no, a bird has come and eaen some of your cherries. Put 2 cherries back on your tree";
         return -2;
      }
      else
      {
         message = "Oh no, your basket spilled! put all of your cherries back on your tree";
         return -10;
      }
   }//end of spin
   public static String getMessage()
   {
      return message;
   }
}//end of class