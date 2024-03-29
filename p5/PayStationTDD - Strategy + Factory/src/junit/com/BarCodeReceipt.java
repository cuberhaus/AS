package junit.com;

public class BarCodeReceipt implements Receipt{

	  private int value;


	  public BarCodeReceipt (int value) { 
	    this.value = value; }

	  @Override
	  public int value() {
	    return value; }

	  @Override
	  public String print() {
		  String receiptContent = getString();
		  for (int i=0; i<value; i++) {
	      receiptContent = receiptContent + "|"; }
	      receiptContent = receiptContent + "\n";
	      receiptContent = receiptContent + "----------------------------------";
	    return receiptContent; }

}

