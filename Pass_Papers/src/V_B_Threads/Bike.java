package V_B_Threads;

public class Bike implements Runnable{

    @Override
    public void run(){
        try{
            for (int i=1; i<=5; i++){
                System.out.println("Bike is racing");
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
