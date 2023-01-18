package HomeWork_MVP.AttendentModel;

import java.util.Date;
import java.util.HashMap;

public abstract class User {
    private String name;
    private HashMap<Date, Boolean> attendense = new HashMap<>();

    public User(String name, HashMap<Date, Boolean> attendense) {
        this.name = name;
        this.attendense = attendense;
    }

    public String getName() {
        return this.name;
    }

    public HashMap<Date, Boolean> getAttendense() {
        return this.attendense;
    }

    @Override
    abstract public String toString();
}
