//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment

public class Player
{
SlotMachine sm1 = new SlotMachine(10);
   private int money;
   private String name;
   public Player(String n)
   {
      name = n;
      money = 100;
   }

   public String getName()
   {
      return name;
   }
   public int getMoney()
   {
      return money;
   }

   public void setMoney(int a)
   {
   money = a;
   }
   @Override
   public String toString()
   {
   String ret = name + ", you have " + money + " coins left.";
   return ret;
   }
}