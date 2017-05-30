import java.util.Scanner;

/**
 * Java calendar. It asks for the month and the year and
 * it displays the calendar of the whole month back to the user
 */

public class Calendar {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int numDaysMonth(int month, int year)
    {
        int days = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear(year))
                    days = 29;
                else
                    days = 28;
                break;
        }
        return days;
    }

    public static int computeOffset(int month, int year) {
        int numDaysYear = 0;
        int monthCounter = 0;
        int months = 1;  // starts at 1 to return the days for January

        // This loop counts how many days have passed in the full years up to the given year
        for (int iYear = 1753; iYear < year; iYear++) {
            numDaysYear = numDaysYear + 365;

            if (isLeapYear(iYear))
                numDaysYear++;
        }

        // This loop counts the days in the remaining months after all the years
        for (int iMonth = 1; iMonth < month; iMonth++) {
            monthCounter = monthCounter + numDaysMonth(months, year);  //MONTHS not month
            months++;
        }

        return (numDaysYear + monthCounter) % 7;
    }

    public static void displayCalendar(int month, int year) {
        //System.out.print("Enter a month you would like to display:");
        //Scanner input = new Scanner(System.in);
        //int days = input.nextInt();
        System.out.println("        " + getMonthString(month) + " " + year);
        System.out.println  ("__________________________________");
        System.out.println("Mon  Tue  Wed  Thu  Fri  Sat  Sun");
        for (int i = 1; i <= computeOffset(month, year); i++)
            System.out.print("     ");
        for (int i = 1; i <= numDaysMonth(month, year); i++) {
            if(i >= 1 && i < 10)
                System.out.print("  " + i + "  ");
            else
                System.out.print(" " + i + "  ");
            if ((i + computeOffset(month, year)) % 7 == 0)
                System.out.println();
        }
    }

    public static String getMonthString(int month) {
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
        }
        return monthString;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month:");
        int month = input.nextInt();

        System.out.print("Enter a year:");
        int year = input.nextInt();

        input.close();
        System.out.println();
        displayCalendar(month, year);
    }
}
