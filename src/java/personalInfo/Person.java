package personalInfo;

public class Person {

    private int ID;
    private String dateOfBirth;
    private String gender;
    private String idCard;
    private Account account;
    private ContactInfor contactInfor;
    private FullName fullName;

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     *
     * @param dateOfBirth
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return this.gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return this.idCard;
    }

    /**
     *
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Account getAccount() {
        return this.account;
    }

    /**
     *
     * @param account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    public ContactInfor getContactInfor() {
        return this.contactInfor;
    }

    /**
     *
     * @param contactInfor
     */
    public void setContactInfor(ContactInfor contactInfor) {
        this.contactInfor = contactInfor;
    }

    public FullName getFullName() {
        return this.fullName;
    }

    /**
     *
     * @param fullName
     */
    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Person() {
        // TODO - implement Person.Person
        throw new UnsupportedOperationException();
    }

}
