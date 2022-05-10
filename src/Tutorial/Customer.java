package Tutorial;

public class Customer {
    public String name;
    public int age;

//The constructor for when the class is instantiated
    //Essentially just a method of the same name that assigns
    //^ values to a particular instantiation of a class
    //Constructor's name is always the same as the class

    public Customer(String customerName) {
        //Sets the default age for the customer
        //(Could have it as a parameter if wanted)
        this.age = 0;
        //Allows us to assign value to name when calling
        //^constructor method to instantiate the class
        this.name = customerName;
    }
    //Method that can be called for each instantiation of the class
    public void output() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //While 0 is assigned as a default for each instantiated customer,
    //^ this method being called can assign specific values to each
    //^ specific instance
    public void setAge(int customerAge) {
        this.age = customerAge;
    }
    //You can create methods specifically geared towards returning
    //^ values based off of the current values in the relevant instance
    //Getters and setters is a best practice of method naming
    //^ where you name methods based off of whether they are getting
    //^ or setting something (Example: getAge returns age while setAge assigns it
    public int setAgeAfterTen() {
        return this.age+10;
    }
}
