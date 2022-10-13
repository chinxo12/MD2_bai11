import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> myQueue = new ArrayDeque<>();
        System.out.println("Nhập vào một chuỗi cần kiểm tra!");
        String str = scanner.nextLine();
        String[] arrString = str.toLowerCase().split("");
        for (int i = 0; i < arrString.length; i++) {
            myQueue.offer(arrString[i]);
        }
        for (int i = 0; i < myQueue.size(); i++) {
            if (myQueue.)
        }

    }
}