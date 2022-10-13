import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String [] arrString  = str.toLowerCase().split(" ");
        Map<String, Integer> myMap = new TreeMap<>();
        for (int i = 0; i < arrString.length; i++) {
            if (myMap.containsKey(arrString[i])){
                myMap.put(arrString[i],myMap.get(arrString[i])+1);
            }else {
                myMap.put(arrString[i],i);
            }
        }
        for (String str1: myMap.keySet() ) {
            System.out.println(str1 + myMap.get(str1));
        }
    }
}