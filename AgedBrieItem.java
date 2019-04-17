public class AgedBrieItem extends Item {
  public AgedBrieItem(int daysRemaining, int quality) {
    super("Aged Brie", daysRemaining, quality);
  }

  @Override
  public void tick() {
    daysRemaining = daysRemaining - 1;

    quality = quality + 1;

    if( daysRemaining <= 0 ) {
      quality = quality + 1;
    }

    if( quality > 50 ) {
      quality = 50;
    }
  }
}