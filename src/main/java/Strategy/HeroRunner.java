package Strategy;

import java.util.ArrayList;

public class HeroRunner {
    public static String choose(Hero hero, int i) {
        switch (i) {
            case 0 -> {
                hero.setMoving(new MoveOnFoot());
                return hero.startMoving();
            }
            case 1 -> {
                hero.setMoving(new MoveByHorse());
                return hero.startMoving();
            }
            case 2 -> {
                hero.setMoving(new MoveByPlane());
                return hero.startMoving();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        ArrayList<Integer> movements = new ArrayList<>() {
            {
                add(0);
                add(1);
                add(2);
            }
        };
        System.out.println("0 - идти пешком");
        System.out.println("1 - ехать на лошади");
        System.out.println("2 - лететь на самолете");
        ConsoleReader consoleReader = new ConsoleReader();
        int i = consoleReader.nextInt();
        while (movements.contains(i)) {
            System.out.println(choose(hero, i));
            i = consoleReader.nextInt();
        }
    }

}
