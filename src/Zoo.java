public class Zoo {

    Animal[] animals;
    int size;

    Zoo() {
        size = 0;
        animals = new Animal[0];
    }

    Zoo(int size) {
        this.size = size;
        animals = new Animal[size];
        for (int i = 0; i < size; i++) {
            animals[i] = new Animal();
        }
    }

    public void pushBack(Animal animal) {
        Animal[] buffer = animals.clone();
        size++;
        animals = new Animal[size];
        for (int i = 0; i < buffer.length; i++) {
            animals[i] = buffer[i];
        }
        animals[buffer.length] = animal;
    }

    public void printAnimalNames() {
        for (int i = 0; i < size; i++) {
            System.out.println(animals[i].getName());
        }
    }

    public void printHerbivoreAnimals() {
        for (int i = 0; i < size; i++) {
            if (animals[i].isHerbivore()) {
                System.out.println(animals[i].getName());
            }
        }
    }

    public void printCarnivorousAnimals() {
        for (int i = 0; i < size; i++) {
            if (animals[i].isCarnivorous) {
                System.out.println(animals[i].getName());
            }
        }
    }

}
