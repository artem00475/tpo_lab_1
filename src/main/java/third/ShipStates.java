package third;

public enum ShipStates {
    NORMAL("Нормальное состояние"),
    SHAKE("Затрясло"),
    ROUND("Развернулся кругом и направился к ракетам");

    private final String value;

    ShipStates(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
