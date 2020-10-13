package classes; // <- package declaration

// final class with inheritence from abstract
public final class Zhigul extends Car {

    // fields
    public String engine;
    public String condition;
    public String cost;
    public String brand;
    public String status;

    // constructor
    public Zhigul(
        String engine, 
        String condition, 
        String cost, 
        String brand, 
        String status ) {
        engine = engine;
        condition = condition;
        cost = cost;
        brand = brand;
        status = status;
    }

    // getter
    public final String getStatus() {
        return status;
    }
    
    // setter
    public final void setStatus(String status) {    
        status = status;
    }

    // bunch of methods

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