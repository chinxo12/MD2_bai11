package ra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String name;
    private String sex;
    private String date;

    public Student() {
    }

    public Student(String name, String sex, String date) {
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void inputData (Scanner scanner){
        System.out.println("Nhập vào tên học viên");
        this.name = scanner.nextLine();
        System.out.println("Nhập vào giới tính (Nam/Nữ)");
        this.sex = scanner.nextLine();

    }
    public void inputDate (Scanner scanner) throws ParseException {
        Date dateOfbirth = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("Nhập vào ngày tháng năm sinh (yyyy/MM/dd)");
        this.date  = scanner.nextLine();
        this.date = String.valueOf(simpleDateFormat.parse(this.date));
    }
    public void displayData (){
        System.out.printf("Họ và tên: %s - Giới tính: %s  - Ngày tháng năm sinh: %s\n", this.name,this.sex,this.date);
    }
}
