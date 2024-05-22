import java.util.*;
public class Palindrome {
    public static void main(String[] arg) {
        ArrayList<String> tL = new ArrayList<String>();
        ArrayList<String> isPal = new ArrayList<String>();
        try (Scanner input = new Scanner(System.in)) {
            int i = 0;
            while (i != -1) {
                System.out.println("Enter an input, or -1 to exit:");
                String temp = input.nextLine();
                if (temp.equals("-1"))
                    break;
                tL.add(temp);
            }
            for (int j = 0; j < tL.size(); j++) {
                if (isPalindrome(tL.get(j)))
                    isPal.add(tL.get(j));
            }
            System.out.println("All inputs:\n" + tL);
            System.out.println("Palindromes:\n" + isPal);
        }
    }
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}