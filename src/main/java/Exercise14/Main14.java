package Exercise14;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        Integer number = scan.nextInt();

        while (number <= 1000) {
            System.out.println(number);
            number = number + 2;
        }
    }
}
