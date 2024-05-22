//Nathan Nguyen


//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment
import java.util.*; //Includes scanner class (from template)




public class Namerearrangement
{
   public static void main(String[] arg)
   {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a name in (First, Middle, Last) format: ");
   //this needs to be taking in the full name as a single string.
   String fullName = input.nextLine();//this should use string methods, not the scanner
   
   int space = fullName.indexOf(" ");
   int space1 = fullName.lastIndexOf(" ");
   int length = fullName.length();
   
   
   String fName = fullName.substring(0,space);
   String mName = fullName.substring((space+1),space1);
   String lName = fullName.substring((space1+1), (length));
   
   // System.out.println(space1);//For testing ints
   
   
   System.out.println("Initials: " + fName.substring(0,1) + mName.substring(0,1) + lName.substring(0,1));
   System.out.println("Rearranged name: " + lName + ", " + fName + " " + mName.substring(0,1) + ".");
   
   
   }


}