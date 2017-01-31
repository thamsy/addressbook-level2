package seedu.addressbook.data.person;

/**
 * Represents the block portion of an Address
 * @author thamsy
 */
public class Block {
	private final String value;
	
	public Block(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}
}
