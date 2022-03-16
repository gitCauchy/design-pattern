package com.cauchy.behavior.command.practice;


/**
 * buy stock
 *
 * @author Cauchy
 * @date 2022/03/16 09:47
 **/
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
