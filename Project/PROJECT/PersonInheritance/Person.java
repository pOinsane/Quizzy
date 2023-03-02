package PersonInheritance;
import java.util.Date;

public abstract class Person {

	protected String type;
	protected java.util.Date dateCreated;
	
	Person(){}

	public Person(String type, Date dateCreated) {
		super();
		this.type = type;
		this.dateCreated = dateCreated;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "Person [type=" + type + ", dateCreated=" + dateCreated + "]";
	}
	
	public abstract String getInfo(); //An abstract method that differs in Candidate and Admin Classes
}
