package Exercise2;

import Exercise1.NumberComparison;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite el primer número");
        Integer number1 = scan.nextInt();
        System.out.println("Digite el segundo número");
        Integer number2 = scan.nextInt();

        NumberComparison numberComparison = new NumberComparison();
        numberComparison.isGreater(number1, number2);
    }
}
