//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment

import java.util.*;

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
   public static int firstAvailable(ArrayList<NumEntry> data) {
      // *************************
      // ****WRITE THIS METHOD****
      // *************************
      for (int i = 0; i < data.size(); i++) {
         if (data.get(i) == null) {
            return i;
         }
      }
      return -1;
   }

   /**
    * Prints only the non-null elements of data
    */
   public static void printArray(ArrayList<NumEntry> data) {
      NumEntry temp;
      for (int i = 0; i < data.size(); i++) {
         if (data.get(i) != null) {
            temp = data.get(i);
            System.out.print(temp + "\n");
         }
      }
   }

   /**
    * Returns the index of data in which num is the numerical value of the entry,
    * or
    * -1 if there is no entry in data containing num as its value
    */
   public static int indexOf(ArrayList<NumEntry> data, int num) {
      // *************************
      // ****WRITE THIS METHOD****
      // *************************
      for (int i = 0; i < data.size(); i++) {
         if (data.get(i) != null && ((data.get(i)).getValue() == num)) {
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
   public static void addNumToData(ArrayList<NumEntry> data, int num) {
      // *************************
      // ****WRITE THIS METHOD****
      // *************************
      if (indexOf(data, num) == -1) {
         for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == null) {
               data.add(i, new NumEntry(num));
               break;
            }
         }
      } else {
         NumEntry temp = data.get((indexOf(data, num)));
         temp.recordCopy();
      }
   }

   /**
    * Swaps data[a] with data[b]
    */
   public static void swap(ArrayList<NumEntry> data, int a, int b) {
      data.set(b, data.set(a, data.get(b)));
   }

   /**
    * Sorts the non-null elements of data by decreasing frequency order.
    */
   public static void sortByDescendingFrequency(ArrayList<NumEntry> data) {
      for (int i = 0; i < data.size() - 1; i++) {
         int indMin = i;
         for (int j = i + 1; j < data.size(); j++) {
            if (data.get(indMin) != null && data.get(j) != null
                  && data.get(indMin).getFrequency() < data.get(j).getFrequency()) {
               swap(data, j, i);
            }
         }
      }
   }

   public static void printModes(ArrayList<NumEntry> data) {
      for (int i = 0; i < data.size() - 1; i++) {
         if (data.get(i) != null && data.get(i + 1) != null
               && ((data.get(0)).getFrequency() == (data.get(i)).getFrequency())) {
            NumEntry temp = (data.get(i));
            System.out.print(temp.getValue() + " ");
         }
      }
   }

   public static void main(String[] args) {
      ArrayList<NumEntry> data = new ArrayList<NumEntry>();
      System.out.println("Initial Data:");
      for (int i = 0; i < 15; i++) {
         data.add(i, null);
      }
      for (int i = 0; i < data.size(); i++) {
         int num = (int) (Math.random() * 10) + 1;
         addNumToData(data, num);
         System.out.print(num + "\t");
      }
      // System.out.println("\n\n\n\n\n" + data.size()); //USED FOR TESTING ARRAYLIST
      // SIZE
      System.out.println();
      sortByDescendingFrequency(data);
      System.out.println("Array Data:");
      printArray(data);
      System.out.println();
      System.out.println("Modes:");
      printModes(data);

   }
}