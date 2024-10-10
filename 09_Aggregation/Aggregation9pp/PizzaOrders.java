package Aggregation9pp;
import java.util.*;


public class PizzaOrders {

    PizzaOrders() {
    }

   
    private PizzaShop orderFrom;

    private String[] pizzaSelected;

    private short totalAmount;
    private float deliveryTime;

    PizzaOrders(PizzaShop orderFrom) {
        this.orderFrom=orderFrom;
        
    }

    public void displayFlavours() {
        orderFrom.displayFlavoursWithPrice();
    }

  
    public void makeOrder(String... pizzaFlavours) {
        pizzaSelected=new String[pizzaFlavours.length];
    	for(int i=0;i<pizzaFlavours.length;i++){
            pizzaSelected[i]=pizzaFlavours[i];
        }
        
    }

    public void calculateTotalAmount() {
       totalAmount=orderFrom.calculateAmount(pizzaSelected);
    }

    
    public void printOrder() {
       System.out.println("Total Amount: "+totalAmount);
       System.out.println("Delivery Time: "+deliveryTime);
       System.out.println("Pizza Selected : ");
       for(String n: pizzaSelected){
        System.out.println(n);
       }
       System.out.println("Order From Shop: "+orderFrom.getShopName());


    }

}