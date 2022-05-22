public class Animal extends Villain {
  public Animal() { super(new Weapon("null", 0), 10, 0, true); }

  public int getFood() { return (int)(Math.random()*5) + 5; }
}