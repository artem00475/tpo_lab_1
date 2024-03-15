package third;

public enum EngineState {
    WORK_NORMAL("Работают"),
    WORK("Толкают с визгом"),
    WAIT("Выключены");

    private final String value;

    EngineState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
