package CoreJava.Q7;
import java.util.Scanner;
public class Q7 {
    static int countinString(char ch, String s)
    {

        if(s.length()==0)
            return 0;

        int count = 0;

        //checking if it is the first character
        if(s.charAt(0)==ch)
            count++;

        count+=countinString(ch,s.substring(1));
        return count;
    }
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();

        System.out.print("Enter the character to find its occurence: ");
        char c = sc.next().charAt(0);

        System.out.println(countinString(c,str));
    }
}
