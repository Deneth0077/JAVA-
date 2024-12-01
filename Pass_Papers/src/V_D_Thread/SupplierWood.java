package V_D_Thread;

public class SupplierWood extends Thread{
    private FactorySimulation factory;

    public SupplierWood(FactorySimulation factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(600); // 600 milliseconds delay
                factory.supplyWood();
            }
        } catch (InterruptedException e) {
            System.out.println("SupplierWood interrupted");
        }
    }
}
