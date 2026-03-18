public class SimpleCalculator {

    private double result;

    public SimpleCalculator() { //1 commit
        result = 0;
    }

    public void add(double value) {
        result = result + value;
    }

    public void subtract(double value) { //3 comit
        result = result - value;
    }

    public void multiply(double value) {
        result = result * value;
    }

    public void divide(double value) {
        if (value != 0) {
            result = result / value;
        } else {
            System.out.println("Division by zero");
        }
    }

    public double getResult() {
        return result;
    }

    public void reset() {
        result = 0;
    }
}