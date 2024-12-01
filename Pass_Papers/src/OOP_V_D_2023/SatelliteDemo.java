package OOP_V_D_2023;

public class SatelliteDemo {
    public static void main(String[] args) {
    // Create instances of satellite types
    ISatellite navigationSatellite = new NavigationSatellite("Ravana-01");
    ISatellite droneSatellite1 = new DroneSatellite("Ravana-02");
    ISatellite droneSatellite2 = new DroneSatellite("Ravana-03"); // New drone satellite

    // Create instances of location trackers
    IGeoLocation locationTracker1 = new SatelliteLocation("Sri Lanka");
    IGeoLocation locationTracker2 = new SatelliteLocation("Russia");
    IGeoLocation locationTracker3 = new SatelliteLocation("India"); // New location tracker

    // Create arrays for satellites and trackers
    ISatellite[] satelliteArray = new ISatellite[]{navigationSatellite, droneSatellite1, droneSatellite2};
    IGeoLocation[] trackerArray = new IGeoLocation[]{locationTracker1, locationTracker2, locationTracker3};

    // Create SatelliteCenter instances and perform operations
    SatelliteCenter satelliteCenter1 = new SatelliteCenter(0, satelliteArray, trackerArray);
        satelliteCenter1.startService();
        satelliteCenter1.stopService();
        satelliteCenter1.locationService();

    SatelliteCenter satelliteCenter2 = new SatelliteCenter(1, satelliteArray, trackerArray);
        satelliteCenter2.startService();
        satelliteCenter2.stopService();
        satelliteCenter2.locationService();

    SatelliteCenter satelliteCenter3 = new SatelliteCenter(2, satelliteArray, trackerArray); // New center for new drone satellite
        satelliteCenter3.startService();
        satelliteCenter3.stopService();
        satelliteCenter3.locationService();
    }
}
