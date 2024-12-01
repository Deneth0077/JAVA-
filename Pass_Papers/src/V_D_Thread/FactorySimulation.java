package V_D_Thread;

public class FactorySimulation{
    private int iron =0;
    private int wood = 0;
    private int cement = 0;

    public synchronized  void supplyIron(){
        iron++;
        System.out.println("supplied 1 Iron. Iron Inventory :" +iron);
        notifyAll();
    }
    public synchronized  void supplyWood(){
        iron++;
        System.out.println("supplied 1 Wood. Iron Inventory :" +wood);
        notifyAll();
    }
    public synchronized  void supplyCement(){
        iron++;
        System.out.println("supplied 1 Cement. Iron Inventory :" +cement);
        notifyAll();
    }
    public synchronized void produce() throws InterruptedException {
        while (iron < 1 || wood < 2 || cement < 1) {
            System.out.println("Waiting for supplies...");
            wait();
        }
        iron -= 1;
        wood -= 2;
        cement -= 1;
        System.out.println("Product produced. Iron: " + iron + ", Wood: " + wood + ", Cement: " + cement);
    }
    public static void main(String[] args) {
        FactorySimulation factory = new FactorySimulation();
        SupplierIron supplierIron = new SupplierIron(factory);
        SupplierWood supplierWood = new SupplierWood(factory);
        SupplierCement supplierCement = new SupplierCement(factory);
        ProductionLine productionLine = new ProductionLine(factory);

        // Start all threads
        supplierIron.start();
        supplierWood.start();
        supplierCement.start();
        productionLine.start();
    }
}
