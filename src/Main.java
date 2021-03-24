public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        double div = c1.Div(25,5);
        int multi = c1.Mult(25,5);
        int sum = c1.Suma(25,5);
        int resta = c1.Resta(25,6);

        System.out.println("Multi: "+multi);
        System.out.println("Division: "+div);
        System.out.println("Suma: "+sum);
        System.out.println("Resta: "+resta);
    }
}
