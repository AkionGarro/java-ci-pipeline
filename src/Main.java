public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.Div(25, 2);
        c1.Mult(25, 5);
        c1.Suma(25, 5);
        c1.Resta(25, 6);

        System.out.println("Multi: " + c1.getMulti());
        System.out.println("Division: " + c1.getDiv());
        System.out.println("Suma: " + c1.getSuma());
        System.out.println("Resta: " + c1.getResta());
    }
}
