package third;

import lombok.Getter;

@Getter
public class Engine {
    private EngineState state;

    public Engine() {
        state = EngineState.WAIT;
    }

    public EngineState work() {
        state = EngineState.WORK;
        return state;
    }

    public EngineState workNormally() {
        state = EngineState.WORK_NORMAL;
        return state;
    }

    public EngineState off() {
        state = EngineState.WAIT;
        return state;
    }
}
