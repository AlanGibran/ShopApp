package duke.choice;

/**
 *
 * @author gibran
 */
public class Clothing {

    private String description;
    private double price;
    private String size = "M";

    private final double MINIMUM = 10.0;
    //private final double MIN_TAX = 0.2;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
//        price = price + MIN_TAX*price;
        return price;
    }

    public void setPrice(double price) {
        this.price = (price < 10) ? MINIMUM : price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
