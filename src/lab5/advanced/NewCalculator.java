package lab5.advanced;

public class NewCalculator extends ACalculator {

    public NewCalculator(Integer initialState) {
        this.state = initialState;
    }

    @Override
    public void init() {
        this.state = 0;
    }

    public NewCalculator add(Integer value) {
        this.state = (Integer) this.state + value;
        return this;
    }

    public NewCalculator subtract(Integer value) {
        this.state = (Integer) this.state - value;
        return this;
    }

    public NewCalculator multiply(Integer value) {
        this.state = (Integer) this.state * value;
        return this;
    }
}