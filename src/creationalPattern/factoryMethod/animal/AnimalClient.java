package creationalPattern.factoryMethod.animal;

public class AnimalClient {

	public static void main(String[] args) {
		AnimalFactory dogFactory = new DogFactory();
		Animal dog = dogFactory.createAnimal();
		dog.speak();
		
		AnimalFactory catFactory = new CatFactory();
		Animal cat = catFactory.createAnimal();
		cat.speak();	
	}
}