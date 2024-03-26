// Интерфейс для калькулятора комплексных чисел
interface ComplexCalculator {
    ComplexNumber add(ComplexNumber a, ComplexNumber b);
    ComplexNumber multiply(ComplexNumber a, ComplexNumber b);
    ComplexNumber divide(ComplexNumber a, ComplexNumber b);
}