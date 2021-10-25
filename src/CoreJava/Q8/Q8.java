package CoreJava.Q8;

public class Q8 {
    static String firstName = "Vaishali";
    static String lastName = "Yadav";
    static int age = 24;

    //Static Block
    static {
        System.out.println("In static block");
        System.out.println("Firstname:"+firstName);
        print();
    }

    //Static Method
    private static void print(){
        System.out.println("In static method");
        System.out.println("Lastname:"+lastName);
    }

    //Print age using Static variable
    public static void main(String[] args) {
        System.out.println("In main");
        System.out.println("Age:"+ age);

    }


}
