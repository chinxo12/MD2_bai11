import ra.Student;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        Queue<Student> nu = new ArrayDeque<>();
        Queue<Student> nam = new ArrayDeque<>();
        System.out.println("Nhập vào số lượng sinh viên muốn thêm trong lần nhập này");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            Student student = new Student();
            System.out.println("Nhập vào thông tin sinh viên thứ " + (i+1));
            student.inputData(scanner);
            student.inputDate(scanner);
            studentList.add(student);
        }
        int cntMen = 0, cntWomen = 0;

        for (Student student:studentList) {
            if (student.getSex().toLowerCase().equals("nam")){
                nam.offer(student);
                cntMen++;
            }else if (student.getSex().toLowerCase().equals("nu")){
                nu.offer(student);
                cntWomen++;
            }
        }
        System.out.println("Hoc sinh nam");
        for (Student student :nam) {
           student.displayData();
        }
        System.out.println("Tong: " + cntMen);
        System.out.println("hoc sinh nu");
        for (Student student :nu) {
            student.displayData();
        }
        System.out.println("Tong: " + cntWomen);
    }
}