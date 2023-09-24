public class Task4 {
    public static void main(String[] args) {
//        Задача 4
//        Дан массив чисел, найдите все четные числа в массиве и запишите
//        эти числа в другой массив. Отсортируйте только **второй ** массив
//        и распечатайте оба массива.
        int lenght = 10;
        int[] arr = new int[lenght];

        fillArray(arr, 1, 100);
        printArray(arr);

        int[] arrNew = getArrNew(arr, lenght);
        printArray(arrNew);

        sortArrNew(arrNew);
        printArray(arrNew);

    }

    public static void sortArrNew(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int t;
                if (arr[j] > arr[j + 1]) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;

                }
            }
        }
    }

    public static int[] getArrNew(int[] arr, int lenghtArr) {
        int[] arrNew = new int[lenghtArr];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arrNew[i] = arr[i];
            }
        }
        return arrNew;
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
