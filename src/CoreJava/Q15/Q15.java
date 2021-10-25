package CoreJava.Q15;
class Singleton
{
    // static variable s of type Singleton
    private static Singleton s = null;

    public String str;

    private Singleton()
    {
        str = "it is an example of singleton class.";
    }
    //static method to create an instance of the Singleton class

    public static Singleton getInstance()
    {
        //lazy initialization
        if (s== null)
            s = new Singleton();
        return s;
    }
}

public class Q15 {
    public static void main(String args[])
    {
        // instantiating Singleton class with variable a
        Singleton a = Singleton.getInstance();
        // instantiating Singleton class with variable b
        Singleton b= Singleton.getInstance();

        // changing variable of instance a
        a.str = (a.str).toUpperCase();
        System.out.println("String from a is " + a.str);
        System.out.println("String from b is " + b.str);

    }




}
