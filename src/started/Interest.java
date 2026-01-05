package started;
public class Interest {
    public static void main(String[] args) {

        double amount = 1400000.0d;
        double rate = 10.75d;
        int years = 5;

        double[] resultInterest = produceInterestHistory(amount, rate, years);
        double totalInterest = 0.0d;

        System.out.println("--------------------------Interest------------------------------");
        for (double interest : resultInterest) {
            totalInterest += interest;
            System.out.println(interest);
        }
        System.out.println(totalInterest);
        System.out.println("----------------------------------------------------------------");


        double[] resultInterestOnPer = produceInterestHistoryOnPerYear(amount, rate, years);
        double totalInterestFor5Years = 0.0d;
        System.out.println("--------------------------Interest on Per Year------------------------------");
        for (double interestPerYear : resultInterestOnPer) {
            totalInterestFor5Years += interestPerYear;
            System.out.println(totalInterestFor5Years);
        }
        System.out.println(totalInterestFor5Years);
        System.out.println("----------------------------------------------------------------");

        double[] resultInterestOnPerMonth = produceInterestHistoryOnPerMonth(amount, rate, years);
        double totalInterestFor60Months = 0.0d;
        System.out.println("--------------------------Interest on Per Month------------------------------");
        for (double interestPerMonth : resultInterestOnPerMonth) {
            totalInterestFor60Months += interestPerMonth;
            System.out.println(interestPerMonth);
        }
        System.out.println(totalInterestFor60Months);
        System.out.println("----------------------------------------------------------------");

        System.out.println("before the show sum method call");
        showSum(7.5f, 1.4f, 3);
        System.out.println("after the show sum method call");
        System.out.println("back from show sum method call");
    }

    public static double calculateInterest(double amt, double rate, int years) {
        return amt * rate * years;
    }

    public static double[] produceInterestHistory(double amt, double rate, int years) {
        double[] accumulatedInterest = new double[years];

        for (int yearIndex = 0; yearIndex < years; yearIndex++) {
            int year = yearIndex + 1;
            accumulatedInterest[yearIndex] = calculateInterest(amt, rate, year);
        }
        return accumulatedInterest;
    }

    public static double[] produceInterestHistoryOnPerYear(double amt, double rate, int years) {
        double[] accumulatedInterestOnPerYear = new double[years];

        for (int yearIndex = 0; yearIndex < years; yearIndex++) {
            int year = yearIndex + 1;
            accumulatedInterestOnPerYear[yearIndex] = calculateInterest(amt, rate, year);
        }
        return accumulatedInterestOnPerYear;
    }

    public static double[] produceInterestHistoryOnPerMonth(double amt, double rate, int years) {
        int months = 12 * years;
        double[] accumulatedInterestOnPerMonth = new double[months];

        for (int monthIndex = 0; monthIndex < months; monthIndex++) {
            int month = monthIndex + 1;
            accumulatedInterestOnPerMonth[monthIndex] = calculateInterest(amt, rate, month);
        }
        return accumulatedInterestOnPerMonth;
    }

    public static void showSum(float x, float y, int count) {
        float sum = x + y;
        System.out.println("inside the show sum method");
        if (count < 1) {
            System.out.println("show sum method exited because count value is less than 1 and which is " + count);
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(sum);
        }
        System.out.println("still in the show sum method");
        return;
    }
}


