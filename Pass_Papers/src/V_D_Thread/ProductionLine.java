package V_D_Thread;

public class ProductionLine extends Thread {
    private FactorySimulation factory;

    public ProductionLine(FactorySimulation factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000); // 1000 milliseconds delay for production
                factory.produce();
            }
        } catch (InterruptedException e) {
            System.out.println("ProductionLine interrupted");
        }
    }
}
