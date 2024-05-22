//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment
/**
 * generates random array of integers and creates an alternate array without duplicates
 * @author Michael Cortina - Woodson HS Class of 2022 - proofed by Kimberly A. Baram
 * @version 1.1
 * @since 1.0
 */

public class RemoveDuplicates
//Your first array keeps adding a 0 at the end
{ 

  /**
    * @param size the length of the array to be built
    * @param min the smallest value for any element of the array
    * @param max the largest value for any element of the array
    * @return an array containing "size" elements, with each element randomly generated between min and max inclusive
    */
   public static int[] buildArray(int size, int min, int max)
   {
      int[] arr = new int[size]; //TEMPORARY
      for(int i = 0; i < size; i++)
      {
         arr[i] = (int)(Math.random()*(max-min)) + min;
      }
      return arr;
   }
   
   
  /**
    * @param num the value to be tested for duplicate status
    * @param arr the array num is located in
    * @param index the index at which num is located in arr
    * @return true if num has a duplicate after index, false otherwise
    */
   public static boolean isDuplicate(int num, int[] arr, int index){
      for(int i = 0; i < arr.length; i++)
      {
         if(arr[i] == num && i > index)
         {
         
            return true;
         }
      }
      return false; //TEMPORARY
   }
   
   /**
    * @param arr the array from which the duplicates are to be counted
    * @return the number of duplicates in arr. For example, if arr contains
    *    [5, 2, 2, 5, 1, 5, 8, 6, 8, 2, 7, 3, 4], then countDuplicates returns 5
    *  because there the 2's and 5's appear a total of 7 times in the array,
    *  so we consider one  instance of each number unique, and the remaining
    *  5 are considered duplicates.
    *  Hint: use the isDuplicate method above to shorten this method's body
    */
   public static int countDuplicates(int[] arr)
   {
      int numOfDuplicates = 0;
      for(int i = 0; i < arr.length; i++){
         if(isDuplicate(arr[i], arr, i))
         {
            numOfDuplicates++;
         }
      }
      return numOfDuplicates; //TEMPORARY
   }
 
   /**
    * Pre: 0 <= numUnique <= arr.length
    * Post: arr is unchanged
    * @param arr the array from which the new array is sourced
    * @param numUnique the number of unique values in arr
    * @return an array consisting of the unique values of arr. For example if arr contains [2, 2, 8, 6, 8, 2, 3, 4],
    *    the returned array contains [6, 8, 2, 3, 4] (order doesn't matter as long as correct numbers appear)
    * Hint: The number of unique elements is the diffrence between arr's length and the number of duplicates.
    * Use the countDuplicates method to help you determine the size of the new array, and the isDuplicate 
    * method to determine the unique values to go into the new array.
    */
   public static int[] buildUniqueArray(int[] arr)
   {
      int[] uniques = new int[arr.length- countDuplicates(arr) - 1]; //TEMPORARY
      int i1 = 0;
      for(int i = 0; i < arr.length - 1; i++)
      {
         if(!(isDuplicate(arr[i], arr, i)))
         {
            uniques[i1] = arr[i];
            i1++;
         }
      }
      return uniques;
   }
   
   
   /**
    * Outputs the contents of arr on a single line.
    * Example: [ 7 8 5 9 4 2 4 9 9 1 10 9 5 4 6 5 1 8 10 6 ]
    * @param arr the array to be printed
    */
   public static void printArray(int[] arr)
   {  
      System.out.print("[ ");
      for(int i = 0; i < arr.length; i++)
         System.out.print(arr[i] + " ");
      System.out.println("] \n");
   }
   
   /**
    * Prompts the user for an array size, and for minimum and maximum values for the elements of the array.
    * Error-checks that array size is positive, and that maximum value is greater than minimum.
    * Prints the array of randomly generated values.
    * Prints an array containing only unique numbers.
    * Prints the number of duplicate values in the array.
    */
   public static void main(String[] args){
      //generate random array
      int size = (int)(Math.random() * 11) + 10;
      int min = 1;
      int max = 10;
      
      //build and output starting array
      int[] mainArr = buildArray(size, min, max); 
      System.out.println("Your array is:");
      printArray(mainArr);
      
      //build and output array for duplicate numbers
      if (countDuplicates(mainArr) > 0){ 
         int[] uniques = buildUniqueArray(mainArr);
         System.out.println("Your unique numbers are:");
         printArray(uniques);
         System.out.println("Your array had " + countDuplicates(mainArr) + " duplicates");
      }
      else{
         System.out.println("No duplicates in array!");
      }
   }
}