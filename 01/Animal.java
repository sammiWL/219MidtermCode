public class Animal extends Organism {
    public Animal(String species) {
	super (species); // calls the super class' constructor
    }
    public static void main(String[] args) {
	Animal ant = new Animal("ant");
	ant.setHealth(10);
	System.out.println(ant.getHealth());
    }
}
