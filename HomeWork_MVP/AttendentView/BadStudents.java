package HomeWork_MVP.AttendentView;

import java.util.List;
import HomeWork_MVP.AttendentModel.Student;
import HomeWork_MVP.AttendentModel.User;

public class BadStudents<T extends User> extends StatisticsView<T> {

    public BadStudents(List<T> students) {
        super(students);
    }

    // @Override
    // public void takeCriteria() {
    //     for (T student : this.students) {
    //         this.findCriteria(student);
    //     }
        
        
    // }

    @Override
    public void printReport() {
        for (T student : this.students) {
            if (((Student) student).criteria < 0.25f) {
                System.out.println(student);
            }
            // System.out.println(student);
        }
        
    }

    // public void findCriteria(T student) {
    //     int counter = 0;
    //     for (Date i : student.getAttendense().keySet()) {
    //         if (student.getAttendense().get(i)) counter++;
            
    //     }
        
    //     ((Student) student).criteria = (float) counter / student.getAttendense().size();
    // }
    
    
}
