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
        
        
        c1.setName("Pinky");
        System.out.println("Thank you, " + c1.getName()+"!\n"); 

        
        int measurement = 3;
        

        c1.setSize(measurement);//sin usar var_1 = valor_x
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

/*Another form of instantiate the array: <new Clothing()>*/        
        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};
        
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
        
        double total;
        

        
        total = 0.0;
        for(Clothing counter: items){
            if(c1.getSize().equals(counter.getSize())){
                total += counter.getPrice();
                System.out.println(counter.getDescription() +
                    ", " + counter.getSize() +
                    ", " + counter.getPrice());//si hay dos calls a
                if(total>15){//getPtice(es doble impuesto)
                break;
                }
            }
        }
/*This version does not have the tax thing*/
        System.out.println("\nThe total is $" + total);
    }
    
}
