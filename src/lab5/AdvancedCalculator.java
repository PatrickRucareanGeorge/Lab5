package lab5;

public class AdvancedCalculator extends Calculator {

    public AdvancedCalculator(int state) {
        super(state);
    }


    public AdvancedCalculator divide(int value) {
        if (value != 0) {
            this.state /= value;
        } else {
            System.out.println("Eroare: Împărțire la zero!");
        }
        return this;
    }

    public AdvancedCalculator power(int value) {
        this.state = (int) Math.pow(this.state, value);
        return this;
    }

    public AdvancedCalculator root(int n) {
        if (n != 0) {
            this.state = (int) Math.pow(this.state, 1.0 / n);
        }
        return this;
    }
@Override
    public AdvancedCalculator add(int value) {
        super.add(value);
        return this;
    }

    @Override
    public AdvancedCalculator subtract(int value) {
        super.subtract(value);
        return this;
    }

    @Override
    public AdvancedCalculator multiply(int value) {
        super.multiply(value);
        return this;
    }

    @Override
    public AdvancedCalculator clear() {
        super.clear();
        return this;
    }
}
