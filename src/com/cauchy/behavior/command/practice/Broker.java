package com.cauchy.behavior.command.practice;


import java.util.ArrayList;
import java.util.List;

/**
 * broker
 *
 * @author Cauchy
 * @date 2022/03/16 09:51
 **/
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
