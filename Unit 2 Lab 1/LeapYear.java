//missing name and honor code statement
import java.util.*;
public class LeapYear
{
   public static void main(String[] arg)
   
   
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a year: ");
      int year = input.nextInt();
   
      boolean isLeap = year % 4 == 0;
   
      if(isLeap && !(year % 100 == 0))
      {
         System.out.println(year + " is a leap year.");
      
      }
      else if(year % 400 == 0)
      {
         System.out.println(year + " is a leap year.");
      }
      else if (year % 100 == 0)
      {
         int a = 1;
         int b = -1;
         int randomLeap = new Random().nextBoolean() ? a : b;
         System.out.println(year + " is not a leap year." + " The closest leap year to " + year + " is " + (year + (4 * randomLeap)));
      }
      else if (!(year % 4 == 0) && (year % 2 == 0))
      {
        int a1 = 1;
        int b2 = -1;
        int randomLeap = new Random().nextBoolean() ? a1 : b2;
        System.out.println(year + " is not a leap year." + " The closest leap year to " + year + " is " + (year + (2 * randomLeap)));

      
      }
      else
      {
         if((((year/4)*4) % 100 == 0) && (!((year/4)*4 % 400 == 0)))
         {
          System.out.println(year + " is not a leap year." + " The closest leap year to " + year + " is " + (((year/4)*4) + 4));
         }
         else if((year % 400 < 2))
         {
          System.out.println(year + " is not a leap year." + " The closest leap year to " + year + " is " + ((year/4)*4));
         }
         else
         {
          System.out.println(year + " is not a leap year." + " The closest leap year to " + year + " is " + ((year/4)*4));
         }
      }
   
   
   
   }



}//end of class