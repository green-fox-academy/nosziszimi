package AircraftCarrier;

/**
 * Created by Nóra on 2017. 04. 04..
 */
public class Aircraft {
  int ammo, maxAmmo, baseDamage;
  String type;

  public int fight() {
    int damage = ammo * baseDamage;
    ammo = 0;
    return damage;
  }

  public int refill(int amountOfammo) {
    int missingAmmo = maxAmmo - ammo;
    if (missingAmmo >= amountOfammo) {
      ammo += amountOfammo;
      return 0;
    } else {
      ammo += missingAmmo;
      return amountOfammo - missingAmmo;
    }
  }

  public String get_type() {
    return type;
  }

  public String get_status() {
    return "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + ammo * baseDamage;
  }
}
