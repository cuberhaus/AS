package junit.com;

public interface PayStationFactory {
    Receipt createReceipt(int value);
    RateStrategy createRateStrategy();
}
