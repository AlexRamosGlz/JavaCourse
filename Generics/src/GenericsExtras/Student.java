package GenericsExtras;

import java.util.Random;

public class Student {

    private int yearStarted;
    private String course;
    private String name;
    private static String[] firstName = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};
    protected static Random random = new Random();

    public Student() {
        course = courses[random.nextInt(3)];
        int lastNameIndex = random.nextInt(65, 91);
        name = firstName[random.nextInt(5)] + " " + (char) lastNameIndex;
        yearStarted = random.nextInt(2018, 2023);
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }
}
