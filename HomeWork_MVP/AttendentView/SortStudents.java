package HomeWork_MVP.AttendentView;

import java.util.List;
import HomeWork_MVP.AttendentModel.Student;
import HomeWork_MVP.AttendentModel.User;

public class SortStudents<T extends User> extends StatisticsView<T> {

    public SortStudents(List<T> students) {
        super(students);
    }

    @Override
    public void printReport() {
        for (int i = 0; i < this.students.size(); i++) {
            for (int j = 0; j < this.students.size() - 1 - i; j++) {
                
                if (((Student) this.students.get(j)).criteria < ((Student) this.students.get(j+1)).criteria) {
                    T min = this.students.get(j);
                    this.students.set(j, this.students.get(j+1));
                    this.students.set(j+1, min);

                }
            }
             
        }
        
        for (T student : this.students) {
            System.out.println(student);
        }
        
    }
  
}
