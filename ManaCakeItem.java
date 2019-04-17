public class ManaCakeItem extends Item {
  public ManaCakeItem(int daysRemaining, int quality) {
    super("Conjured Mana Cake", daysRemaining, quality);
  }

  @Override
  public void tick() {
    daysRemaining = daysRemaining - 1;

    if( daysRemaining < 0 ) {
      quality = quality - 4;
    } else if( daysRemaining < 5 ) {
      quality = quality - 2;
    }

    if( quality < 0 ) {
      quality = 0;
    }
  }
}