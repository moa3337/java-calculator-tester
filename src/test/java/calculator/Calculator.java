package calculator;

public class Calculator {
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float devide(float num1, float num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Non pui dividere per zero");
        }
        return num1 / num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }
}
