package classes;

public class TestBoot{
    public static void main(String[] args) {
        //System.setOut(new PrintStream(System.out, true, "UTF-8"));
        // TODO: change ASCI charset to UTF-8
    
        System.out.println("ok");

        Zhigul theCar = new Zhigul("car engine", "ok", "400 000", "Zhigul","off");
        System.out.println("default brand: " + theCar.brand);
        System.out.println("default engine: " + theCar.engine);
        System.out.println("default status: " + theCar.status);
        theCar.start();
        System.out.println("status: " + theCar.status);
        theCar.stop();
        System.out.println("status: " + theCar.status);
    }    
}
