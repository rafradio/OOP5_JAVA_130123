package HomeWork_MVP.AttendentView;

import java.util.List;

import HomeWork_MVP.AttendentModel.Student;
import HomeWork_MVP.AttendentModel.User;
import java.util.Date;

public abstract class StatisticsView<T extends User> {
    public List<T> students;

    public StatisticsView(List<T> students) {
        this.students = students;

    }

    public void takeCriteria() {
        for (T student : this.students) {
            this.findCriteria(student);
            System.out.println(((Student) student).criteria);
        } 
    }

    public void findCriteria(T student) {
        int counter = 0;
        for (Date i : student.getAttendense().keySet()) {
            if (student.getAttendense().get(i)) counter++;
            
        }
        
        ((Student) student).criteria = (float) counter / student.getAttendense().size();
    }

    public abstract void printReport();
    
}
