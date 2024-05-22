//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment
public class SlotMachine
{
   private int cost;
   private int multiplier;
   SlotReel r1 = new SlotReel();
   SlotReel r2 = new SlotReel();
   SlotReel r3 = new SlotReel();
   public SlotMachine(int c)
   {
      cost = c;
      multiplier = (int)((1.0/5)*cost);
   }
   public void pull()
   {
      r1.spin();
      r2.spin();
      r3.spin();
   }
   public int getCost()
   {
      return cost;
   }
   
   private boolean hit3()
   {
      if(r1.equals(r1.toString().equals(r2.toString()) && r2.toString().equals(r3.toString())
      && !r1.toString().equals("Horseshoe") && !r1.toString().equals("Star")))
      {
         return true;
      }
      else{
      return false;
      }
   }
   private boolean hit2()
   {
      if(r1.toString().equals("Horseshoe") && r2.toString().equals("Horseshoe"))
      {
         return true;
      }
      else{
      return false;
      }
   }
   public int calculate()
   {
      if(hit3())
      {
      if(r1.equals(1))
      {
         return multiplier * 30;
      }
      else if(r1.equals(2))
      {
         return multiplier * 40;
      }
      
      else if(r1.equals(3))
      {
         return multiplier * 20;
      }
      else if(r1.equals(6))
      {
         return  multiplier * 50;
      }
      
      }
      if(hit2())
      {
      if(r3.equals(5))
      {
         return multiplier * 10;
      }
      
      else
      {
         return multiplier * 5;
      }
   }
   return 0;
}
   @Override
   public String toString()
   {
   String ret1 = "Cost: " + cost + "\nYOUR SPIN:" + "\n" + r1 + "\t\t\t" + r2 + "\t\t\t" + r3;
   return ret1;
   }
}