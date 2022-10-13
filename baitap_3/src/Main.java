import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int exTithesNumber = 19;
        Stack<Integer> myStack = new Stack<>();

        while (exTithesNumber!=0){
            myStack.push(exTithesNumber% 2);
            exTithesNumber/=2;
        }
        while (myStack.size()!=0){
            System.out.println(myStack.pop());
        }

    }
}