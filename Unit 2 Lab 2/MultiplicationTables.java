//missing name and honor code statement
import java.util.*;
public class MultiplicationTables
{
public static void main(String[] arg)
{//doesn't continue to run while the user inputs non-zero numbers
Scanner input = new Scanner(System.in);
System.out.println("Enter an integer (0 to exit): ");
int i1 = ((input.nextInt()));
for(int i = 0; i<=Math.abs(i1);)
{
    if(i1 == 0)
    {
    i = 2;
        System.out.println("Sayonara!");
    }
    else
    {
        System.out.println(i + " x " + (i1) + "=" + (i1 * (i)));
        i++;

    }
}
}//end of main




}//end of class