public class Organism {
    private String species;
    private double age;
    private double health; // say, a score between 0 - 10, 0 being "death"

    public Organism(String species) {
	this.species = species;
    }

    public void setHealth(double health) {
	this.health = health;
    }

    public double getHealth() {
	return health;
    }
    
}
