package OOP_V_D_2023;

public class DroneSatellite implements ISatellite {
    private String name;

    public DroneSatellite(String name) {
        this.name = name;
    }

    @Override
    public void activate(){
        System.out.println("DroneSatellite activated" +name);
    }
    @Override
    public void deactivate(){
        System.out.println("DroneSatellite deactivated");
    }

}
