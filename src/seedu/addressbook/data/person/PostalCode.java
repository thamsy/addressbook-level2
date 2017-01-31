package seedu.addressbook.data.person;

/**
 * Represents the Postal Code portion of an Address
 * @author thamsy
 */
public class PostalCode {
	private final String value;
	
	public PostalCode(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}
}
