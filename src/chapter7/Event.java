package chapter7;

/**
 * Created by kkrol on 07/01/2016.
 */
abstract class Event {
    private final String name;

    protected Event(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
