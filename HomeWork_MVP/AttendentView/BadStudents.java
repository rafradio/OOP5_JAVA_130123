package HomeWork_MVP.AttendentView;

import java.util.List;
import HomeWork_MVP.AttendentModel.Student;
import HomeWork_MVP.AttendentModel.User;

public class BadStudents<T extends User> extends StatisticsView<T> {

    public BadStudents(List<T> students) {
        super(students);
    }

    @Override
    public void printReport() {
        for (T student : this.students) {
            if (((Student) student).criteria < 0.25f) {
                System.out.println(student);
            }

        }
        
    }

    
}
