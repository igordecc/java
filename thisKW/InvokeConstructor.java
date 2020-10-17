//      1.Invoke current class constructor
package thisKW;

public class InvokeConstructor {

    public InvokeConstructor() {
        System.out.println("default constructor");
    }

    public InvokeConstructor(int x) {
        this(); // calling default constructor
        System.out.println("argument " + x);
    }
    // may invoke parametrizes constructor as well
}
