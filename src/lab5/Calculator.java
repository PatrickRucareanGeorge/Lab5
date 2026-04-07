package lab5;

public class Calculator {
    protected int state;

    public Calculator(int state) {
        this.state = state ;
    }

    public Calculator add(int value) {
        this.state += value;
        return this;
    }

    public Calculator subtract(int value) {
        this.state -= value;
        return this;
    }

    public Calculator multiply(int value) {
        this.state *= value;
        return this;
    }

    public int result() {
        return this.state;
    }

    public Calculator clear() {
        this.state = 0;
        return this;
    }
}