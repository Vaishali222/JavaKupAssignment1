package CoreJava.Q3;
import java.util.Scanner;
public class Q3 {
    static void removeChar(String s, char c)
    {
        int j, count = 0, n = s.length();
        char []t = s.toCharArray();
        for (int i = j = 0; i < n; i++)
        {
            if (t[i] != c)
                t[j++] = t[i];
            else
                count++;
        }
        while(count > 0)
        {
            t[j++] = '\0';
            count--;
        }

        System.out.println(t);
    }

    public static void main(String[] args) {
        String str1 = "abcdefabcdeabcdaaa";
        System.out.println("\nString is:"+str1);
        System.out.println("\nEnter Character to remove from the string:");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        removeChar(str1, c);
    }

}