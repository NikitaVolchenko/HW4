public class Train {

    RailWayCar[] railWayCars;
    int size;

    Train() {
        size = 0;
        railWayCars = new RailWayCar[0];
    }

    Train(int size) {
        this.size = size;
        railWayCars = new RailWayCar[size];
        for (int i = 0; i < size; i++) {
            railWayCars[i] = new RailWayCar();
        }
    }

    public void setRailWayCar(RailWayCar railWayCar, int i) {
        railWayCars[i] = railWayCar;
    }

    public void pushBack(RailWayCar railWayCar) {
        RailWayCar[] buffer = railWayCars.clone();
        size++;
        railWayCars = new RailWayCar[size];
        for (int i = 0; i < buffer.length; i++) {
            railWayCars[i] = buffer[i];
        }
        railWayCars[buffer.length] = railWayCar;
    }

    public int getTheNumberOfAllTrainPeople() {

        int count = 0;

        for (int i = 0; i < size; i++) {
            count += railWayCars[i].getNumberOfPassengers() + railWayCars[i].getNumberOfPersonnel();
        }

        return count;
    }

    public int getNumberOfPassengers() {

        int count = 0;

        for (int i = 0; i < size; i++) {
            count += railWayCars[i].getNumberOfPassengers();
        }

        return count;
    }

    public int getNumberOfPersonnel() {

        int count = 0;

        for (int i = 0; i < size; i++) {
            count += railWayCars[i].getNumberOfPersonnel();
        }

        return count;
    }

    public int getNumberOfPassengersInTheCompartment() {

        int count = 0;

        for (int i = 0; i < size; i++) {
            if (railWayCars[i].getName() == "Compartment car") {
                count += railWayCars[i].getNumberOfPassengers();
            }
        }

        return count;
    }

    public int getTheNumberOfReservedSeatPassengers() {

        int count = 0;

        for (int i = 0; i < size; i++) {
            if (railWayCars[i].getName() == "Reserved seat") {
                count += railWayCars[i].getNumberOfPassengers();
            }
        }

        return count;
    }
}
