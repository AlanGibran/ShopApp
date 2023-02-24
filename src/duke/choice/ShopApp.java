package duke.choice;

/*
 * @author gibran
 */
public class ShopApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!");
        Customer c1 = new Customer();
        c1.setName("Pinky");

        int measurement = 8;//Large size
        c1.setSize(measurement);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        /*Another form of instantiate the array: <new Clothing()>*/
        Clothing items[] = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        items[2].setDescription("Green Scarf");
        items[2].setPrice(5.0);
        items[2].setSize("S");

        items[3].setDescription("Blue T-Shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");

        c1.addItems(items);//add all (4) items to the <Clothing[] items> array

        System.out.println("Customer is " + c1.getName()
                + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());

        for (Clothing counter : items) {
            System.out.println("Items " + counter.getDescription());
        }
    }
}
