

/*
   This program will randomly generate a sequence of random numbers and determine the mode(s) of the sequence
   This is done using a partially-filled array of NumEntry objects. The filled portion of the array is
   sorted in descending order by frequency. Elements with the highest frequency contain mode values.
   @author Kimberly A. Baram
   @version 3.0
 */
public class FindModes {

   /**
    * Returns the first null index of data, or -1 if none of data's elements are
    * null
    */
   public static int firstAvailable(NumEntry[] data) {
      // *************************
      // ****WRITE THIS METHOD****
      // *************************
      for (int i = 0; i < data.length; i++) {
         if (data[i] == null) {
            return i;
         }
      }
      return -1;
   }

   /**
    * Prints only the non-null elements of data
    */
   public static void printArray(NumEntry[] data) {

      // *************************
      // ****WRITE THIS METHOD****
      // *************************
      for (int i = 0; i < data.length; i++) {
         if (!(data[i] == null)) {
            System.out.print(data[i] + "\n");
         }
      }
   }

   /**
    * Returns the index of data in which num is the numerical value of the entry,
    * or
    * -1 if there is no entry in data containing num as its value
    */
   public static int indexOf(NumEntry[] data, int num) {
      // *************************
      // ****WRITE THIS METHOD****
      // *************************
      for (int i = 0; i < data.length; i++) {
         if (!(data[i] == null))
            if (data[i].getValue() == num) {
               return i;
            }
      }
      return -1;
   }

   /*
    * Checks to see if data contains an entry with a value of num.
    * If so, accesses that entry and records a copy.
    * If not, creates a new NumEntry object and stores it in the
    * first available index of data.
    */
   public static void addNumToData(NumEntry[] data, int num) {
      // *************************
      // ****WRITE THIS METHOD****
      // *************************
      if (indexOf(data, num) == -1) {
         for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
               data[i] = new NumEntry(num);
               break;
            }
         }
      } else {
         data[indexOf(data, num)].recordCopy();
      }
   }

   /**
    * Swaps data[a] with data[b]
    */
   public static void swap(NumEntry[] data, int a, int b) {
      NumEntry temp = data[a];
      data[a] = data[b];
      data[b] = temp;
   }

   /**
    * Sorts the non-null elements of data by decreasing frequency order.
    */
   public static void sortByDescendingFrequency(NumEntry[] data) {
      for (int i = 0; i < data.length; i++) {
         for (int i1 = i + 1; i1 < data.length; i1++) {
            if (data[i] != null && data[i1] != null) {
               if (data[i].getFrequency() < data[i1].getFrequency()) {
                  swap(data, i, i1);
               }
            }
         }
      }
   }

   /*
    * Prints the mode(s) of data. If the array is properly sorted, then a mode will
    * be any element that
    * contains the same frequency as data[0]
    */
   public static void printModes(NumEntry[] data) {
      // *************************
      // ****WRITE THIS METHOD****
      // *************************
      for (int i = 0; i < data.length; i++) {
         if (data[i] != null)
            if (data[0].getFrequency() == data[i].getFrequency()) {
               System.out.print(data[i].getValue() + " ");
            }
      }
   }

   public static void main(String[] args) {
      NumEntry[] data = new NumEntry[15];
      System.out.println("Initial Data:");
      for (int i = 0; i < data.length; i++) {
         int num = (int) (Math.random() * 10) + 1;
         addNumToData(data, num);
         System.out.print(num + "\t");
      }
      System.out.println();
      sortByDescendingFrequency(data);
      System.out.println("Array Data:");
      printArray(data);
      System.out.println();
      System.out.println("Modes:");
      printModes(data);

   }
}