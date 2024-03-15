package third;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ShipTest {
    private Ship ship;
    private Engine engine;

    @BeforeEach
    void init() {
        engine = Mockito.mock(Engine.class);
        ship = new Ship(engine);
    }

    @Test
    void initialized() {
        Assertions.assertEquals("Нормальное состояние", ship.getState().getValue());
    }

    @Test
    void fly() {
        Mockito.when(engine.workNormally()).thenReturn(EngineState.WORK_NORMAL);
        ship.fly();
        Assertions.assertEquals("Развернулся кругом и направился к ракетам", ship.getState().getValue());
    }

    @Test
    void shake() {
        Mockito.when(engine.work()).thenReturn(EngineState.WORK);
        ship.shake();
        Assertions.assertEquals("Затрясло", ship.getState().getValue());
    }

    @Test
    void stop() {
        Mockito.when(engine.off()).thenReturn(EngineState.WAIT);
        ship.stop();
        Assertions.assertEquals("Нормальное состояние", ship.getState().getValue());
    }
}
