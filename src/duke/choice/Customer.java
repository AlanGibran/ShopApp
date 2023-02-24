/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author gibran
 */
public class Customer {

    private String name;
    private String size;

    /* 1. Add a private  instance var called <items> to the <Customer> class
    to store an array of <Clothing> objects.*/
    private Clothing[] items; //no specific size

    /* 2. Provide a <public> method called <addItems> 
    that accepts <Clothing> arrays as an argument 
    and assigns it to the <items> instance variable.
     */
    public void addItems(Clothing[] items) { //both Clothing and items[]
        this.items = items;//items declared in 1.
    }

    /*3. Provide a <public> method in the <Customer> class that returns
    an array of <Clothing> items*/
    public Clothing[] getItems() { //Clothing[] type method        
        return items;
    }

    /*4. Provide a <public> method called  <getTotalClothingCost> 
    that calculates and returns <total> cost for all clothing 
    items of this customer.*/
    public double getTotalClothingCost() {

        double total = 0.0;

        for (Clothing counter : items) {
            total += counter.getPrice();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }
    }

}
