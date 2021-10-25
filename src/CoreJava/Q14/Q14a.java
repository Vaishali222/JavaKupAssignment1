package CoreJava.Q14;
//ClassNotFoundException exception
public class Q14a {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("Demo");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
