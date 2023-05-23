package junit.com;

public class NYFactory implements PayStationFactory {
    @Override
    public Receipt createReceipt(int value) {
        return new StandardReceipt(value);
    }

    @Override
    public RateStrategy createRateStrategy() {
        return new LinearRateStrategy();
    }
}
