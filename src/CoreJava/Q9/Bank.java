package CoreJava.Q9;
import java.io.*;
import java.util.Scanner;
public abstract class Bank {
    public String name;
    public String branch;
    public double roi;

    public abstract void getDetails();
}

class SBI extends Bank{
    public String name;
    public String branch;
    public double roi;
    SBI(String name, String branch, double roi){
        this.name=name;
        this.branch=branch;
        this.roi=roi;
    }

    @Override
    public void getDetails() {
        System.out.println("Bank Name: "+name+"\nBranch: "+branch+"\nRate of Interest: "+roi);
    }
}

class BOI extends Bank{
    BOI(String name, String branch, double roi){
        this.name=name;
        this.branch=branch;
        this.roi=roi;
    }

    public String name;
    public String branch;
    public double roi;

    @Override
    public void getDetails() {
        System.out.println("Bank Name: "+name+"\nBranch: "+branch+"\nRate of Interest: "+roi);
    }
}

class  ICICI extends Bank{
    ICICI(String name, String branch, double roi){
        this.name=name;
        this.branch=branch;
        this.roi=roi;
    }

    public String name;
    public String branch;
    public double roi;

    @Override
    public void getDetails() {
        System.out.println("Bank Name: "+name+"\nBranch: "+branch+"\nRate of Interest: "+roi);
    }
}


class Q9{
    public static void main(String[] args) {
        Bank sbi = new SBI("State Bank Of India", "Gurgaon", 17.0);
        Bank boi = new SBI("Bank Of India", "Gurgaon", 16.0);
        Bank icici = new SBI("ICICI Bank", "Gurgaon", 17.3);
        sbi.getDetails();
        boi.getDetails();
        icici.getDetails();
    }
}