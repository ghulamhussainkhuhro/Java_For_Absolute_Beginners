package Encapsulation;

class Data {
    private String name;
    private int age;

    // Getter and setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Using 'this' keyword to distinguish between the instance variable and the method parameter
        this.name = name;
    }

    // Getter and setter for 'age'
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Using 'this' keyword helps to clarify that we are referring to
        // the instance variable 'age' rather than the method parameter 'age'.
        this.age = age;
    }

    // Alternative way for age variable using an object
    public void setAgeObject(Data data, int age) {
        // Using an object to set the 'age' variable without 'this' keyword.
        // This method allows setting the age variable using another object of the class.
        data.age = age;
    }
}

public class ThisKeyword {

    public static void main(String[] args) {
        // Comment: Creating an instance of the Data class
        Data Me = new Data();
        
        // Comment: Setting values using setter methods with 'this' keyword
        Me.setName("Ghulam Hussain");
        Me.setAge(19);

        // Comment: Getting and printing values using getter methods
        System.out.println("My name is " + Me.getName());
        System.out.println("I am " + Me.getAge());

        // Comment: Using an alternative way to set the 'age' variable using an object
        Data anotherPerson = new Data();
        anotherPerson.setAgeObject(anotherPerson, 25);
        System.out.println("Another person's age is " + anotherPerson.getAge());
    }
}
