package CoreJava.Q21;
import java.util.Scanner;
public class Employee {
    int empid;
    String name;
    float salary;

    public void getInput() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the empid :: ");
        empid = in.nextInt();
        System.out.print("Enter the name :: ");
        name = in.next();
        System.out.print("Enter the salary :: ");
        salary = in.nextFloat();
    }

    public void print() {

        System.out.println("Employee id = " + empid);
        System.out.println("Employee name = " + name);
        System.out.println("Employee salary = " + salary);
    }

}
class MainClass{
    public static void main(String[] args) {

        Employee[] e1 = new Employee[7];
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no of employees in Company: ");
        int n=sc.nextInt();
        for(int i=0; i<n; i++) {

            e1[i] = new Employee();
            e1[i].getInput();
        }

        System.out.println("**** Details of Employees are: ****");

        for(int i=0; i<5; i++) {

            e1[i].print();
        }
    }
}
