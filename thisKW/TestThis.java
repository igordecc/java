package thisKW;

public class TestThis {
    public static void main(String[] args) {

        // this points to the current object in the method or constructor.
        // this can be used to
//      1.Invoke current class constructor
        System.out.println(new InvokeConstructor(555));

//      2.Invoke current class method
        InvokeMethod classWithMethod =  new InvokeMethod();
        System.out.println(classWithMethod.addXYMultipliedByTwo(10, 5));
        
//      3.Return the current class object
        ReturnClassObject returned = new ReturnClassObject();
        System.out.println(returned.method1().method2()); // channing

//      4.Pass an argument in the method call
        SetAndGet kek = new SetAndGet();
        kek.Setter(5);
        System.out.println("getter: " + kek.Getter());

//      5.Pass an argument in the constructor call
        // save argument to the attribute with the same name
        // return inside println call
        WithThis objectWithFields = new WithThis(123, 123.123f);
        WithoutThis objectWithoutFields = new WithoutThis(123, 123.123f);
        System.out.println("result With this: " + objectWithFields.x + " " + objectWithFields.y);
        System.out.println("result Without this: " + objectWithoutFields.x + " " + objectWithoutFields.y);

    }
}