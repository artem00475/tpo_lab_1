package third;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EngineTest {
    private Engine engine;

    @BeforeEach
    void init() {
        engine = new Engine();
    }

    @Test
    void initialized() {
        Assertions.assertEquals("Выключены", engine.getState().getValue());
    }

    @Test
    void workNormally() {
        Assertions.assertEquals("Работают", engine.workNormally().getValue());
    }

    @Test
    void work() {
        Assertions.assertEquals("Толкают с визгом", engine.work().getValue());
    }

    @Test
    void off() {
        Assertions.assertEquals("Выключены", engine.off().getValue());
    }
}
