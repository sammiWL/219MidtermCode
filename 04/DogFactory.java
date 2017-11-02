class DogFactory {
    public static Dog getDog(String criteria) {
	if (criteria.equals("small")) return new Poodle();
	else if (criteria.equals("big")) return new Rottweiler();
	else if (criteria.equals("working")) return new SiberianHusky();
	return null;
    }

    public static void main(String[] args) {
	System.out.println("Small dog says: ");
	getDog("small").speak();
	System.out.println("Big dog says: ");
	getDog("big").speak();
	System.out.println("Working dog says: ");
	getDog("working").speak();
    }
}
