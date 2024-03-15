package third;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HumanTest {
    private Ship ship;
    private Human human;

    @BeforeEach
    void init() {
        ship = Mockito.mock(Ship.class);
        human = new Human("Форд");
    }

    @Test
    void think() {
        Assertions.assertTrue(human.think("Назначение рукояток"));
        Assertions.assertFalse(human.think("Цвет рукояток"));
    }

    @Test
    void grabbedLevers() {
        Mockito.when(ship.shake()).thenReturn(ShipStates.SHAKE);
        Assertions.assertEquals("Схватился за рукоятки", human.grabbedLevers(ship));
    }

    @Test
    void grabbedHalfLevers() {
        Mockito.when(ship.fly()).thenReturn(ShipStates.ROUND);
        Assertions.assertEquals("Отпустил половину рукояток", human.grabbedHalfLevers(ship));
    }

    @Test
    void releasedLevers() {
        Mockito.when(ship.stop()).thenReturn(ShipStates.NORMAL);
        Assertions.assertEquals("Отпустил рукоятки", human.releasedLevers(ship));
    }

}
