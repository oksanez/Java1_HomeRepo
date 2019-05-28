/**
 * Класс, содержащий домашнее задание к первой лекции по курсу Java1
 *
 * Незлобина Оксана
 * 29.05.2019
 */
public class LessonOneHomework {

    public static void main(String[] args) {

        // 2 задание
        byte by = -11;
        short sh = 32000;
        int i = 1;
        long l = 100L;
        float fl = 34.99f;
        double dbl = 56.789;
        char ch = '\u039A';
        boolean bl = true;
        String str = "Only text";


        // 3 задание
        int a = 2;
        int b = 5;
        int c = 6;
        int d = 3;

        int result = getExpressionResult(a, b, c, d);
        System.out.println("Результат: " + result);

        // 4 задание
        boolean res = checkSum(a, b);
        System.out.println("Резьтат проверки, что сумма чисел (" + a + ", " + b + ") лежит в пределах от 10 до 20 (включительно): " + res);

        // 5 задание
        checkNumber(c);

        // 6 задание
        checkNegativeNumber(d);

        // 7 задание
        printName("Oksana");


        // 8 задание
        leapYear(2000);
    }

    // Вычисляет результат выражения
    static int getExpressionResult(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    // Проверяет, что сумма чисел находится в указанных пределах
    static boolean checkSum(int a, int b) {
        int sum = a + b;
        if ((10 <= sum) && (sum <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    // Проверяет число на положительность
    static void checkNumber(int a) {
        if (0 <= a) {
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }

    }

    // Проверяет число на отрицательность
    static boolean checkNegativeNumber(int a) {
        boolean result = false;

        if (a < 0) {
            result = true;
            System.out.println("Число " + a + " отрицательное! result = " + result);
        } else {
            System.out.println("Число " + a + " положительное!");
        }
        return result;
    }

    // Выводит указанное слово в строке
    static void printName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // Проверяет, является ли год високосным:
    static void leapYear(int year) {
        if (year%4 == 0 && year%100 != 0  ||  year%400 == 0) {
            System.out.printf("Год " + year + " високосный!");
        } else {
            System.out.printf("Год " + year + " НЕ високосный!");
        }
    }
}