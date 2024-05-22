//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment
public class SlotReel
{
   private int value = 0;
   private String symbol = "";
   public int spin()
   {
      value = (int)(Math.random() * 6) + 1;
      return value;
   }
   public boolean equals(int a)
   {
      if(a == value)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   public int getValue()
   {
      return value;
   }
   
   @Override
   public String toString()
   {
      if(value == 1)
      {
         symbol = "Diamond";
      }
      else if(value == 2)
      {
         symbol = "Heart";
      }
      else if(value == 3)
      {
         symbol = "Spade";
      }
      else if(value == 4)
      {
         symbol = "Horseshoe";
      }
      else if(value == 5)
      {
         symbol = "Star";
      }
      else
      {
         symbol = "Liberty Bell";
      }
      return symbol;
   }
}