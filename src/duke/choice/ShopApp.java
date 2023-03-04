package duke.choice;

/*
 * @author gibran
 */
public class ShopApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!");

        int measurement = 14;//Large size      

        Customer c1 = new Customer("Pinky", measurement);

        System.out.println("MIN_PRICE = " + Clothing.MIN_PRICE);
        System.out.println("TAX_RATE = " + Clothing.TAX_RATE);

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
            //System.out.println("Items " + counter.getDescription());/*8-1*/
            System.out.println("Item_dd " + counter);
        }

        int average = 0;//Practice 7.1; on purpose
        int count = 0;//on purpose

        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }
        try {
            average = (count == 0) ? 0 : average / count;//avoiding exception
            //average = average / count;
            System.out.println("Average price " + average + ", Count " + count);
        } catch (ArithmeticException e) {
            System.out.println("\nDON'T DIVIDE BY 0");
        }

    }
}
