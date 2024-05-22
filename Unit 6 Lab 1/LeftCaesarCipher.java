public class LeftCaesarCipher extends CaesarCipher{
	   public LeftCaesarCipher(int s)
   {
	  super(26-s);
   }
   public String toString()
   {
	  return "A Caesar Cipher with left shift of " + (26-getShift());
   }
}
