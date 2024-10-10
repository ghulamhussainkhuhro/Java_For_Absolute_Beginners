package Aggregation9pp;

public class Demo{
public static void main(String[] args) {
    Pizza p1= new Pizza("Fagita",2000);
    Pizza p2= new Pizza("Special",2500);
    Pizza p3= new Pizza("ABC",1500);
    Pizza p4= new Pizza("HotnSpicy",1000);
    PizzaShop s1= new PizzaShop("GHK Pizza",923402);
    PizzaShop s2= new PizzaShop("GMK Pizza",924455);
    PizzaOrders o1= new PizzaOrders(s1);
    PizzaOrders o2=new PizzaOrders(s2);
    s1.addFlavoursOffered(p1);
    s1.addFlavoursOffered(p2);
    s2.addFlavoursOffered(p3);
    s2.addFlavoursOffered(p4);
    o1.displayFlavours();
    o2.displayFlavours();
    o1.makeOrder("Fagita","ABC");
    o1.calculateTotalAmount();
    o1.printOrder();
    

    
}



}