package HomeWork_MVP.AttendentModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class AttendentServise implements CreateBD {
    public List<User> students = new ArrayList<>();

    public AttendentServise() {
        

    }

    public void createBD(int row1, int row2, int row3) throws Exception {
        this.creatFinalBD(this.creatRawBD(), row1, row2, row3);
        
    }

    public ArrayList<String[]> creatRawBD() {
        ArrayList<String[]> rawBD = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("attendense.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                rawBD.add(line.replace("\n", "").split(","));
            }
            
            br.close();
        } catch (IOException e) {}
        
        return rawBD;
    }

    public void creatFinalBD(ArrayList<String[]> rawBD, int row1, int row2, int row3) throws Exception {
        HashSet<String> set= new HashSet<>();
        for (int i = 0; i < rawBD.size(); i++) {
            set.add(rawBD.get(i)[row1]); 
        }
        
        for (String name : set) {
            HashMap<Date, Boolean> attendense = new HashMap<>();
            for (int j = 0; j < rawBD.size(); j++) {
                
                if (name.equals(rawBD.get(j)[0])) {  
                    Date date3 = new SimpleDateFormat("dd.MM.yy").parse(rawBD.get(j)[row2]);   
                    Boolean b = Boolean.parseBoolean(rawBD.get(j)[row3]);  
                    attendense.put(date3, b);
                }
            }

            User student = new Student(name, attendense);
            this.students.add(student);
         
        }
    }
}
