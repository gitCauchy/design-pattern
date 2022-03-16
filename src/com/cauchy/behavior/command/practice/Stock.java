package com.cauchy.behavior.command.practice;

/**
 * Stock
 *
 * @author Cauchy
 * @date 2022/03/16 09:44
 **/
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ] sold ");
    }
}
