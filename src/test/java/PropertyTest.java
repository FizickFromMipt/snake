import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.pevnenko.HelperClass;

@DisplayName("Тестирование пропертей проекта")
public class PropertyTest {
    @DisplayName("Проверка получения верных проперти")
    @Test
    public void getPropertyTest(){
        Assertions.assertEquals("Snake", HelperClass.getProperty("nameProject"));
    }
}
