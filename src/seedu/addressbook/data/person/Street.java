package seedu.addressbook.data.person;

/**
 * Represents the Street portion of an Address
 * @author thamsy
 */
public class Street {
	private final String value;
	
	public Street(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}
}
