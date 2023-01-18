package HomeWork_MVP;

import java.util.ArrayList;
import java.util.Arrays;

import HomeWork_MVP.AttendentModel.AttendentServise;
import HomeWork_MVP.AttendentModel.Student;
import HomeWork_MVP.AttendentView.AllStudents;
import HomeWork_MVP.AttendentView.BadStudents;
import HomeWork_MVP.AttendentView.SortStudents;
import HomeWork_MVP.AttendentView.StatisticsView;
import HomeWork_MVP.Presenter.Presenter;
import HomeWork_MVP.AttendentModel.User;

public class Main {
    public static void main(String[] args) throws Exception {

        AttendentServise model = new AttendentServise();

        //симуляция SQL запроса. В данном случае столбцы: 0,1,2
        model.createBD(0, 1, 2);

        ArrayList<StatisticsView<User>> view = new ArrayList<>(Arrays.asList(
            new AllStudents<User>(model.students),
            new SortStudents<User>(model.students),
            new BadStudents<User>(model.students)
        ));

        Presenter presenter = new Presenter(model, view);
        presenter.start();
    }
}
