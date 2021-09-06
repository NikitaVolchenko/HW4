public class RailWayCar {

    String name;
    int numberOfPassengers;
    int numberOfPersonnel;

    RailWayCar() {
        name = null;
        numberOfPassengers = 0;
        numberOfPersonnel = 0;
    }

    RailWayCar(String name, int numberOfPassengers, int numberOfPersonnel) {
        this.name = name;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfPersonnel = numberOfPersonnel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPersonnel() {
        return numberOfPersonnel;
    }

    public void setNumberOfPersonnel(int numberOfPersonnel) {
        this.numberOfPersonnel = numberOfPersonnel;
    }
}
