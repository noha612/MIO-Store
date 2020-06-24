package employee;

import java.util.*;

public class WorkSchedule {

	Collection<Employee_WorkSchedule> employee_WorkSchedulesa;
	private int ID;
	private String month;
	private String year;
	private Collection<List<Employee_WorkSchedule>> employee_WorkSchedules;

	public String getMonth() {
		return this.month;
	}

	/**
	 * 
	 * @param month
	 */
	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return this.year;
	}

	/**
	 * 
	 * @param year
	 */
	public void setYear(String year) {
		this.year = year;
	}

	public Employee_WorkSchedule getEmployee_WorkSchedules() {
		// TODO - implement WorkSchedule.getEmployee_WorkSchedules
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param employee_WorkSchedules
	 */
	public void setEmployee_WorkSchedules(Employee_WorkSchedule employee_WorkSchedules) {
		// TODO - implement WorkSchedule.setEmployee_WorkSchedules
		throw new UnsupportedOperationException();
	}

}