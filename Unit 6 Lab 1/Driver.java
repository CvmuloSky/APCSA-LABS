//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment

public class Driver {
	
	public static void main(String[] args) {

		MapCipher skibidi = new MapCipher("MDKLBTHUNVAXWOIYCZEQSFRPGJ");
		CaesarCipher caesarn = new CaesarCipher();
		CaesarCipher caesar = new CaesarCipher(3);
		LeftCaesarCipher left = new LeftCaesarCipher(3);
		KeywordCipher keyword = new KeywordCipher("SKIBIDIIIIIII");

		String sskibidi = "Skibid toilet";
		System.out.println(sskibidi);
		System.out.println("A Map Cipher with map: " + skibidi.getMap());
		System.out.println(skibidi.encrypt(sskibidi));
		System.out.println();

		
		String scaesarn = "Sigma Ohio rizzler";
		System.out.println(scaesarn);
		System.out.println(caesarn);
		System.out.println(caesarn.encrypt(scaesarn));
		System.out.println();
		
		
		String scaesar = "Get fanum taxed no kappa";
		System.out.println(scaesar);
		System.out.println(caesar);
		System.out.println(caesar.encrypt(scaesar));
		System.out.println();

		
		String sleft = "Slay queen slay";
		System.out.println(sleft);
		System.out.println(left);
		System.out.println(left.encrypt(sleft));
		System.out.println();

		
		String skeyword = "sticking out your gyatt for rizzler";
		System.out.println(skeyword);
		System.out.println(keyword);
		System.out.println(keyword.encrypt(skeyword));
		System.out.println();

	}
}
