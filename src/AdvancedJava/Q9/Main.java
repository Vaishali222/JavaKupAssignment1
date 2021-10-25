package AdvancedJava.Q9;

import AdvancedJava.Q9.P1.*;
import AdvancedJava.Q9.P2.*;

public class Main {
    public static void main(String[] args) {
        TwoDim ref;
        System.out.println("Two Dimensional");
        ref = new TwoDim(20, 30);
        System.out.println(ref);

        System.out.println("Three Dimensional");
        ref = new ThreeDim(30, 70, 90);
        System.out.println(ref);
    }
}