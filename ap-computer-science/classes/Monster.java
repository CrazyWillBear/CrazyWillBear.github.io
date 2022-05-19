public class Monster extends Villain {
  public Monster() { super(new Weapon("Dagger", 4.5), 10, 3, false); }

  public boolean getArtifact() {
    if ((int)(Math.random()*200) == 1) { return true; };
    return false;
  }
}