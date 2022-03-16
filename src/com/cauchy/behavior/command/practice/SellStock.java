package com.cauchy.behavior.command.practice;

/**
 * sell stock
 *
 * @author Cauchy
 * @date 2022/03/16 09:49
 **/
public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
