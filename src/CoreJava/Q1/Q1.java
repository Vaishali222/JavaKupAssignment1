package CoreJava.Q1;
import java.util.Scanner;

public class Q1 {
    public boolean check(String s)
    {
        int length = s.length();
        for (int i = 0; i < length - 2; i++)
        {
            if (s.charAt(i) == 'p' && s.charAt(i+2) == 'p')
                return true;
        }
        return false;
    }
    public static void main (String[] args)
    {
        Q1 object= new Q1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str =  sc.nextLine();
        System.out.println("The String is: "+str);
        Boolean result=object.check(str);
        if(result==true)
          System.out.println("The String contains 'pop' as a substring");
        else
            System.out.println("The String DOES NOT contain 'pop' as a substring");
    }
}
