package hus.oop.lab05.mytime;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Time: " + time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());

        System.out.println("Next second: " + time.nextSecond());
        System.out.println("Next minute: " + time.nextMinute());
        System.out.println("Next hour: " + time.nextHour());

        System.out.println("Previous hour: " + time.previousHour());
        System.out.println("Previous minute: " + time.previousMinute());
        System.out.println("Previous hour: " + time.previousSecond());
    }
}
