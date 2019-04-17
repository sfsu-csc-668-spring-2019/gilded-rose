public class BackstageItem extends Item {
  public BackstageItem(int daysRemaining, int quality) {
    super("Backstage passes to a TAFKAL80ETC concert", daysRemaining, quality);
  }

  @Override
  public void tick() {
    daysRemaining = daysRemaining - 1;

    quality = quality + 1;

    if( daysRemaining < 10 && daysRemaining >= 5 ) {
      quality = quality + 1;
    } else if( daysRemaining < 5 ) {
      quality = quality + 2;
    }

    if( quality > 50 ) {
      quality = 50;
    }

    if( daysRemaining < 0 ) {
      quality = 0;
    }
  }
}