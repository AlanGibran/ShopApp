package duke.choice;

/*
 * @author gibran
 */
public class ShopApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!");

        int measurement = 14;//Large size

        Customer c1 = new Customer("Pinky", measurement);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "S");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        /*Another form of instantiate the array: <new Clothing()>*/
        Clothing items[] = {item1, item2,
            new Clothing("Green Scarf", 10.5, "S"),
            new Clothing("Blue T-Shirt", 10.5, "S")};

        /*REVISAR ESTO 022523*/
        c1.addItems(items);//add all (4) items to the <Clothing[] items> array

        System.out.println("Customer is " + c1.getName()
                + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());

        for (Clothing counter : items) {
            System.out.println("Items " + counter.getDescription());
        }
    }
}
