public class Artifact {
  private String name;
  private double value;

  public Artifact(String name, double value) {
    this.name = name;
    this.value = value;
  }

  public String name() { return name; }
  public double value() { return value; }
  public String toString() { return name + ", ㊉" + value; }
}