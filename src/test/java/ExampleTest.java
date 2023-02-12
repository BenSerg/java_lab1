import Strategy.Hero;
import Strategy.HeroRunner;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ExampleTest {

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testString(String text, int i) {
        Hero hero = new Hero();
        String expected = HeroRunner.choose(hero, i);
        Assertions.assertEquals(text, expected);
    }

    private static @NotNull Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("Иду пешком...", 0),
                Arguments.of("Еду на лошади...", 1),
                Arguments.of("Лечу на самолете...", 2)
        );
    }
}
