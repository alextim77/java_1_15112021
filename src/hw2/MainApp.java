package hw2;

public class MainApp {

    public static void main(String[] args) {


        System.out.println(comparisonSumm(4, 9));
        System.out.println(comparisonSumm(8, 11));
        System.out.println(comparisonSumm(6, 15));

        int d = -6;
        theNumbers(d);


        System.out.println(negativ(6));
        System.out.println(negativ(-5));
        System.out.println(negativ(0));

        System.out.println(leapYear(234));
        System.out.println(leapYear(1278));
        System.out.println(leapYear(12));


        int i = 7;
        printExpression(i);


    }

    public static boolean comparisonSumm(int a, int b) {
        return (a + b > 10 && a + b <= 20);

    }

    public static void theNumbers(int d) {
        if (d >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean negativ(int c) {

        return (c < 0);
    }

    public static boolean leapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    public static void printExpression(int i) {
        for (int f = 0; f < i; f++) {
            System.out.println(" Hello World ");
        }


    }
}

