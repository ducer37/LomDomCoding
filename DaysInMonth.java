import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = -1, year;
        while (month == -1) {
            System.out.print("Enter a month ");
            String inputMonth = sc.next().trim();
            month = getMonthNumber(inputMonth);
            if (month == -1) {
                System.out.println("Invalid month. Please enter again.");
            }
        }
        while (true) {
            System.out.print("Enter a year ");
            if (sc.hasNextInt()) {
                year = sc.nextInt();
                if (year >= 0) break;
            } else {
                sc.next();
            }
            System.out.println("Invalid year. Please enter again.");
        }
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = getDaysInMonth(month, isLeapYear);
        System.out.println("Year " + year + ", Month " + month + " has " + days + " days.");
        sc.close();
    }

    public static int getMonthNumber(String month) {
        month = month.toLowerCase();
        switch (month) {
            case "january": case "jan.": case "jan": case "1": return 1;
            case "february": case "feb.": case "feb": case "2": return 2;
            case "march": case "mar.": case "mar": case "3": return 3;
            case "april": case "apr.": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun.": case "jun": case "6": return 6;
            case "july": case "jul.": case "jul": case "7": return 7;
            case "august": case "aug.": case "aug": case "8": return 8;
            case "september": case "sept.": case "sep": case "9": return 9;
            case "october": case "oct.": case "oct": case "10": return 10;
            case "november": case "nov.": case "nov": case "11": return 11;
            case "december": case "dec.": case "dec": case "12": return 12;
            default: return -1;
        }
    }

    public static int getDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear ? 29 : 28;
            default:
                return -1; 
        }
    }
}
