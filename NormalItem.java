public class NormalItem extends Item {
  public NormalItem(int daysRemaining, int quality) {
    super("Normal Item", daysRemaining, quality);
  }

  @Override
  public void tick() {
    daysRemaining = daysRemaining - 1;

    quality = quality - 1;

    if(daysRemaining <= 0 ) {
      quality = quality - 1;
    }

    if( quality < 0 ) {
      quality = 0;
    }
  }
}