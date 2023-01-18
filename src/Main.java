import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1 () {
        int [] digits = new int [3];
        digits[0] = 1;
        digits[1] = 2;
        digits[2] = 3;
        double [] digits1 = {1.57, 7.654, 9.986};
        byte [] digits2 = {2, 5, 4, 11, 6, 8, 9};
        // вывод в прямой последовательности
        for (int i = 0; i < digits.length; i++ ) {
            System.out.print(digits[i]);
            if (i == digits.length - 1) {
                System.out.println();
                break; }
            System.out.print(", ");
        }
        for (int i = 0; i < digits1.length; i++ ) {
            System.out.print(digits1[i]);
            if (i == digits1.length - 1) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }
        for (int i = 0; i < digits2.length; i++ ) {
            System.out.print(digits2[i]);
            if (i == digits2.length - 1) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }
        // вывод в обратном порядке
        int j = digits.length;
        while (j > 0) {
            j--;
            System.out.print(digits[j]);
            if (j == 0) {
                System.out.println();
                break; }
            System.out.print(", ");
        }
        j = digits1.length;
        while (j > 0) {
            j--;
            System.out.print(digits1[j]);
            if (j == 0) {
                System.out.println();
                break; }
            System.out.print(", ");
        }
        j = digits2.length;
        while (j > 0) {
            j--;
            System.out.print(digits2[j]);
            if (j == 0) {
                System.out.println();
                break; }
            System.out.print(", ");
        }
        // прибавляем к нечётным числам единицу и сразу выводим
        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) {digits[i] = digits[i] +1;}
            System.out.print(digits[i]);
            if (i == digits.length - 1) {
                System.out.println();
                break; }
            System.out.print(", ");
        }
        // второй способ вывода
        System.out.println(Arrays.toString(digits));
    }
}