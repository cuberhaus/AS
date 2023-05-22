package junit.com;

public class LinearRateStrategy implements RateStrategy {

	@Override
	public int calculaTime(int insertedSoFar) {
		// TODO Auto-generated method stub
		return insertedSoFar/5*2;
	}

}
