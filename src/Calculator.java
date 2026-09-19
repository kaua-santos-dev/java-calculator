public class Calculator {

    // Método seguro contra divisão por zero - isso que cliente ama
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            System.out.println("10 + 5 = " + calc.add(10, 5));
            System.out.println("10 / 0 = " + calc.divide(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Bug fixed: " + e.getMessage());
        }
    }
}