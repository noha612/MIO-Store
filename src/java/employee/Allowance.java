package employee;

public class Allowance {

    Employee employee;
    private int ID;
    private String name;
    private Long amount;
    private String description;

    public String getName() {
        return this.name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Long getAmount() {
        return this.amount;
    }

    /**
     *
     * @param amount
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return this.description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
