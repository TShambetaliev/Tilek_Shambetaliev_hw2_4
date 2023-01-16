import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> spisokA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите 5 мужских имен");
            spisokA.add(scanner.next());
        }
        System.out.println(spisokA);
        ArrayList<String> spisokB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите 5 женских имен");
            spisokB.add(scanner.next());
        }
        System.out.println(spisokB);
        Collections.reverse(spisokB);
        ArrayList<String> spisokC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            spisokC.add(spisokA.get(i));
            spisokC.add(spisokB.get(i));
        }
        System.out.println(spisokC);

        spisokC.sort(Comparator.comparing(String::length));
        System.out.println(spisokC);
    }
}