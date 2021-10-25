package CoreJava.Q18.Part1;

import java.util.Scanner;

interface Addition{
    int add(int num1, int num2);
}
interface Subtration{
    int subtract(int num1, int num2);
}

@FunctionalInterface
interface Multiplication{
    abstract int multiply(int num1, int num2);
}

class InstanceReference{
    public int add(int num1, int num2){

        return num1 + num2;
    }
    public int subtraction(int num1, int num2){
        return num1 - num2;
    }
}
class StaticReference{
    static int multiplication(int num1, int num2){
        return num1 * num2;
    }
}

class MehodReference {
    public static void main(String[] args) {
        InstanceReference instanceReference = new InstanceReference();
        Addition add = instanceReference::add;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Additon : "+add.add(a,b));

        Subtration sub = instanceReference::subtraction;
        System.out.println("Subtraction : "+sub.subtract(a,b));

        Multiplication mul = StaticReference::multiplication;
        System.out.println("Multiplication : "+mul.multiply(a,b));
    }
}
