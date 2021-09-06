import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrainTest {


    @Test
    public void test() {

        Train train = new Train();

        RailWayCar railWayCar = new RailWayCar("Locomotive",0,2);
        train.pushBack(railWayCar);

        railWayCar = new RailWayCar("Restaurant car", 0, 5);
        train.pushBack(railWayCar);

        railWayCar = new RailWayCar("Compartment car", 36,2);
        train.pushBack(railWayCar);

        railWayCar = new RailWayCar("Compartment car", 36,2);
        train.pushBack(railWayCar);

        railWayCar = new RailWayCar("Reserved seat", 54, 2);
        train.pushBack(railWayCar);

        assertEquals(13, train.getNumberOfPersonnel());
        assertEquals(139, train.getTheNumberOfAllTrainPeople());
        assertEquals(72, train.getNumberOfPassengersInTheCompartment());
        assertEquals(54, train.getTheNumberOfReservedSeatPassengers());
        assertEquals(126, train.getNumberOfPassengers());
    }
}