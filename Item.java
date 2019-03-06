package pricewatcher_homework2.model;
import control.PriceFinder;
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
        return this.url;
    }

    public String printURL(){
        String url = this.url.substring(0,40)+"...";
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
    public String printCurrentPrice(){
        String currPrice = Double.toString(this.currentPrice);
        currPrice = "$" +currPrice;
        return currPrice;
    }

    public double checkLivePrice(){

        PrieFinder priceFinder = new PriceFinder();
        String newPrice = priceFinder.livePrice();
        double newPrice = new PriceFinder(this.url);

        previousPrice = currentPrice;
        currentPrice = newPrice;
        setPriceChange();
        return this.currentPrice;
    }

    public void setPriceChange(){
        //PricerFinder(this.item);
        this.priceChange = ((currentPrice - previousPrice)/previousPrice) *100;
        this.priceChange = Math.round(priceChange*100.0)/100.0;
    }
}
