public class User {
    private final String firstName; //required
    private final String lastName; //required
    private final int age; //optional
    private final String phone; //optional
    private final String address; //optional

    private User(UserBuilder builder) {
	this.firstName = builder.firstName;
	this.lastName = builder.lastName;
	this.age = builder.age;
	this.phone = builder.phone;
	this.address = builder.address;
    }

    public String toString() {
	String s ="";
	if (firstName != null) {
	    s += (firstName + " " + lastName);
	    s += "\n";
	}
	if (age != 0) {
	    s+= (age);
	    s += "\n";
	}
	if (phone != null) {
	    s += (phone);
	    s += "\n";
	}
	if (address != null) {
	    s += (address);
	    s += "\n";
	}
	return s;

    }
    
    public static class UserBuilder {
	private final String firstName;
	private final String lastName;
	private int age;
	private String phone;
	private String address;

	public UserBuilder(String fname, String lname) {
	    this.firstName = fname;
	    this.lastName = lname;
	}
	public UserBuilder age(int age) {
	    this.age = age; return this;
	}
	public UserBuilder phone(String phone) {
	    this.phone = phone; return this;
	}
	public UserBuilder address(String address) {
	    this.address = address; return this;
	}
	public User build() {
	    return new User(this);
	}
    }

}
