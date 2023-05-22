package junit.com;

public class One2OneRateStrategy implements RateStrategy{

	@Override
	public int calculaTime(int insertedSoFar) {
		return insertedSoFar;
	}

}
