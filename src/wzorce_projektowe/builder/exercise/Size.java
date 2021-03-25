package wzorce_projektowe.builder.exercise;

public enum Size {
    LARGE(36),
    MEDIUM(32),
    SMALL(26);

    int diameter;

    Size(int diameter) {
        this.diameter = diameter;
    }
}