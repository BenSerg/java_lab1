package Strategy;

public class Hero {
    Moving moving;

    public void setMoving(Moving moving) {
        this.moving = moving;
    }

    public String startMoving() {
        return moving.move();
    }
}
