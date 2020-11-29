public class LeapYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;

        //divisble by 4 but not 1100
        isLeapYear = (year % 4 == 0) && (year % 100 != 0);

        //or divisible by 400
        isLeapYear = isLeapYear || (year % 400 == 0);

        System.out.println(isLeapYear);
    }
}
