package seedu.addressbook.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

public class NameTest {
	@Test
	public void isSimilar_oneNull() throws IllegalValueException{
		Name name1 = new Name("a");
		assertFalse(name1.isSimilar(null));
	}
	
	@Test
	public void isSimilar_exactlySame() throws IllegalValueException{
		Name name1 = new Name("John Smith");
		Name name2 = new Name("John Smith");
		assertTrue(name1.isSimilar(name2));
	}
	
	@Test
	public void isSimilar_similarButDifferentCase() throws IllegalValueException{
		Name name1 = new Name("john smIth");
		Name name2 = new Name("JoHn Smith");
		assertTrue(name1.isSimilar(name2));
	}
	
	@Test
	public void isSimilar_notSimilar() throws IllegalValueException{
		Name name1 = new Name("Johns Smith");
		Name name2 = new Name("John Smith");
		assertFalse(name1.isSimilar(name2));
	}
}
