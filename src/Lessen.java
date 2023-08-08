public enum Lessen {
    RUSSAIN("русский"),
    ENGLISH("ангдицский"),
    FRANCH("француз");
    private String lesson;

    Lessen(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Lessen{" +
                "lesson='" + lesson + '\'' +
                '}';
    }
}
