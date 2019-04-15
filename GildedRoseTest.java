import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GildedRoseTest {
  /* Normal Item Tests */
  @Test
  public void updatesNormalItemBeforeSellDate() {
    GildedRose rose = new GildedRose("Normal Item", 5, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 4);
    assertEquals(rose.getQuality(), 9);
  }

  @Test
  public void updatesNormalItemOnSellDate() {
    GildedRose rose = new GildedRose("Normal Item", 0, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -1);
    assertEquals(rose.getQuality(), 8);
  }

  @Test
  public void updatesNormalItemAfterSellDate() {
    GildedRose rose = new GildedRose("Normal Item", -10, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -11);
    assertEquals(rose.getQuality(), 8);
  }

  @Test
  public void updatesNormalItemOfZeroQuality() {
    GildedRose rose = new GildedRose("Normal Item", 5, 0);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 4);
    assertEquals(rose.getQuality(), 0);
  }

  /* Aged Brie Item Tests */
  @Test
  public void updatesAgedBrieBeforeSellDate() {
    GildedRose rose = new GildedRose("Aged Brie", 5, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 4);
    assertEquals(rose.getQuality(), 11);
  }

  @Test
  public void updatesAgedBrieWithMaxQuality() {
    GildedRose rose = new GildedRose("Aged Brie", 5, 50);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 4);
    assertEquals(rose.getQuality(), 50);
  }

  @Test
  public void updatesAgedBrieOnSellDate() {
    GildedRose rose = new GildedRose("Aged Brie", 0, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -1);
    assertEquals(rose.getQuality(), 12);
  }

  @Test
  public void updatesAgedBrieOnSellDateNearMaxQuality() {
    GildedRose rose = new GildedRose("Aged Brie", 0, 49);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -1);
    assertEquals(rose.getQuality(), 50);
  }

  @Test
  public void updatesAgedBrieOnSellDateWithMaxQuality() {
    GildedRose rose = new GildedRose("Aged Brie", 0, 50);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -1);
    assertEquals(rose.getQuality(), 50);
  }

  @Test
  public void updatesAgedBrieAfterSellDate() {
    GildedRose rose = new GildedRose("Aged Brie", -10, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -11);
    assertEquals(rose.getQuality(), 12);
  }

  @Test
  public void updatesAgedBrieAfterSellDateWithMaxQuality() {
    GildedRose rose = new GildedRose("Aged Brie", -10, 50);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -11);
    assertEquals(rose.getQuality(), 50);
  }

  /* Sulfuras Tests */
  @Test
  public void updatesSulfurasBeforeSellDate() {
    GildedRose rose = new GildedRose("Sulfuras, Hand of Ragnaros", 5, 80);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 5);
    assertEquals(rose.getQuality(), 80);
  }

  @Test
  public void updatesSulfurasOnSellDate() {
    GildedRose rose = new GildedRose("Sulfuras, Hand of Ragnaros", 0, 80);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 0);
    assertEquals(rose.getQuality(), 80);
  }

  @Test
  public void updatesSulfurasAfterSellDate() {
    GildedRose rose = new GildedRose("Sulfuras, Hand of Ragnaros", -10, 80);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -10);
    assertEquals(rose.getQuality(), 80);
  }

  /* Backstage Pass Tests */
  @Test
  public void updatesBackstagePassLongBeforeSellDate() {
    GildedRose rose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 11, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 10);
    assertEquals(rose.getQuality(), 11);
  }

  @Test
  public void updatesBackstagePassLongBeforeSellDateAtMaxQuality() {
    GildedRose rose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 11, 50);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 10);
    assertEquals(rose.getQuality(), 50);
  }

  @Test
  public void updatesBackstagePassMediumCloseToSellDateUpperBound() {
    GildedRose rose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 9);
    assertEquals(rose.getQuality(), 12);
  }

  @Test
  public void updatesBackstagePassMediumCloseToSellDateUpperBoundAtMaxQuality() {
    GildedRose rose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 50);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 9);
    assertEquals(rose.getQuality(), 50);
  }

  @Test
  public void updatesBackstagePassMediumCloseToSellDateLowerBound() {
    GildedRose rose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 6, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 5);
    assertEquals(rose.getQuality(), 12);
  }

  @Test
  public void updatesBackstagePassMediumCloseToSellDateLowerBoundAtMaxQuality() {
    GildedRose rose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 6, 50);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 5);
    assertEquals(rose.getQuality(), 50);
  }

  @Test
  public void updatesBackstagePassVeryCloseToSellDateUpperBound() {
    GildedRose rose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 5, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 4);
    assertEquals(rose.getQuality(), 13);
  }

  @Test
  public void updatesBackstagePassVeryCloseToSellDateUpperBoundAtMaxQuality() {
    GildedRose rose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 5, 50);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 4);
    assertEquals(rose.getQuality(), 50);
  }

  @Test
  public void updatesBackstagePassVeryCloseToSellDateLowerBound() {
    GildedRose rose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 1, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 0);
    assertEquals(rose.getQuality(), 13);
  }

  @Test
  public void updatesBackstagePassVeryCloseToSellDateLowerBoundAtMaxQuality() {
    GildedRose rose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 1, 50);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 0);
    assertEquals(rose.getQuality(), 50);
  }

  @Test
  public void updatesBackstagePassOnSellDate() {
    GildedRose rose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 0, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -1);
    assertEquals(rose.getQuality(), 0);
  }

  @Test
  public void updatesBackstagePassAfterSellDate() {
    GildedRose rose = new GildedRose("Backstage passes to a TAFKAL80ETC concert", -10, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -11);
    assertEquals(rose.getQuality(), 0);
  }

  /* Conjured Mana */
  /* Our job is to add this functionality!!
  @Test
  public void updatesConjuredManaBeforeSellDate() {
    GildedRose rose = new GildedRose("Conjured Mana Cake", 5, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 4);
    assertEquals(rose.getQuality(), 8);
  }

  @Test
  public void updatesConjuredManaBeforeSellDateAtZeroQuality() {
    GildedRose rose = new GildedRose("Conjured Mana Cake", 5, 0);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), 4);
    assertEquals(rose.getQuality(), 0);
  }

  @Test
  public void updatesConjuredManaOnSellDate() {
    GildedRose rose = new GildedRose("Conjured Mana Cake", 0, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -1);
    assertEquals(rose.getQuality(), 6);
  }

  @Test
  public void updatesConjuredManaOnSellDateAtZeroQuality() {
    GildedRose rose = new GildedRose("Conjured Mana Cake", 0, 0);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -1);
    assertEquals(rose.getQuality(), 0);
  }

  @Test
  public void updatesConjuredManaAfterSellDate() {
    GildedRose rose = new GildedRose("Conjured Mana Cake", -10, 10);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -11);
    assertEquals(rose.getQuality(), 6);
  }

  @Test
  public void updatesConjuredManaAfterSellDateAtZeroQuality() {
    GildedRose rose = new GildedRose("Conjured Mana Cake", -10, 0);
    rose.tick();

    assertEquals(rose.getDaysRemaining(), -11);
    assertEquals(rose.getQuality(), 0);
  }
  */
}