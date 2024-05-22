//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment
public class NumEntry
{
   int value;
   int frequency;
   public NumEntry(int v)
   {
      value = v;
      frequency = 1;
   }
   public void recordCopy()
   {
      frequency++;
   }
   public int getValue()
   {
      return value;
   }
   public int getFrequency()
   {
      return frequency;
   }
@Override
public String toString()
{
return "{Value: " + value + ", Freq: " + frequency+"}";
}

}