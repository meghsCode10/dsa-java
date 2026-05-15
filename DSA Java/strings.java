
import java.util.*;

public class strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    // PALINDROME STRING OR NOT
    // BOOLEAN NO NEED TO STORE IN ANY STRING OR ANY VARIABLE
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //SHORTESTPATH  QUESTION
    public static float getShortestPatth()

    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c' };
        String str = "Meghna";
        String str2 = new String("XYZ");
        System.out.println(str);
        System.out.println(str2);
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String name1 = sc.nextLine();
        // System.out.println(name);
        // System.out.println(name1);

        String fullName = "Tony Stark";
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(8));

        String firstName = "Meghna";
        String lastName = "Rajput";
        String fullName2 = firstName + " " + lastName;
        System.out.println(fullName2);

        printLetters(str);

        // boolean palindrome = isPalindrome("racecar");
        System.out.println(isPalindrome("racecar"));

    }
}
