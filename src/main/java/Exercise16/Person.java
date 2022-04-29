package Exercise16;

/**
 * Contiene los atributos y métodos de la clase persona
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Person {
    private String name = "";
    private Integer age = 0;
    private String DNI;
    private char sex = 'H';
    private Integer weight = 0;
    private Float height = 0F;

    /**
     * Constructor vacío
     */
    public Person() {
        this.generateDNI();
    }

    /**
     * Constructor
     *
     * @param name
     * @param age
     * @param sex
     */
    public Person(String name, Integer age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.generateDNI();
    }

    /**
     * Constructor con todos los atributos
     *
     * @param name
     * @param age
     * @param DNI
     * @param sex
     * @param weight
     * @param height
     */
    public Person(String name, Integer age, String DNI, char sex, Integer weight, Float height) {
        this.name = name;
        this.age = age;
        this.generateDNI();
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    /**
     * Método para calcular el indice de masa corporal
     *
     * @return
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public Integer calculateBMI() {
        Double BMI = this.weight / Math.pow(this.height, 2);
        System.out.println("Tú IMC es " + BMI);
        final Integer underweight = -1;
        final Integer normalWeight = 0;
        final Integer overweight = 1;
        String message;

        if (BMI < 20) {
            message = "Bajo de peso";
            System.out.println(message);
            return underweight;
        }
        if (BMI > 25) {
            message = "Sobrepeso";
            System.out.println(message);
            return overweight;
        }
        message = "Peso ideal";
        System.out.println(message);
        return normalWeight;
    }

    /**
     * Método para determinar la mayoría de edad
     *
     * @return
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public Boolean isOfLegalAge() {
        return this.age >= 18;
    }

    /**
     * Método para comprobar el sexo
     *
     * @param sex
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public void checkSex(char sex) {
        if (sex != 'F' || sex != 'f') {
            this.setSex('H');
        }
    }

    /**
     * Se sobreesscribe el metodo toString para mostrar los datos de la manera deseada
     *
     * @return
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "Datos de la persona: " +
                "nombre = '" + name + '\'' +
                ", edad = " + age +
                ", DNI = '" + DNI + '\'' +
                ", sexo = '" + sex + '\'' +
                ", peso = " + weight +
                ", altura = " + height;
    }

    /**
     * Método para generar el DNI de forma randomica
     *
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public void generateDNI() {
        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        Integer number = (int) (Math.random() * 100000000 + 1);
        Integer remainder;
        remainder = number % 23;
        this.DNI = number.toString() + letters[remainder];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setHeight(Float height) {
        this.height = height;
    }
}
