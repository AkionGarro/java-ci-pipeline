public class Calculator {

    int Suma(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    int Resta(int num1, int num2) {
        int rest = num1 - num2;
        return rest;
    }

    int Mult(int num1, int num2) {
        int mult = num1 * num2;
        return mult;
    }

    double Div(double num1,double num2){
        double div=0;
        try {
            div = num1 / num2;

        }catch (ArithmeticException ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return div;
    }

}
