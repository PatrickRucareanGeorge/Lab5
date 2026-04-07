package lab5.advanced;

public abstract class ACalculator {
    protected Object state;

    public Object result() {
        return this.state;
    }

    public void clear() {
        init();
    }

    public abstract void init();
}