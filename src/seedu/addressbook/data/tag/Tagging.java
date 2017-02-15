package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;


public class Tagging {
	private final String ADD = "+";
	private final String DELETE = "-";
	
	public enum TagStatus {
		ADD, DELETE;
	}
	private TagStatus tagStatus;
	private Person person;
	private Tag tag;
	
	public Tagging(TagStatus tagStatus, Person person, Tag tag) {
		this.tagStatus = tagStatus;
		this.person = person;
		this.tag = tag;
	}
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		if (tagStatus == TagStatus.ADD) {
			builder.append(ADD);
		} else if (tagStatus == TagStatus.DELETE){
			builder.append(DELETE);
		}
		builder.append(" " + person.getName() + " " + tag.toString());
		return builder.toString();
	}
}
