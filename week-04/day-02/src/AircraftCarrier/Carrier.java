package AircraftCarrier;

import java.util.ArrayList;

/**
 * Created by Nóra on 2017. 04. 04..
 */
public class Carrier {
  ArrayList<Aircraft> carriedAircrafts;
  int storeOfAmmo;
  int healthPoint;

  public Carrier() {
    this(0);
  }

  public Carrier(int storeOfAmmo) {
    carriedAircrafts = new ArrayList<>();
    this.storeOfAmmo = storeOfAmmo;
  }

  public void add_aircraft(String typeOfAircraft) {
    if (typeOfAircraft.equals("F16")) {
      carriedAircrafts. add(new F16());
    } else if (typeOfAircraft.equals("F35")) {
      carriedAircrafts.add(new F35());
    }
  }
}
