package Classes.Inheritance.Challenge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate currentDate = java.time.LocalDate.now();
        int currentYear = Integer.parseInt(currentDate.toString().substring(0, 4));

        int birthYear = Integer.parseInt(this.birthDate.substring(6));
        return currentYear - birthYear;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }
}
