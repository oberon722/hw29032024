import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("CalculatorLogger");
        ComplexNumber num1 = new Complex(2, 3);
        ComplexNumber num2 = new Complex(1, -1);

        ComplexCalculator calculator = new BasicComplexCalculator(logger);

        // Примеры операций
        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);

        logger.info("Sum: " + sum);
        logger.info("Product: " + product);
        logger.info("Quotient: " + quotient);
    }
}