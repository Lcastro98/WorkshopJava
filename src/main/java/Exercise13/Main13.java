package Exercise13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main13 {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha y hora actual es: " + dateTimeFormatter.format(LocalDateTime.now()));
    }
}
