package OOP_V_D_2023;

public class SatelliteCenter {
    private int option;
    ISatellite[] satellites;
    IGeoLocation[] geoLocations;

    public SatelliteCenter( int option, ISatellite[] satellites, IGeoLocation[] geoLocations ){
        this.option = option;
        this.satellites = satellites;
        this.geoLocations = geoLocations;
    }

    public void startService(){
       if (option >=0 && option < satellites.length){
           satellites[option].activate();
       }
    }

    public void stopService(){
        if (option >=0 && option < satellites.length){
            satellites[option].activate();
        }
    }

    public void locationService(){
        if (option >=0 && option < satellites.length){
            satellites[option].activate();
        }
    }
}
