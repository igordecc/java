package classes;

public final class Zhigul extends Car {
    /**
     * Create car object
     * @param engine car engine, most important
     * @param condition car condition - ok, acceptable or not working
     * @param cost money cost, including money type
     * @param brand brand of the car
     * @param status on or off
     */
    public String engine;
    public String condition;
    public String cost;
    public String brand;
    public String status;

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

    public final String getStatus() {
        return status;
    }

    public final void setStatus(String status) {
        status = status;
    }

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