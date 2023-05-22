package junit.com;

public class ProgressiveRateStrategy implements RateStrategy {

	@Override
	public int calculaTime(int insertedSoFar) {
		// TODO Auto-generated method stub
		int time=0;
		int initiallyInserted = insertedSoFar;
		if (initiallyInserted > 350) {
			int thirdHourMoney = insertedSoFar - 350;
			insertedSoFar=insertedSoFar-thirdHourMoney;
			time += thirdHourMoney/5*1;
		}
		if (mesGran150(initiallyInserted)) {
			int secondHourMoney = insertedSoFar - 150;
			insertedSoFar=insertedSoFar-secondHourMoney;
			time += secondHourMoney/5*1.5;
		}
		time += insertedSoFar/5*2;
		return time;
	}

	private boolean mesGran150(int initiallyInserted) {
		return initiallyInserted > 150;
	}

}
