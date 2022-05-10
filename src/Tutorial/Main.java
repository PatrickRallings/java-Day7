package Tutorial;

public class Main {
    public static void main(String[] args) {
        //Instantiating the class of customer using its underlying
        //^ constructor method to assign the applicable values
        //(Basically just assigning values as arguments)
        Customer Patrick = new Customer("Patrick");
        Customer Emily = new Customer("Emily");

        Patrick.output();
        Patrick.setAge(28);
        Patrick.output();
        System.out.println(Patrick.setAgeAfterTen());
    }
}