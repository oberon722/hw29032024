import java.util.logging.Logger;

// Реализация калькулятора комплексных чисел
class BasicComplexCalculator implements ComplexCalculator {
    private final Logger logger;

    public BasicComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        logger.info("Adding " + a + " and " + b);
        return ((Complex) a).add((Complex) b);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        logger.info("Multiplying " + a + " and " + b);
        return ((Complex) a).multiply((Complex) b);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        logger.info("Dividing " + a + " by " + b);
        return ((Complex) a).divide((Complex) b);
    }
}
