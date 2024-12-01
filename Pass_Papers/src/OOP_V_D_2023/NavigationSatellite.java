package OOP_V_D_2023;

public class NavigationSatellite implements ISatellite{
    private String name;

    public NavigationSatellite(String name){
        this.name = name;
    }
    @Override
    public void activate(){
        System.out.println(name + " is activated");
    }
    @Override
    public void deactivate(){
        System.out.println("Navogation deactivated" +name);
    }
}
