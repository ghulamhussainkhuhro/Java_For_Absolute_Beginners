package InnerClass;

class Bag {
    // Public field to store the bag name
    public String name = "Camel";

    public void showBagName() {
        System.out.println("Bag name is " + name + "!");
    }

    // Inner class Zipper to represent the functionality of a zipper
    public class Zipper {
        public void zip() {
            System.out.println("Zipping " + Bag.this.name + "...");  // Access outer class field using 'this'
            System.out.println("Bag is zipped!");
        }

        public void unzip() {
            System.out.println("Unzipping " + Bag.this.name + "...");
            System.out.println("Bag is unzipped!");
        }
    }
}

public class BagZipper {

    public static void main(String[] args) {
        // Create a Bag object
        Bag B1 = new Bag();

        // Call outer class method
        B1.showBagName();

        // Create an instance of the inner Zipper class using the outer class object
        Bag.Zipper zipper = B1.new Zipper();

        // Call inner class methods
        zipper.zip();
        zipper.unzip();
    }
}
