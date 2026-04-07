package lab5;

public class AppLab5 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + result);
        System.out.println("-------------------");
        AdvancedCalculator advCalculator = new AdvancedCalculator(16);
        int advancedResult = advCalculator.root(2)
                .add(1)
                .power(2)
                .divide(5)
                .result();

        System.out.println("b) Rezultat advanced: " + advancedResult);
    }
}