package creationalPattern.factoryMethod.animal;

public class CatFactory extends AnimalFactory {
	@Override
	public Animal createAnimal() {
		return new Cat();
	}
}
