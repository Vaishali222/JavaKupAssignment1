package CoreJava.Q10;
import java.util.*;
public class Q10b {
    public static void main(String[] args) {
        System.out.println("USING THE DO-WHILE LOOP");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = keyboard.next();
        do {
            if(word.charAt(0) == word.charAt(word.length() - 1))
            {
                System.out.println("First and last character of the word ("+word+") is equal");
            }
            else
            {
                System.out.println("First and last character of the word ("+word+") is not equal");
            }
            word = keyboard.next();
        } while (!word.equals("done"));
    }
}