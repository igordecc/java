//import java.io.PrintStream;

public class Classes {
    public static void main(String[] args) {
        //System.setOut(new PrintStream(System.out, true, "UTF-8"));
        // TODO: change ASCI charset to UTF-8

        System.out.println("ok");
        
        ImportantMethod();
        Zhigul zhigul = new Zhigul("Zhigul");
        System.out.println("default name: " + zhigul.name);
        System.out.println("default motor: " + zhigul.motor);
        System.out.println("default status: " + zhigul.status);
        zhigul.start();
        zhigul.status();
        zhigul.stop();
        zhigul.status();
    }

    private static String localhost = "127.0.0.1";

    private static void ImportantMethod() {
        System.out.println(localhost);
    }

    public final static String getLH() {
        return localhost;
    }

    protected final static void setLH(String s) {
        localhost = s;
    }

    public static abstract class Vehicles {
        protected String motor = "motorName"; // abstract variable
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

    public static abstract class Car extends Vehicles {}

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