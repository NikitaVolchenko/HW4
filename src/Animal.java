public class Animal {

    String name;
    boolean isHerbivore;
    boolean isCarnivorous;

    Animal() {
        name = null;
        isHerbivore = false;
        isCarnivorous = false;
    }

    Animal(String name, boolean isHerbivore, boolean isCarnivorous) {
        this.name = name;
        this.isHerbivore = isHerbivore;
        this.isCarnivorous = isCarnivorous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHerbivore() {
        return isHerbivore;
    }

    public void setHerbivore(boolean herbivore) {
        isHerbivore = herbivore;
    }

    public boolean isCarnivorous() {
        return isCarnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        isCarnivorous = carnivorous;
    }
}
