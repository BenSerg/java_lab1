package Strategy;

public class MoveByHorse implements Moving {

    private static final String MESSAGE = "Еду на лошади...";

    @Override
    public String move() {
        return MESSAGE;
    }

}
