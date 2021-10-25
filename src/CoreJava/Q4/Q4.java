package CoreJava.Q4;
import java.util.Scanner;
public class Q4 {
    static String reverse(String str)
    {
        String rev="";
        for(int i=str.length();i>0;--i)
        {
            rev=rev+(str.charAt(i-1));
        }
        return rev;
    }
    public static void main(String args[])
    {
        Q4 ob=new Q4();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=sc.nextLine();//reading string from user
        System.out.print("Before reversing the string: "+str);
        System.out.print("After reversing the string: "+Q4.reverse(str));

    }
}
