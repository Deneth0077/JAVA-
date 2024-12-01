package V_D_Thread;

public class SupplierIron extends Thread{
    private FactorySimulation factory;

    public SupplierIron(FactorySimulation factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(600); // 600 milliseconds delay
                factory.supplyIron();
            }
        } catch (InterruptedException e) {
            System.out.println("SupplierIron interrupted");
        }
    }
}
