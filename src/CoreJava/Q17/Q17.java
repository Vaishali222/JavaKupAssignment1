package CoreJava.Q17;

public class Q17 {
    public static void main(String[] args) {
                try
                {
                    System.out.println("I am in try block");
                    int arr[] = new int[6];
                    arr[3] = 7/0; // Exception occurred.
                    System.out.println(arr[7]);// Exception occurred.
                }
                catch(ArithmeticException ae)
                {
                    System.out.println("ARITHEMATIC EXCEPTION:A number cannot be divided by zero, Illegal operation in java");
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Accessing array element outside of specified limit");
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }

                finally {
                    System.out.println("I am in Finally block");
                    System.out.println("finally block is always executed");
                }
            }
        }

