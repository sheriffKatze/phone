public class Program {
    public static void main(String[] args) {
        Bike b1 = new Bike ("Aist", "red", 10);
        Bike b2 = new Bike ("Rover", "green", 20);
        Bike b3 = new Bike ("Stels", "black", 30);

    Person p1 = new Person("Alex",b1);
    Person p2 = new Person("Sanya",b2);
    Person p3 = new Person("Jenya",b3);
    p1.ride(10.1);
    p2.ride(50.2);
    p3.ride(100.3);

    }

}
