import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> myquere = new PriorityQueue<>();

        myquere.offer("Ngoc mai");
        myquere.offer("Minh thoa");
        myquere.offer("Tiep");
        myquere.offer("Abc");
        myquere.offer("Hung");
        myquere.offer("Minh anh");
        myquere.offer("Ngoc maii");

        myquere.offer("Cong hoa xa hoi chu nghia viet nam");
        myquere.offer("Ac");

        for (String str :
                myquere) {
            System.out.println(str);
        }
    }
}