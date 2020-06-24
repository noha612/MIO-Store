package order;

import java.util.Observer;

public class Bill {

	Order bill;
	private String paymentState;

	public String getPaymentState() {
		return this.paymentState;
	}

	/**
	 * 
	 * @param paymentState
	 */
	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}

	/**
	 * 
	 * @param o
	 */
	public void Attach(Observer o) {
		// TODO - implement Bill.Attach
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param o
	 */
	public void Detach(Observer o) {
		// TODO - implement Bill.Detach
		throw new UnsupportedOperationException();
	}

	public void Notify() {
		// TODO - implement Bill.Notify
		throw new UnsupportedOperationException();
	}

	public Bill() {
		// TODO - implement Bill.Bill
		throw new UnsupportedOperationException();
	}

}