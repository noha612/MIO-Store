package customer;

import personalInfo.Person;
import java.util.*;

public class Customer extends Person {
	private MIOCard mIOCard;
	private MembershipType membershipType;

	public MIOCard getMIOStoreCard() {
		// TODO - implement Customer.getMIOStoreCard
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mIOStoreCard
	 */
	public void setMIOStoreCard(MIOCard mIOStoreCard) {
		// TODO - implement Customer.setMIOStoreCard
		throw new UnsupportedOperationException();
	}

	public MembershipType getMembershipType() {
		return this.membershipType;
	}

	/**
	 * 
	 * @param membershipType
	 */
	public void setMembershipType(MembershipType membershipType) {
		this.membershipType = membershipType;
	}

	public Customer() {
		// TODO - implement Customer.Customer
		throw new UnsupportedOperationException();
	}

}