package junit.com;

public class ReceiptImpl implements Receipt{

	private int value;
	@Override
	public int value() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		String receiptContent = "----------------------------------";
	    receiptContent = receiptContent + "\n";
	    receiptContent = receiptContent + "-------- PARKING RECEIPT --------";
	    receiptContent = receiptContent + "\n";
	    receiptContent = receiptContent + "         Value " + value + " minutes";
	    receiptContent = receiptContent + "\n";
		return null;
	}

	public String additionalPrint() {
		return null;
	}

}
