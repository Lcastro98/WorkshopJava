package Exercise5;

import java.util.ArrayList;

public class NumberClassification {

    public void pairNumbersWhile() {
        Integer number = 0;
        System.out.println("Numeros pares: ");
        while (number <= 100) {
            System.out.println(number);
            number = number + 2;
        }
    }

    public void oddNumbersWhile() {
        Integer number = 1;
        System.out.println("Numeros impares: ");
        while (number <= 100) {
            System.out.println(number);
            number = number + 2;
        }
    }

    public void pairNumbersFor() {
        System.out.println("Numeros pares: ");
        for(Integer number = 0; number<=100; number = number + 2){
            System.out.println(number);
        }
    }

    public void oddNumbersFor() {
        System.out.println("Numeros impares: ");
        for(Integer number = 1; number<=100; number = number + 2) {
            System.out.println(number);
        }
    }
}
