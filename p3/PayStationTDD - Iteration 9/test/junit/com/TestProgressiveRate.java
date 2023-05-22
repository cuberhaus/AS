package junit.com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestProgressiveRate {
//  PayStation ps;
  ProgressiveRateStrategy prs;
  /** Fixture for pay station testing. */
  @Before
  public void setUp() {
	ProgressiveRateStrategy progressiveRateStrategy  = new ProgressiveRateStrategy();
	prs = progressiveRateStrategy;
//    ps = new PayStationImpl(progressiveRateStrategy);
  }
  @Test
  public void primeraHora() throws IllegalCoinException {
	 // pay 150 = 1 hour
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );

    assertEquals( "Should display 60 min for 150 cents", 
                  60, prs.calculaTime(150));
    // 25 cent in 5 cent coins each giving 2 minutes parking
  }
  @Test
  public void segonaHora() throws IllegalCoinException {
//	 // pay 150 = 1 hour
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//	 // pay 200 = second hour
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );

    assertEquals( "Should display 120 min for 350 cents", 
                  120, prs.calculaTime(350)) ;
    // 25 cent in 5 cent coins each giving 2 minutes parking
  }
  @Test
  public void terceraHora() throws IllegalCoinException {
//	 // pay 150 = 1 hour
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//	 // pay 200 = second hour
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    // pay 300 = third hour
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );
//    ps.addPayment( 25 );

    assertEquals( "Should display 180 min for 650 cents", 
                  180, prs.calculaTime(650) );
    // 25 cent in 5 cent coins each giving 2 minutes parking
  }
}
