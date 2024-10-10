package StaticKeyword;

class Mobile2 {
    String brand;
    int price;
    static String name;

    // Constructor
    public Mobile2() {
        brand = "";
        price = 100;
        // If we initialize 'name' here, it will be initialized every time
        // an object is created, which might be unnecessary.
        // Hence, a static block is used for one-time initialization.
        System.out.println("Constructor Called...!");
    }

    static {
        // The static block is executed only once, irrespective of how many
        // objects of Mobile2 are created. The class is loaded once,
        // but the static block is triggered when the class is loaded.
        // Without creating an object, the class won't be loaded,
        // and the static block won't be called.
        name = "Smartphone";
        System.out.println("Static block called...!");
    }

    public void showData() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticBlock {

    public static void main(String[] args) throws ClassNotFoundException {
        // Creating objects of Mobile2 triggers the static block only once.
        Mobile2 obj1 = new Mobile2();
        Mobile2 obj2 = new Mobile2();
        // Observe the output; the static block is called first and only once.
    }
}
