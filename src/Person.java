public class Person {
    String name;
    Bike bike;                              //ob'yavlyaem peremennie(Bike vizivaet prededywii klas)

    public Person(String name, Bike bike){
    this.name = name;
    this.bike = bike;
    }


    public void starRide(){
        bike.starRide();
    }
    public void stopRide(){bike.stopRide ();
    }
    public void ride(double distance) {bike.raid(distance);}
}

