package duke.choice;

/*
 * @author gibran
 */
public class Clothing {

    private String description;
    private double price;
    private String size = "M";
    
    public final static double MIN_PRICE = 10.0;
    public final static double TAX_RATE = 0.2;

    

    /*    public Clothing() {
    }*/

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    //private final double MINIMUM = 10.0;
    //private final double MIN_TAX = 0.2;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + TAX_RATE*price;
    }

    public void setPrice(double price) {
        this.price = /*IF*/(price < 10) /*THEN*/? MIN_PRICE 
                                        /*OTHERWISE*/: price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
