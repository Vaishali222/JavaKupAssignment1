package AdvancedJava.Q8;
import java.io.FileInputStream;
import java.util.Scanner;

public class TryCatch
{
    public static void main(String[] args)
    {
        int a=7,b=0,c;
        try
        {
            //Arithematic Exception
            c=a/b;

            //These lines will not be exceuted as arithmetic exception occurs and it is shifted to catch block
            //Null Pointer Excpetion
            String str = null;
            System.out.println(str.length());

        }

        catch(NullPointerException e)
        {
            System.out.println("NullPointer Exception"+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}