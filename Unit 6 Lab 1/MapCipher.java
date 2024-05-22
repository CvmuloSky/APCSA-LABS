   /**
    * Shared by Lesley Frew, McLean HS, McLean VA
    * Accessed 2/2/21
    */
    
   public class MapCipher {
      private String mapFrom; //the original letter arrangement (for this lab, the alphabet)
      private String map; //the alphabet arranged in its map
      
      /**
       * Sets the map string and initializes the original arrangement to the standard alphabet
       * @param m the map for this cipher
       */
      public MapCipher(String m) {
         map = m;
         mapFrom = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      }
      
      /**
       * @return this cipher's map
       */
      public String getMap() {
         return map;
      }
      
      /**
       * Changes this cipher's map
       * @param m the new map for this cipher
       */
      public void setMap(String m) {
         map = m;
      }
      
      /**
       * @return this cipher's original sequence
       */
      public String getMapFrom() {
         return mapFrom;
      }
      
      /**
       * Changes this map's original sequence
       * @param m the sequence from which the map will be derived
       */
      public void setMapFrom(String m) {
         mapFrom = m;
      }
          
       /**
        * @return the cypher type with the encryption algrothm
        */   
      public String toString() {
         return "A Map Cipher with map: " + map;
      }
      
      /**
       * Encrypts each character of message to its mapped value.
       * Works with both upper and lower case letters. 
       * Punctuation is ignored and placed into the encrypted string
       * @param message the text to be encrypted
       * @return the encrypted message
       */
      public String encrypt(String message) {
         String ciphertext = "";
         for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            
            boolean isLower = false;
            if (c >= 97 && c <= 122) {
               isLower = true;
               c -= 32;
            }
            
            if (c >= 65 && c <= 90) {
               c = map.charAt(mapFrom.indexOf(c));
               if (isLower) c += 32;
            }
            ciphertext += c;
         }
         return ciphertext;
      }
      
      /**
       * Tests the MapCipher class.
       * @param args not used
       */
      public static void main(String[] args) {
         MapCipher entean = new MapCipher("AZYXEWVTISRLPNOMQKJHUGFDCB");
         System.out.println(entean.encrypt("human"));//tupan
      }
   }