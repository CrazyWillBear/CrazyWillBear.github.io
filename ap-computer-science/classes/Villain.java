public class Villain implements Character {
  private double[] health = new double[2];
  private int speed;
  private boolean lootable;
  private Weapon weapon;

  public Villain() {
    weapon = new Weapon("Dagger", 4.5);
    health[0] = 10;
    health[1] = 10;
    speed = 3;
    lootable = false;
  }
  public Villain (Weapon weapon, double health, int speed, boolean lootable) {
    this.weapon = weapon;
    this.health[0] = health;
    this.health[1] = health;
    this.speed = speed;
    this.lootable = lootable;
  }
  
  public double getDamage() { return weapon.damage(); }
  public double[] getHealth() { return health; }
  public int getSpeed() { return speed; }
  public boolean isLootable() { return lootable; }
  
  public void setSpeed(int speed) { this.speed = speed; }
  public void setLootable(boolean lootable) { this.lootable = lootable; }
  public void takeDamage(double damageTaken) { health[0] -= damageTaken; }

  public String toString() {
    return "Villan Stats:\n" +
    "Health = " + health + "\n" +
    "Damage = " + weapon.damage() + "\n" +
    "Speed = " + speed + "\n" +
    "Is lootable? = " + lootable + "\n";
  }

  public double specialAttack() {
    return weapon.damage() * (int)(Math.random() * 3) + 2;
  }
}