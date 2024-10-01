package creationalPattern.factoryMethod.animal;

public class DogFactory extends AnimalFactory {
	@Override
	public Animal createAnimal() {
		return new Dog();
	}
}