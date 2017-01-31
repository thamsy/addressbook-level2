package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be in the following format: BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String ADDRESS_SEPARATOR = ", ";
    public static final String ADDRESS_VALIDATION_REGEX = ".+" + ADDRESS_SEPARATOR + ".+" + ADDRESS_SEPARATOR + ".+" + ADDRESS_SEPARATOR + ".+";


    private final Block block;
    private final Street street;
    private final UnitNum unitNum;
    private final PostalCode postalCode;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        
        String[] addressParts = trimmedAddress.split(ADDRESS_SEPARATOR);
        this.block = new Block(addressParts[0]);
        this.street = new Street(addressParts[1]);
        this.unitNum = new UnitNum(addressParts[2]);
        this.postalCode = new PostalCode(addressParts[3]);
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return block.toString() + ADDRESS_SEPARATOR
        		+ street.toString() + ADDRESS_SEPARATOR
        		+ unitNum.toString() + ADDRESS_SEPARATOR
        		+ postalCode.toString();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.toString().equals(((Address) other).toString())); // state check
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
