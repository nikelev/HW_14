public class Task5 {
    public static void main(String[] args) {
        /*
        Задача 5
Дано два массива. Нужно в первом массиве найти индексы всех чисел из второго массива.
Найти индексы всех чисел из второго массива в первом массиве

пример: arr1 = {1, -10, 70, 101} arr2 = {1, 99}

Вывод: Число 1, найдено, индекс 0 Число 99, индекс не найдено
        */

        int[] arr1 = {1, -10, 70, 101};
        int[] arr2 = {1, 99};
        findIndexInArray1(arr1,arr2);



    }
    public static void findIndexInArray1 (int[] arr1, int[]arr2 ){
        for (int i = 0; i < arr2.length; i++) {
            int n = arr2[i];
            boolean res = false;
            for (int j = 0; j < arr1.length; j++) {

                if (arr1[j]==n ){
                    System.out.println("Arr2 number "+n+ "   index in Arr1 "+j);
                    res = true;
                    break;

                }
            }if (res==false ){
                System.out.println("number is not found");
            }

        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }


}
