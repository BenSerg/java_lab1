package Strategy;

public class MoveOnFoot implements Moving {
    private static final String MESSAGE = "Иду пешком...";

    @Override
    public String move() {
        return MESSAGE;
    }
}
