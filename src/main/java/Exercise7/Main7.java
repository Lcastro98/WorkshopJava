package Exercise7;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer number;

        do {
            System.out.println("Escriba un número: ");
            number = scan.nextInt();
        } while (number < 0);
        System.out.println(number);
    }
}
