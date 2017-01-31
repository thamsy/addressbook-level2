package seedu.addressbook.data.person;

/**
 * Represents the Unit Number portion of an Address
 * @author thamsy
 */
public class UnitNum {
	private final String value;
	
	public UnitNum(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}
}
