package pricewatcher_homework2.control;

import pricewatcher_homework2.model.Item;

import java.util.Random;

public class PriceFinder {
    private Item item;
    public PriceFinder(){}
    public  PriceFinder(Item item){
        this.item = item;
    }

    public double livePrice(String url) {
        Random random = new Random();
        double simulatedNewPrice = 250.00 + (350.00 - 250.00) * random.nextDouble(); //Later, this will come from an actual website.
        simulatedNewPrice = Math.round(simulatedNewPrice * 100.0) / 100.0;
        return simulatedNewPrice;
    }
}