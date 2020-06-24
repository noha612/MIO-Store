package employee;

import java.util.*;
import personalInfo.Person;

public class Employee extends Person {

    Collection<Employee_WorkSchedule> employee_WorkSchedules1;
    private String position;
    private Long salary;
    private Date startDate;
    private BranchStore branchStore;
    private Allowance allowance;

    public String getPosition() {
        return this.position;
    }

    /**
     *
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    public Long getSalary() {
        return this.salary;
    }

    /**
     *
     * @param salary
     */
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    /**
     *
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public BranchStore getBranchStore() {
        return this.branchStore;
    }

    /**
     *
     * @param branchStore
     */
    public void setBranchStore(BranchStore branchStore) {
        this.branchStore = branchStore;
    }

    public Allowance getAllowance() {
        return this.allowance;
    }

    /**
     *
     * @param allowance
     */
    public void setAllowance(Allowance allowance) {
        this.allowance = allowance;
    }

    public Employee() {
        // TODO - implement Employee.Employee
        throw new UnsupportedOperationException();
    }

}
