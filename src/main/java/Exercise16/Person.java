package Exercise16;

public class Person {
    private String name = "";
    private Integer age = 0;
    private String DNI;
    private char sex = 'H';
    private Integer weight = 0;
    private Float height = 0F;

    public Person() {
        this.generateDNI();
    }

    public Person(String name, Integer age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.generateDNI();
    }

    public Person(String name, Integer age, String DNI, char sex, Integer weight, Float height) {
        this.name = name;
        this.age = age;
        this.generateDNI();
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    public Integer calculateBMI(){
        Double BMI = this.weight / Math.pow(this.height, 2);
        System.out.println("Tú IMC es " + BMI);
        final Integer underweight = -1;
        final Integer normalWeight = 0;
        final Integer overweight = 1;
        String message;

        if(BMI < 20) {
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

    public Boolean isOfLegalAge(){
        return this.age >= 18;
    }

    public void checkSex(char sex){
        if(sex != 'F' || sex != 'f'){
            this.setSex('H');
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DNI='" + DNI + '\'' +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public  void generateDNI(){
        char [] letters = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Integer number = (int)(Math.random()*100000000+1);
        Integer remainder;
        remainder  = number % 23;
        this.DNI = number.toString()+letters[remainder];
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
