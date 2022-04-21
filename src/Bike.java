public class Bike {
    String model;
    String color;
    double speed;
    int price;


    public Bike(String model, String color, double speed, int price) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.price = price;

    }

        public void starRide(){
            System.out.println ("Начинаю крутить педали со скоростью = " + speed);
        }
        public void stopRide(){
            System.out.println ("Завершаю крутить педали");
        }


    public void raid(double distance) {
        double time = distance/speed;
        int hours = (int)time;
        int min = (int)((time-hours)*60);
        int sec = (int)(((((time-hours)*60))%1)*60);

        System.out.println("Проехал расстояние = " + distance + "за " + hours + "час(ов)" + min + "минут и " + sec + "секунд(ы)");
    }
}

