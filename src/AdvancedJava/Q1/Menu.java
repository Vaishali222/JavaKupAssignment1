package AdvancedJava.Q1;

import java.time.LocalTime;
import java.util.ArrayList;

public class Menu {

    // Here we are declaring an arraylist of menuList as class variable
    static ArrayList<Dish> menuList;

    //     Using static block
    static {
//       Adding some dishes by using Dish class
        Dish Burger= new Dish(1, "Burger", LocalTime.now());
        Dish Pizza= new Dish(2, "Pizza", LocalTime.now());
        Dish Fries= new Dish(3, "Fries", LocalTime.now());


//        Adding all created dishes to arraylist
        menuList = new ArrayList<Dish>();
        menuList.add(Burger);
        menuList.add(Pizza);
        menuList.add(Fries);

    }
}