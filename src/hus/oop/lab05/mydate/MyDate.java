//package hus.oop.lab05.mydate;
//
//public class MyDate {
//    private int year, month, day;
//    static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May",
//    "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
//    static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday",
//    "Thursday", "Friday", "Saturday"};
//    static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//    public boolean isLeapYear(int year) {
//        return year % 400 == 0;
//    }
//
//    public boolean isValidDate(int year, int month, int day) {
//        if ((year >= 1) && (year <= 9999)) {
//            if ((month >= 1) && (month <= 12)) {
//                if (isLeapYear(year) && (month == 2)) {
//                    return (day >= 1) && (day <= 29);
//                } else if (!isLeapYear(year) && (month == 2)) {
//                    return (day >= 1) && (day <= 28);
//                } else if ((month == 1) || (month == 3) || (month == 7) || (month == 8) || (month == 12)) {
//                    return (day >= 1) && (day <= 31);
//                } else {
//                    return (day >= 1) && (day <= 30);
//                }
//            } else {
//                return false;
//            }
//        } else {
//            return false;
//        }
//    }
//
//    public MyDate(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//
//    public void setDate(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public int getMonth() {
//        return month;
//    }
//
//    public int getDay() {
//        return day;
//    }
//
//    public void setYear(int year) {
//        if ((year >= 1) && (year <= 9999)) {
//            this.year = year;
//        } else {
//            throw new IllegalArgumentException("Invalid year!");
//        }
//    }
//
//    public void setMonth(int month) {
//        if ((month >= 1) && (month <= 12)) {
//            this.month = month;
//        } else {
//            throw new IllegalArgumentException("Invalid month!");
//        }
//    }
//
//    public void setDay(int day) {
//        int dayMax;
//        if ((month == 2) && isLeapYear(year)) {
//            dayMax = 29;
//        } else if ((month == 2) && !isLeapYear(year)) {
//            dayMax = 28;
//        } else if ((month == 1) || (month == 3) || (month == 7)
//                || (month == 8) || (month == 12)) {
//            dayMax = 31;
//        } else {
//            dayMax = 30;
//        }
//
//        if ((day >= 1) && (day <= dayMax)) {
//            this.day = day;
//        } else {
//            throw new IllegalArgumentException("Invalid day!");
//        }
//    }
//
////    public int getDayOfWeek(int year, int month, int day) {
////
////    }
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//
//    }
//}
