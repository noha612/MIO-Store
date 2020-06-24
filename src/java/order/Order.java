package order;

import payment.Payment;
import shipping.Shipping;
import java.util.Date;

public class Order {

	Bill order;
	private int ID;
	private String type;
	private Date date;
	private Payment payment;
	private Shipping shipping;

	public String getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	public Payment getPayment() {
		return this.payment;
	}

	/**
	 * 
	 * @param payment
	 */
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Order() {
		// TODO - implement Order.Order
		throw new UnsupportedOperationException();
	}

}