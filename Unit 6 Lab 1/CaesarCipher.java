public class CaesarCipher extends MapCipher
{
   private int shiftNum;
   public static String shiftToMap(int s)
   {
      String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String shiftedalph = alphabet.substring(26-s, alphabet.length()) + alphabet.substring(0, 26-s);
      return shiftedalph;

   }

   public CaesarCipher(int s)
   {
   super(shiftToMap(s));
   shiftNum = s;

   }

   public CaesarCipher()
   {
      super(shiftToMap(13));
      shiftNum = 13;

   }

   public int getShift()
   {
      return shiftNum;

   }

   public String toString()
   {
      return "A Caesar Cipher with right shift of " + shiftNum;
      
   }

}