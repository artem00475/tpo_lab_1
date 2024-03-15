package third;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Human {
    private String name;

    public boolean think(String target) {
        return target.equals("Назначение рукояток");
    }

    public String grabbedLevers(Ship ship) {
        if (ship.shake() == ShipStates.SHAKE)
            return "Схватился за рукоятки";
        return "";
    }

    public String grabbedHalfLevers(Ship ship) {
        if (ship.fly() == ShipStates.ROUND)
            return "Отпустил половину рукояток";
        return "";
    }

    public String releasedLevers(Ship ship) {
        if (ship.stop() == ShipStates.NORMAL)
            return "Отпустил рукоятки";
        return "";
    }


}
