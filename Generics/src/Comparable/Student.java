package Comparable;

import java.util.Random;

class Student implements Comparable<Student> {

    private static int LAST_ID = 100;
    private static Random random = new Random();
    private int id;
    protected double gpa;

    String name;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}
