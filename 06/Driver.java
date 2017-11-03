public class Driver {
    public static void main(String[] args) {
	User u = new User.UserBuilder("Sammi","Wooo")
	    .age(19)
	    .phone("why is phone a string")
	    .address("i live here")
	    .build();
	System.out.println(u);

	User u2 = new User.UserBuilder("FIRST","LAST")
	    .phone("555-555")
	    .address("I LIVE HERE")
	    .build();

	System.out.print(u2);
    }
}
