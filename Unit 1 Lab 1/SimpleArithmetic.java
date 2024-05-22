//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment
import java.util.*;


public class SimpleArithmetic
{
   public static void main(String[] arg)
   {
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter input 1: ");
   int input1 = input.nextInt();
   System.out.println("Input 1 is: " + input1);
   
   
   System.out.print("Enter input 2: ");
   int input2 = input.nextInt();
   System.out.println("Input 2 is: " + input2);
   
   System.out.print("Enter input 3: ");
   int input3 = input.nextInt();
   System.out.println("Input 3 is: " + input3);
   
   System.out.print("Enter input 4: ");
   int input4 = input.nextInt();
   System.out.println("Input 4 is: " + input4);
   
   System.out.print("Enter input 5: ");
   int input5 = input.nextInt();
   System.out.println("Input 5 is: " + input5);
   
   
   
   int result1 = input1 + input2;
   int result2 = result1 * input3;
   int result3 = result2 - input4;
   int result4 = result3 / input5;
   
   
   System.out.println(input1 + "+" + input2 + "=" + result1);
   System.out.println(result1 + "*" + input3 + "=" + result2);
   System.out.println(result2 + "-" + input4 + "=" + result3);
   System.out.println(result3 + "/" + input5 + "=" + result4);
   
   
   }

}//end of class