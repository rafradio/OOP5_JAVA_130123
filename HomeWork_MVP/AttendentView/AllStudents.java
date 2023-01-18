package HomeWork_MVP.AttendentView;

import java.util.List;
import HomeWork_MVP.AttendentModel.User;

public class AllStudents<T extends User> extends StatisticsView<T> {

    public AllStudents(List<T> students) {
        super(students);
    }

    @Override
    public void printReport() {
        for (T student : this.students) {
            System.out.println(student);
        }
        
    }

}
