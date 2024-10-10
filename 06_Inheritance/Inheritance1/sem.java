package Inheritance1;

import java.util.Scanner;

class RestaurantItem {
    private String name;
    private double price;

    public RestaurantItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Inherited class 1
class Appetizer extends RestaurantItem {
    public Appetizer(String name, double price) {
        super(name, price);
    }

    @Override
    public String getName() {
        return "[Appetizer] " + super.getName();
    }
}

// Inherited class 2
class MainCourse extends RestaurantItem {
    public MainCourse(String name, double price) {
        super(name, price);
    }

    @Override
    public String getName() {
        return "[Main Course] " + super.getName();
    }
}

// Inherited class 3
class Dessert extends RestaurantItem {
    public Dessert(String name, double price) {
        super(name, price);
    }

    @Override
    public String getName() {
        return "[Dessert] " + super.getName();
    }
}

class Order {
    RestaurantItem item;
    int quantity;

    public Order(RestaurantItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }
}

public class sem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu items
        RestaurantItem[] menu = {
            new Appetizer("Fries", 3.99),
            new MainCourse("Steak", 15.99),
            new Dessert("Ice Cream", 4.50),
            new Appetizer("Bruschetta", 6.99)
        };

        // Rest of the code remains unchanged
        // ...
    }
}