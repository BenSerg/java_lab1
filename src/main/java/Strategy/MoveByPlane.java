package Strategy;

public class MoveByPlane implements Moving {
    private static final String MESSAGE = "Лечу на самолете...";

    @Override
    public String move() {
        return MESSAGE;
    }
}
