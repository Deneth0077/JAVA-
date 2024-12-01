package V_D_Thread;

public class SupplierCement extends Thread {
    private FactorySimulation factory;

    public SupplierCement(FactorySimulation factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(600); // 600 milliseconds delay
                factory.supplyCement();
            }
        } catch (InterruptedException e) {
            System.out.println("SupplierCement interrupted");
        }
    }
}
