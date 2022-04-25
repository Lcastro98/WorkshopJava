package Exercise1;

public class NumberComparison {
    public void isGreater(Integer number1, Integer number2) {
        if (number1 > number2) {
            System.out.println(number1 + " es mayor que " + number2);
        } else if (number1 < number2) {
            System.out.println(number2 + " es mayor que " + number1);
        } else {
            System.out.println("Son iguales");
        }
    }
}
