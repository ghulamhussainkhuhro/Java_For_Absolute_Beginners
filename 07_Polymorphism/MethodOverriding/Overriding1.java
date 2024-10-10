package MethodOverriding;

class Calc {
    public int add(int n1, int n2) {
        System.out.println("Called in parent class Calc: ");
        return n1 + n2;
    }
}

class AdvCalc extends Calc {  // Inherits from Calc
    @Override  // Explicitly indicate overriding
    
    public int add(int n1, int n2) {
        System.out.println("Called in child class AdvCalc (overrides parent): ");
        return 2 * n1 + n2;
    }
}

public class Overriding1 {

    public static void main(String[] args) {
        // Create an object of the subclass (AdvCalc)
        AdvCalc aC1 = new AdvCalc();

        // Call the add() method - Runtime polymorphism takes effect
        int sum = aC1.add(21, 313);
        System.out.println("Sum is " + sum);  // Output: Called in child class AdvCalc (overrides parent):
                                               //        Sum is 334
        
        
    }
}
