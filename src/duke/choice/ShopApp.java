package duke.choice;

/**
 *
 * @author gibran
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!\n");
        Customer c1 = new Customer();
        c1.name = "Pinky";
        System.out.println("Thank you, " + c1.name+"!\n"); 
        
        double tax = 0.2;
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";
        
        System.out.println("Item 1: " + item1.description +", "
                           +item1.price+", " + item1.size);
        System.out.println("Item 2: " + item2.description +", "
                           +item2.price+", " + item2.size);
        double total;
        total = 2*item2.price + 1*item1.price;
        total = total + total*tax;
        System.out.println("\nYou got 2 Orange Shirts and 1 Blue Jacket.\n");
        System.out.println("The total is $" + total);
    }
    
}
