package junit.com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestIntegration {
  PayStation psB;
  PayStation psNY;
  /** Fixture for pay station testing. */
  @Before
  public void setUp() {
	LinearRateStrategy stratNY  = new LinearRateStrategy();
    psNY = new PayStationImpl(stratNY);
	ProgressiveRateStrategy stratB  = new ProgressiveRateStrategy();
    psB = new PayStationImpl(stratB);
  }
  @Test
  public void primeraHoraNY() throws IllegalCoinException {
	 // pay 150 = 1 hour
    psNY.addPayment( 25 );
    psNY.addPayment( 25 );
    psNY.addPayment( 25 );
    psNY.addPayment( 25 );
    psNY.addPayment( 25 );
    psNY.addPayment( 25 );

    assertEquals( "Should display 60 min for 150 cents", 
                  60, psNY.readDisplay());
    // 25 cent in 5 cent coins each giving 2 minutes parking
  }

  @Test
  public void primeraHoraB() throws IllegalCoinException {
	 // pay 150 = 1 hour
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );

    assertEquals( "Should display 60 min for 150 cents", 
                  60, psB.readDisplay());
    // 25 cent in 5 cent coins each giving 2 minutes parking
  }
  @Test
  public void segonaHoraB() throws IllegalCoinException {
//	 // pay 150 = 1 hour
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
//	 // pay 200 = second hour
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );

    assertEquals( "Should display 120 min for 350 cents", 
                  120, psB.readDisplay()) ;
    // 25 cent in 5 cent coins each giving 2 minutes parking
  }
  @Test
  public void terceraHoraB() throws IllegalCoinException {
//	 // pay 150 = 1 hour
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
//	 // pay 200 = second hour
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
//    // pay 300 = third hour
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );
    psB.addPayment( 25 );

    assertEquals( "Should display 180 min for 650 cents", 
                  180, psB.readDisplay() );
    // 25 cent in 5 cent coins each giving 2 minutes parking
  }

}
