public class Main1 {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Animal animal = new Animal("Акула", false, true);
        zoo.pushBack(animal);

        animal = new Animal("Крокодил", false, true);
        zoo.pushBack(animal);

        animal = new Animal("Олень", true, false);
        zoo.pushBack(animal);

        animal = new Animal("Ястреб", false, true);
        zoo.pushBack(animal);

        animal = new Animal("Лось", true, false);
        zoo.pushBack(animal);

        System.out.println("=====Печать всех животных=====");
        zoo.printAnimalNames();

        System.out.println("=====Печать травоядных=====");
        zoo.printHerbivoreAnimals();

        System.out.println("=====Печать плотоядных=====");
        zoo.printCarnivorousAnimals();
    }

}
