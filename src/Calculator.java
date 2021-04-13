public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firtsOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firtsOperand + secondOperand;
            case SUBTRACTION:
                return firtsOperand - secondOperand;
            case MULTIPLICATION:
                return firtsOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firtsOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}