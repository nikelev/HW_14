public class Task5 {
    public static void main(String[] args) {
        /*
        Задача 5
Дано два массива. Нужно в первом массиве найти индексы всех чисел из второго массива.
Найти индексы всех чисел из второго массива в первом массиве

пример: arr1 = {1, -10, 70, 101} arr2 = {1, 99}

Вывод: Число 1, найдено, индекс 0 Число 99, индекс не найдено
        */
        int lenght1 = 10;
        int lenght2 = 10;
        int[] arr1 = new int[lenght1];
        int[] arr2 = new int[lenght2];
        printArray(arr1);
        printArray(arr2);


    }
    public static void findIndexInArray1 (int[] arr1, int[]arr2, int lenght ){
        for (int i = 0; i < lenght; i++) {

        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void fillArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }
}
