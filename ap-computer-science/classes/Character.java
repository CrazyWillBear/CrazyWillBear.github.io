public abstract interface Character {
  public double getDamage();
  public double[] getHealth();
  public int getSpeed();
  
  public void setSpeed(int speed);
  public void takeDamage(double damageTaken);
  public double specialAttack();
}