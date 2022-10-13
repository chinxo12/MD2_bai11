import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> integerStack = new Stack<>();
        System.out.println("Bạn muốn nhập bao nhiêu số?");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập vào số thứ " + (i+1));
            int number = Integer.parseInt(scanner.nextLine());
            integerStack.push(number);
        }
        while (integerStack.size()!=0){
            System.out.println(integerStack.pop());
        }
    }
}