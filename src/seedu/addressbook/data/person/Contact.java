package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public abstract class Contact {
    public final String value;
    protected boolean isPrivate;
    
    public Contact(String str, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        this.value = str.trim();
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
