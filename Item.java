//Elijah Pele
package pricewatcher;

import java.util.Random;

public class Item {
    String name = "Beats Studio 3 Wireless Over-Ear Headphones";
    String url = "https://www.amazon.com/Beats-Solo3-Wireless-Ear-Headphones/dp/B01LWWY3E2/ref=sr_1_1_sspa?s=aht&ie=UTF8&qid=1549336080&sr=1-1-spons&keywords=beats+wireless+headphones&psc=1";
    String dateAdded = "06/01/2018";
    double priceChange = 0;
    double startingPrice = 279.95;
    double previousPrice;
    double currentPrice = 279.95;

    public String getName(){
        return this.name;
    }

    public String getURL(){
        return url;
    }

    public String getDateAdded(){
        return dateAdded;
    }

    public double getStartingPrice(){
        return this.startingPrice;
    }

    public double getPriceChange(){
        return this.priceChange;
    }

    public double getCurrentPrice(){
        if(this.currentPrice == 0)
            return this.startingPrice;
        return this.currentPrice;
    }

    public double checkLivePrice(){
        Random random = new Random();
        double simulatedNewPrice = 250.00 + (350.00 - 250.00) * random.nextDouble(); //Later, this will come from an actual website.
        simulatedNewPrice = Math.round(simulatedNewPrice*100.0)/100.0;
        previousPrice = currentPrice;
        currentPrice = simulatedNewPrice;
        setPriceChange();
        return this.currentPrice;
    }

    public void setPriceChange(){
        this.priceChange = ((currentPrice - previousPrice)/previousPrice) *100;
        this.priceChange = Math.round(priceChange*100.0)/100.0;
    }
}