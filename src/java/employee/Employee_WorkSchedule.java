package employee;

import java.util.Date;

public class Employee_WorkSchedule {

	Employee employee;
	WorkSchedule workSchedule;
	private int ID;
	private String shift;
	private Date date;

	public String getShift() {
		return this.shift;
	}

	/**
	 * 
	 * @param shift
	 */
	public void setShift(String shift) {
		this.shift = shift;
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

}