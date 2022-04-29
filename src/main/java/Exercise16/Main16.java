package Exercise16;

import java.util.Scanner;

/**
 * Clase inicial del ejercicio 16
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main16 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String name = scan.nextLine();
        System.out.println("Ingrese su edad: ");
        Integer age = scan.nextInt();
        System.out.println("Ingrese su sexo (F) o (M): ");
        char sex = scan.next().charAt(0);
        System.out.println("Ingrese su peso: ");
        Integer weight = scan.nextInt();
        System.out.println("Ingrese su altura: ");
        Float height = scan.nextFloat();

        // Primera persona
        Person person1 = new Person();
        person1.setName(name);
        person1.setAge(age);
        person1.setSex(sex);
        person1.setWeight(weight);
        person1.setHeight(height);
        Integer BMI = person1.calculateBMI();
        System.out.println(BMI);
        Boolean legalAge = person1.isOfLegalAge();
        System.out.println("¿Es mayor de edad?" + legalAge);
        System.out.println(person1);

        // Segunda persona
        Person person2 = new Person(name, age, sex);
        Integer BMI2 = person2.calculateBMI();
        System.out.println(BMI2);
        legalAge = person2.isOfLegalAge();
        System.out.println("¿Es mayor de edad? " + legalAge);
        System.out.println(person2);

        // Tercera persona
        Person person3 = new Person();
        Integer BMI3 = person2.calculateBMI();
        System.out.println(BMI3);
        legalAge = person2.isOfLegalAge();
        System.out.println("¿Es mayor de edad? " + legalAge);
        System.out.println(person3);
    }
}
