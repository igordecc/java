//      3.Return the current class object
package thisKW;

public class ReturnClassObject {

    public ReturnClassObject method1() {
        System.out.println("chain one");
        return this;
    }
    public ReturnClassObject method2() {
        System.out.println("chain two");
        return this;
    }
}
