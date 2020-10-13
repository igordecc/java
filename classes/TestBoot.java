package classes;

// test classes of the package
public class TestBoot{
    
    // main function
    public static void main(String[] args) {
        // System.setOut(new PrintStream(System.out, true, "UTF-8"));
        // TODO: change ASCI charset to UTF-8  (can wait)
    
        System.out.println("test 'classes' package");

        // create instance
        Zhigul theCar = new Zhigul("car engine", "ok", "400 000", "Zhigul","off");
        
        // print out some instance fields (attributes)
        System.out.println("default brand: " + theCar.brand);
        System.out.println("default engine: " + theCar.engine);
        System.out.println("default status: " + theCar.status);
        
        // use some instance methods
        theCar.start();
        System.out.println("status: " + theCar.status);
        theCar.stop();
        System.out.println("status: " + theCar.status);
    }    
}
