package HomeWork_MVP.AttendentModel;

import java.util.Date;
import java.util.HashMap;

public class Student extends User {
    public float criteria;

    public Student(String name, HashMap<Date, Boolean> attendense) {
        super(name, attendense);

    }

    @Override
    public String toString() {
        this.criteria = this.criteria * 100;
        int proc =  ((Float) this.criteria).intValue();
        String note = ": посещаемость - " + proc + "%";
        return this.getName() + " " + note;
    }
    
    
}
