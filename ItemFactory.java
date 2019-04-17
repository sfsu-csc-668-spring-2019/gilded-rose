public class ItemFactory {
  public static Item create(String name, int daysRemaining, int quality) {
    if( name.equals("Normal Item") ) {
      return new NormalItem(daysRemaining, quality);
    }

    if( name.equals("Aged Brie") ) {
      return new AgedBrieItem(daysRemaining, quality);
    }

    if( name.equals("Sulfuras, Hand of Ragnaros") ) {
      return new SulfurasItem(daysRemaining, quality);
    }

    if( name.equals("Backstage passes to a TAFKAL80ETC concert") ) {
      return new BackstageItem(daysRemaining, quality);
    }

    if( name.equals("Conjured Mana Cake") ) {
      return new ManaCakeItem(daysRemaining, quality);
    }

    return null;
  }
}