//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment
public class Player
{
   private String name;
   private int treeCherries, bucketCherries;
   public Player(String s)
   {
      name = s;
      treeCherries = 10;
      bucketCherries = 0;
   }
      public void mutCherries(int a)
   {
    if(bucketCherries + treeCherries == 10)
    {
        bucketCherries = bucketCherries + a;
        treeCherries = treeCherries - a;
        if(bucketCherries <= 0)
        {
         treeCherries = 10;
        }
        if(bucketCherries >= 10)
        {
         treeCherries = 0;
        }
        if(bucketCherries <= 0)
        {
            bucketCherries = 0;
        }
        else if(bucketCherries >= 10)
        {
            bucketCherries = 10;
        }
    }
   }
   public String getName()
   {
      return name;
   }
   public int getTreeCherries()
   {
      return treeCherries;
   }
   public int getBucketCherries()
   {
      return bucketCherries;
   }

   public boolean hasWon()
   {
      if(bucketCherries == 10)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   @Override
   public String toString()
   {
      String message = "\nName: " + name + "\nTree cherries: " + treeCherries + "\nBucket cherries: " + bucketCherries;
      return message;
   }

}//end of class