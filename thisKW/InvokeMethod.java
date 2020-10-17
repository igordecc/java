// 2. invoke current class method
package thisKW;

public class InvokeMethod {
    public int addXY(int x, int y) {
        return x + y;
    }

    public int addXYMultipliedByTwo(int x, int y) {
        int xy = this.addXY(x, y);
        return xy * 2;
    }
}
