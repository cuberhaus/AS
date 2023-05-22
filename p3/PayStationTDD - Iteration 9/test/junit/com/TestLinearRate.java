package junit.com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestLinearRate {
  LinearRateStrategy ls;
  /** Fixture for pay station testing. */
  @Before
  public void setUp() {
	ls = new LinearRateStrategy();
  }
  @Test
  public void primeraHora() throws IllegalCoinException {
    assertEquals( "Should display 60 min for 150 cents", 
                  60, ls.calculaTime(150));
    // 25 cent in 5 cent coins each giving 2 minutes parking
  }

  /**
   * Entering 5 cents should make the display report 2 minutes 
   * parking time.
  */
  @Test
  public void shouldDisplay2MinFor5Cents() throws IllegalCoinException {
    assertEquals( "Should display 2 min for 5 cents", 
                  5 / 5 * 2, ls.calculaTime(5) ); 
  }

  /**
   * Entering 25 cents should make the display report 10 minutes
   * parking time.
  */
  @Test
  public void shouldDisplay10MinFor25Cents() throws IllegalCoinException {
    assertEquals( "Should display 10 min for 25 cents", 
                  25 / 5 * 2, ls.calculaTime(25) );
    // 25 cent in 5 cent coins each giving 2 minutes parking
  }

}
