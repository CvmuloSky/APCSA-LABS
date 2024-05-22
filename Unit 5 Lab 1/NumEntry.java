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