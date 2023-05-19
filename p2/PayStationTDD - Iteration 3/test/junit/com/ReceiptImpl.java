package junit.com;

public class ReceiptImpl implements Receipt{
	int value;
	public ReceiptImpl(int n) {
		value = n;
	}
	@Override
	public int value() {
		// TODO Auto-generated method stub
		return value;
	}

}
