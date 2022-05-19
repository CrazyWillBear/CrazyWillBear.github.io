import java.util.ArrayList;

public class Player implements Character {
  private double[] health = new double[2];
  private int speed;
  private Weapon weapon;
  private ArrayList<Artifact> artifactInv;
  private int arrows;
  private int coins;
  private int distanceTravelled;
  private int food;

  public Player() {
    weapon = new Weapon("Shortsword", 5.5);
    health[0] = 20;
    health[1] = 20;
    speed = 10;
    artifactInv = new ArrayList<Artifact>();
    arrows = 50;
    coins = 20;
    distanceTravelled = 0;
    food = 50;
  }
  
  public double getDamage() { return weapon.damage(); }
  public double[] getHealth() { return health; }
  public double getHealthDefecit() { return health[1] - health[0]; }
  public int getSpeed() { return speed; }
  public Weapon getWeapon() { return weapon; }
  public ArrayList<Artifact> getArtifactInv() { return artifactInv; }
  public String getArtifactInvStats() {
    String sreturn = "";
    for (Artifact a : artifactInv) {
      sreturn += a.name() + " | $" + a.value() + "\n";
    }
    return sreturn;
  }
  public int getArrows() { return arrows; }
  public int getFood() { return food; }
  public int getDistance() { return distanceTravelled; }
  public int getCoins() { return coins; }
  
  public void takeDamage(double damageTaken) { health[0] -= damageTaken; }
  public void regainFullHealth() { health[0] = health[1]; }
  public void regainHalfHealth() { health[0] += (health[1] - health[0]) / 2; }
  public void addHealth(int health) {
    this.health[0] += health;
    if (this.health[0] > this.health[1]) { regainFullHealth(); }
  }
  public void setSpeed(int speed) { this.speed = speed; }
  public void swapWeapon(Weapon weapon) { this.weapon = weapon; }
  public void addArtifact(Artifact artifact) { artifactInv.add(artifact); }
  public void addCoins(int coins) { this.coins += coins; }
  public void removeCoins(int coins) { this.coins -= coins; }
  public void addDistance(int distance) { distanceTravelled += distance; }
  public void addArrows(int arrows) { this.arrows += arrows; }
  public void removeArrows(int arrows) { this.arrows -= arrows; }
  public void addFood(int food) { this.food += food; }
  public void removeFood(int food) { this.food -= food; }
  public void sortArtifactInv() { // selection sort
    for (int i = 0; i < artifactInv.size(); i++) {
      int nextSmallestIndex = i;
      for (int j = i; j < artifactInv.size(); j++) {
        if (artifactInv.get(j).value() < artifactInv.get(nextSmallestIndex).value()) { nextSmallestIndex = j; }
      }
      Artifact tmp = artifactInv.get(i);
      artifactInv.set(i, artifactInv.get(nextSmallestIndex));
      artifactInv.set(nextSmallestIndex, tmp);
    }
  }

  public String toString() {
    return "Player Stats:\n" +
    "Health = " + health[0] + "/" + health[1] + "\n" +
    "Weapon (bow used when hunting) = " + weapon.toString() + "\n" +
    "Speed = " + speed;
  }

  public double specialAttack() {
    // 6 - Math.pow
    return Math.pow(weapon.damage(), (int)(Math.random() * 3) + 2);
  }
}