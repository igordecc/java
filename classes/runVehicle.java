/*
Application class
Compile and boot to run hardcoded vehicle.
*/
public class runVehicle {
    public static void main(String[] args){
        System.out.println("hello");
        Car someCar = new Car();
    }
    
    /*
    Abstract class for all Vehicle - from cars to planes
    */
    public static abstract class Vehicles {
        protected String engine = "engineName"; // abstract variable
        protected String status = "ok";

        public final String getStatus() {
            return status;
        }

        public final void setStatus(String status) {
            this.status = status;
        }

        public final String status() {
            String status = getStatus();
            System.out.println(status);
            return status;
        }

        // abstract method for any inherited classes
        protected abstract void start();
        protected abstract void stop();
        protected abstract void honk();

    }

    public static abstract class Car extends Vehicles {
        /**
         * Create car object
         * @param engine car engine, most important
         * @param condition car condition - ok, acceptable or not working
         * @param cost money cost, including money type
         * @param brand brand of the car
         * @param state on or off
         */
        private Car(String engine, String condition, String cost, String brand, String state) {
            this.engine = engine;
            this.condition = condition;
            this.state = state;
            this.cost = cost;
        }
    }

    public static final class Zhigul extends Car {
        final String name;
        protected Zhigul(String name) {
            this.name = name;
        }

        private String motor = "disel";
        private String status = "ok";

        protected final void start() {
            System.out.println("вививививививививививививививививи");
            setStatus("on");
        }

        protected final void stop() {
            System.out.println("ви-ви-тхтхтхтхтхтхтх");
            setStatus("off");
        }

        protected final void honk() {
            System.out.println("бип-бип");
        }
    }
}