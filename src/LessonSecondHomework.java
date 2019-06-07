import java.util.Arrays;

/**
 * Java. Уровень 1. Урок 2
 *
 * @author Oksana Nezlobina
 * @version 02.06.2019
 */
public class LessonSecondHomework {

    public static void main(String[] args) {

        // Вызов метода 1 задания
        System.out.println(Arrays.toString(replacementCycle()));

        // Вызов метода 2 задания
        System.out.println(Arrays.toString(fillingArray()));

        // Вызов метода 3 задания
        System.out.println(Arrays.toString(modifiedArray()));

        // Вызов метода 4 задания
        System.out.println(Arrays.deepToString(multiArray()));

    }

    /**
     * Метод, который в массиве заменяет 0 на 1 и 1 на 0
     * @return массив с измененными значениями
     */
    public static int[] replacementCycle() {
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i]==0) ? (arr[i]=1) : (arr[i]=0);
        }
        return arr;
    }

    /**
     * Метод, который заполняет массив
     * @return заполненный массив
     */
    public static int[] fillingArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i ++) {
            arr[i]= i * 3;
        }
        return arr;
    }

    /**
     * Метод, который в массиве все числа меньше 6 умножает на 2
     * @return преобразованный массив
     */
    public static int[] modifiedArray() {
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i =0; i < arr.length; i ++) {
            if(arr[i] < 6) {
                arr[i] = arr[i]*2;
            }
        }
        return arr;
    }

    /**
     * Метод, который в двумерном массиве по диагонали выставляет 1
     * @return двумерный массив с 1 по диагонали
     */
    public static int[][] multiArray() {
        int[][] arr = new int[3][3];
        for(int i = 0; i < arr.length; i++) {
            arr[i][i]=1;
        }
        return arr;
    }
}
