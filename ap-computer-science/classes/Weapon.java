public class Weapon extends Artifact {
  private double damage;

  public Weapon(String name, double damage) {
    super(name, 10);
    this.damage = damage;
  }
 
  public Weapon(String name, double damage, double value) {
    super(name, value);
    this.damage = damage;
  }

  public double damage() { return damage; }

  public String toString() {
    return super.name() + " (-" + damage + "hp)";
  }
}