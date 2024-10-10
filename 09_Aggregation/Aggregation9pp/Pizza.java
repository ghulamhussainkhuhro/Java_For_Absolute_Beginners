package Aggregation9pp;
import java.util.*;

public class Pizza {

    Pizza() {
    }
    
    private String flavour;

    private int price;

    public void setFlavour(String flavour) {
    	this.flavour=flavour;
    }
    public String getFlavour() {
    	return flavour;
    }
    public void setPrice(int price) {
    	 this.price=price;
    }
    public int getPrice() {
    	return price;
    }
    Pizza(String flavour, int price) {
        this.flavour=flavour;
        this.price=price;
    }

    public String toString() {
        
        return "";
    }

}