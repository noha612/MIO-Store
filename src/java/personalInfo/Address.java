package personalInfo;

public class Address {

	private int ID;
	private String city;
	private String district;
	private String town;
	private String description;

	public String getCity() {
		return this.city;
	}

	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	/**
	 * 
	 * @param district
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTown() {
		return this.town;
	}

	/**
	 * 
	 * @param town
	 */
	public void setTown(String town) {
		this.town = town;
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