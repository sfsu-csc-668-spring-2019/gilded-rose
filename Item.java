public abstract class Item {
  protected String name;
  protected int quality, daysRemaining;

  public Item(String name, int daysRemaining, int quality) {
    this.name = name;
    this.quality = quality;
    this.daysRemaining = daysRemaining;
  }

  public int getDaysRemaining() {
    return daysRemaining;
  }

  public int getQuality() {
    return quality;
  }

  public abstract void tick();
}