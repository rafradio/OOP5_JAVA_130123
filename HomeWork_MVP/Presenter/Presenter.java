package HomeWork_MVP.Presenter;

import java.util.*;
import HomeWork_MVP.AttendentModel.AttendentServise;
import HomeWork_MVP.AttendentModel.User;
import HomeWork_MVP.AttendentView.StatisticsView;

public class Presenter {
    public AttendentServise model;
    public ArrayList<StatisticsView<User>> view;
    

    public Presenter(AttendentServise model, ArrayList<StatisticsView<User>> view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - отчет по всем студенты\n")
                .append("2 - отсортированный по убыванию отчет\n")
                .append("3 - посещаемость ниже 25%\n")
                .append("0 - выход\n");

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(sb.toString());
            int clientChoise = Integer.parseInt(in.next());
            if (clientChoise == 0) {
                return;
            }
            else {
                this.printReport(clientChoise - 1);
            }
        }
        
    }

    public void printReport(int i) {
        String[] note = {"\nОтчет все студенты:\n", "\nОтчет сортировка:\n", "\nОтчет по худшей посещаемости:\n"};

        view.get(i).takeCriteria();
        System.out.println(note[i]);
        view.get(i).printReport();
    }
}
