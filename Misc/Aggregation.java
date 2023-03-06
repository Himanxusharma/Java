package Misc;

class Address {
    static String city;
    static String country;
    static String state;

    public Address(String city, String country, String state) {

        Address.city = city;
        Address.country = country;
        Address.state = state;

    }

}

public class Aggregation {

    int id;
    String name;
    Address add; // Aggregation: It contains one more object named address, which contains its
                 // own informations such as city, state, country, zipcode etc.

    public Aggregation(int id, String name, Address add) {
        this.id = id;
        this.name = name;
        this.add = add;

    }

    void display() {
        System.out.println("");
        System.out.println("id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Address : " + Address.city + " " + Address.state + " " + Address.country);
    }

    public static void main(String[] args) {

        Address add1 = new Address("Gurugram", "India", "Haryana");
        Address add2 = new Address("Sonipat", "India", "Haryana");

        Aggregation Emp1 = new Aggregation(01, "Vivek", add1);
        Aggregation Emp2 = new Aggregation(02, "Amit", add2);

        Emp1.display();
        Emp2.display();

    }

}
