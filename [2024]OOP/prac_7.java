public class prac_7 {
    static {
        System.out.println("Static block is called");
    }

    public static void main(String[] args) {
        System.out.println("Main method is called");
        showMethodCallFlow();
        useStaticMethodAndVariable();
    }

    private static void showMethodCallFlow() {
        System.out.println("showMethodCallFlow method is called");
        calledMethod();
    }

    private static void calledMethod() {
        System.out.println("calledMethod method is called");
    }

    private static void useStaticMethodAndVariable() {
        System.out.println("useStaticMethodAndVariable method is called");
        System.out.println("Static variable value: " + staticVariable);
        staticMethod();
    }

    private static void staticMethod() {
        System.out.println("staticMethod method is called");
    }

    private static int staticVariable = 10;
}
