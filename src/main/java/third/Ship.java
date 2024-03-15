package third;

import lombok.Getter;

@Getter
public class Ship {
    private ShipStates state;
    private Engine engine;

    public Ship(Engine engine) {
        state = ShipStates.NORMAL;
        this.engine = engine;
    }

    public ShipStates shake() {
        if (engine.work() == EngineState.WORK)
            state = ShipStates.SHAKE;
        return state;
    }

    public ShipStates fly() {
        if (engine.workNormally() == EngineState.WORK_NORMAL)
            state = ShipStates.ROUND;
        return state;
    }

    public ShipStates stop() {
        if (engine.off() == EngineState.WAIT)
            state = ShipStates.NORMAL;
        return state;
    }
}
