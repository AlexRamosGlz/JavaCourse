package Enums;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek weekDay = DaysOfWeek.MONDAY;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();

//            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());
//
//            if(weekDay == DaysOfWeek.FRIDAY) {
//                System.out.println("Its Friday!!");
//            }

            for(Topics topic : Topics.values()) {
                System.out.println(topic.name() + " : " + topic.getPrice());
            }
        }
    }

    public static DaysOfWeek getRandomDay() {
        int randomInteger =  new Random().nextInt(7);

        var allDays = DaysOfWeek.values();

        return allDays[randomInteger];
    }

    public static void switchDayOfWeek(DaysOfWeek weekDay) {
        int weeDayInteger = weekDay.ordinal();

        switch (weekDay) {
            case WEDNESDAY -> System.out.println("Wednesday is Day " + weeDayInteger);
            case FRIDAY -> System.out.println("Friday is Day " + weeDayInteger);
            case THURSDAY -> System.out.println("Thursday is Day " + weeDayInteger);
            case MONDAY -> System.out.println("Monday is Day " + weeDayInteger);
            case SATURDAY -> System.out.println("Saturday is Day " + weeDayInteger);
            case SUNDAY -> System.out.println("Sunday is day " + weeDayInteger);
            case TUESDAY -> System.out.println("Tuesday is day" + weeDayInteger);
        }
    }
}
