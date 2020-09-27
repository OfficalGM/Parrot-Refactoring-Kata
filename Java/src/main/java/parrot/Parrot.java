package parrot;

public abstract class Parrot {

    public static final double BASE_SPEED = 12.0D;

    abstract public double getSpeed();

    public static Parrot european() {
        return new EuropeanParrot();
    }

    public static Parrot african(int numberOfCoconuts) {
        return new AfricanParrot(numberOfCoconuts);
    }

    public static Parrot norwegianBlue(double voltage) {
        return new NorwegianBlueParrot(voltage);
    }

}
