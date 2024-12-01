package V_B_Threads;

public class RaceRunner {
    public static void main(String[] args) {

        //create instances
        Car car =  new Car();
        Bike bike = new Bike();

        //crate thread objects for car and bike
        Thread carThread = new Thread(car);
        Thread bikeThread = new Thread(bike);

        carThread.start();
        try{
            carThread.join();
        }catch (InterruptedException e){
            System.out.println("Thread interrupted");
        }
        bikeThread.start();
    }
}
