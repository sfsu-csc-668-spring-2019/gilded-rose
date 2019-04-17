public class GildedRose {
  private Item item;

  public GildedRose(String name, int daysRemaining, int quality) {
    item = ItemFactory.create(name, daysRemaining, quality);
  }

  public int getDaysRemaining() {
    return item.getDaysRemaining();
  }

  public int getQuality() {
    return item.getQuality();
  }

  public void tick() {
    item.tick();
  }
}
