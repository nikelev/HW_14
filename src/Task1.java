import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
//        Задача 1
//        Определить закономерность, согласно которой формируется та
//        или иная числовая последовательность. Написать методы,
//        которые формируют первые N элементов данной последовательности
//        в виде целочисленного массива и выводит элементы массива на экран.
//
//        Дано:
//
//        последовательность 1:      2, 4, 6, 8, 10, 12, 14, 16, 18, 20
//        последовательность 2:      0, 0, 2, 0, 4, 0, 6, 0, 8, 0
//        последовательность 3:      0, 2, 0, 6, 0, 10, 0, 14, 0, 18

        int arrayLenght = 10;
        int[] array1 = new int[arrayLenght];
        int[] array2 = new int[arrayLenght];
        int[] array3 = new int[arrayLenght];

        sequence1(array1);
        System.out.println(Arrays.toString(array1));

        sequence2(array2);
        System.out.println(Arrays.toString(array2));

        sequence3(array2);
        System.out.println(Arrays.toString(array2));


    }

    //последовательность 3:      0, 2, 0, 6, 0, 10, 0, 14, 0, 18
    public static void sequence3(int[] array) {

        for (int i = 2; i < array.length; i++) {
            array[1] = 2;
            if (i % 2 != 0) {
                array[i] = array[i - 2] + 4;
            } else array[i] = 0;
        }
    }

    //        последовательность 2:      0, 0, 2, 0, 4, 0, 6, 0, 8, 0
    public static void sequence2(int[] array) {

        for (int i = 2; i < array.length; i++) {
            array[0] = 0;
            if (i % 2 == 0) {
                array[i] = array[i - 2] + 2;
            } else array[i] = 0;
        }
    }

    public static void sequence1(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            array[0] = 2;
            array[i + 1] = array[i] + 2;

        }
    }


}
