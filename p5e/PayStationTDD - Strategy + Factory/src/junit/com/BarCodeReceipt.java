package junit.com;

public class BarCodeReceipt extends ReceiptImpl{

	  private int value;


	  public BarCodeReceipt (int value) { 
	    this.value = value; }

	  public int value() {
	    return value; }

	@Override
	public String additionalPrint() {
		// TODO Auto-generated method stub
	    String receiptContent = additionalPrint();
	    for (int i=0; i<value; i++) {
	      receiptContent = receiptContent + "|"; }
	      receiptContent = receiptContent + "\n";
	      receiptContent = receiptContent + "----------------------------------";
	    return receiptContent; 
	}

	  }

