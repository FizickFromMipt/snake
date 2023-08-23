import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.pevnenko.LogicFruit;

import java.awt.*;
import java.io.IOException;

@DisplayName("Проверка корректности логики получения фруктов")
public class FruitTest {

    @DisplayName("Проверка получения рандомных координат фруктов в заданном диапазоне")
    @Test
    public void getRandomPointFruit() {
        Assertions.assertDoesNotThrow( () -> {
            for(int i=0; i<100; i++) {
                Point pointFruit = LogicFruit.getPointFruit();
                if (pointFruit.getX() > 300 || pointFruit.getY() > 300) {
                    throw new IOException();
                }
            }
        });
    }
}
