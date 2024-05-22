public class KeywordCipher extends MapCipher{
	String keyword;
	public static String shiftToMap(String key)
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String shifted = "";
		for(int i = 0; i < key.length(); i++)
		{
			if(key.substring(0, i).indexOf(key.substring(i,i+1)) == -1)
			{
				shifted += key.substring(i,i+1);
			}
		}
		for(int i = 0; i < alphabet.length(); i++)
			{
				if(shifted.indexOf((alphabet.substring(i, i+1))) == -1)
				{
					shifted += alphabet.substring(i, i+1);
				}

			}
		return shifted; 
	}

	public KeywordCipher(String skibidi)
	{
		super(shiftToMap(skibidi));
		keyword = skibidi;
	}
	

	public String toString()
	{
		return "A Keyword Cipher with keyword: " + keyword;
	}
	
}
