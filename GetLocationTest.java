package com.turkekspres.harcamayonetimi;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;

import org.junit.Test;

public class GetLocationTest {

    int latitute;
    int longitude;
    private LocationManager locationManager;
    private String provider;

    @Test
    public void testLocation(){

        Location location = null;
        latitute = (int) (location.getLatitude());
        longitude = (int) (location.getLongitude());

        Criteria criteria = new Criteria();
        provider = locationManager.getBestProvider(criteria, false);
        location = locationManager.getLastKnownLocation(provider);

        if (location != null) {
            System.out.println("Provider " + provider + " has been selected.");
            onLocationChanged(location);
        } else {

            System.out.println("latituteField : Location not available");
            System.out.println("longitudeField : Location not available");
        }
    }
        private void onLocationChanged(Location location) {

        latitute = (int) (location.getLatitude());
        longitude = (int) (location.getLongitude());
    }
}
