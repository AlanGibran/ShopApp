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
        System.out.println("Welcome to Duke Choice Shop!");
        Customer c1 = new Customer();
        
        
        c1.name = "Pinky";
        System.out.println("Thank you, " + c1.name+"!\n"); 

        
        int measurement = 3;
        

        switch(measurement){
            case 1: case 2: case 3: 
                c1.size = "S";
                break;
            case 4: case 5: case 6:
                c1.size = "M";
                break; 
            case 7: case 8: case 9:
                c1.size = "L";
                break;
            default:
                System.out.println("Error, wrong size.");
                c1.size = "X";
                break;
        }
               
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";
        
        items[2].description = "Green Scarf";
        items[2].price = 5.0;
        items[2].size = "S";
        
        items[3].description = "Blue T-Shirt";
        items[3].price = 10.5;
        items[3].size = "S";
        
       
        double tax;
        double total;
        
        total = 0;
        for(Clothing counter: items){
            if(c1.size.equals(counter.size)){
                System.out.println(counter.description +
                    ", " + counter.size +
                    ", " + counter.price);
                total += counter.price;
            }
            if(total>15){
                break;
            }
        }
        
        tax = 0.2;
        total = total+total*tax;
        System.out.println("\nThe total is $" + total);
    }
    
}
