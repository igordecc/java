public class Classes {
    public static void main(String[] args){
        System.out.println("ok");
        
        ImportantMethod();
    }

    private static String localhost = "127.0.0.1";
    private static void ImportantMethod() {
        System.out.println(localhost);
    }

    public static String getLH() {
        return localhost;
    }

    protected static void setLH(String s) {
        localhost = s;
    }
}