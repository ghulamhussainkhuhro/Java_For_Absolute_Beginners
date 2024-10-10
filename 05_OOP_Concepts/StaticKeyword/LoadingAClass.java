package StaticKeyword;

// A simple class with a static block
class C1 {
    static {
        System.out.println("Static block invoked");
    }
}

// Main class to demonstrate loading a class without creating an object
public class LoadingAClass {

    public static void main(String[] args) throws ClassNotFoundException {
        //Attempting to load a class dynamically
        //Even though no object of class C1 is created, the static block in C1 will be executed
        Class.forName("StaticKeyword.C1");
    }
}
