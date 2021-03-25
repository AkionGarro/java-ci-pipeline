public class Calculator {
    private int suma,resta,multi;
    private double div;

    int Suma(int num1, int num2) {
        suma = num1 + num2;
        return suma;
    }

    int Resta(int num1, int num2) {
        resta = num1 - num2;
        return resta;
    }

    int Mult(int num1, int num2) {
        multi = num1 * num2;
        return multi;
    }

    double Div(int num1,int num2){
        div=0;
        try {
            div = num1 / num2;

        }catch (ArithmeticException ex){
            System.out.println("Error: "+ex.getMessage());
            System.out.println("Debido al error la division es cero");
        }
        return div;
    }

    public int getSuma() {
        return suma;
    }

    public int getResta() {
        return resta;
    }

    public int getMulti() {
        return multi;
    }


    public double getDiv() {
        return div;
    }


}
