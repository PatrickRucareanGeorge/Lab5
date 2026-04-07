package lab5.advanced;

public class Lab5Adv {
    public static void main(String[] args) {

        NewCalculator intCalc = new NewCalculator(10);
        Object intResult = intCalc.add(5)
                .subtract(3)
                .multiply(2)
                .result();

        System.out.println("(10 + 5 - 3) * 2 = " + intResult);

        DoubleCalculator doubleCalc = new DoubleCalculator(10.0);
        Object doubleResult = doubleCalc.add(5.0)
                .subtract(3.3)
                .multiply(2.2)
                .result();

        System.out.println("(10 + 5 - 3.3) * 2.2 = " + doubleResult);
    }
}