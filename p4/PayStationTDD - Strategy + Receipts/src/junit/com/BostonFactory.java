package junit.com;

public class BostonFactory implements PayStationFactory{
    @Override
    public Receipt createReceipt(int value) {
        return new BarCodeReceipt(value);
    }

    @Override
    public RateStrategy createRateStrategy() {
        return new ProgressiveRateStrategy();
    }
}
