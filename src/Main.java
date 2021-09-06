public class Main {

    public static void main(String[] args) {

        Worker[] workers = new Worker[5];
        workers[0] = new Programmer();
        workers[1] = new Fireman();
        workers[2] = new Doctor();
        workers[3] = new Programmer();
        workers[4] = new Doctor();

        for (int i = 0; i < 5; i++) {
            workers[i].work();
        }

    }

}
