package junit.com;

public class SimpleFactory implements PayStationFactory{
    @Override
    public Receipt createReceipt(int value) {
        return new StandardReceipt(value);
    }

    @Override
    public RateStrategy createRateStrategy() {
        return new One2OneRateStrategy();
    }
}
