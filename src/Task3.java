public class Task3 {
    public static void main(String[] args) {
//        Задача 3
//        Является ли массив строго возрастающей последовательностью
//        пример: 30, 31, 31, 39 - не является строго возрастающей
//        последовательностью пример: 30, 31, 32, 39 - является строго
//        возрастающей последовательностью
        int[] arr = new int[10];
        fillArray(arr, 1, 100);
        sortArr(arr);
        printArray(arr);
        boolean res = isIncreasing(arr);
        if (res==true){
            System.out.println("Array is increasing");
        }else System.out.println("Array is NOT increasing");

    }

    public static boolean isIncreasing (int[]arr){

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i]>=arr[i+1]){
                 return false;
            }
        }
        return true;
    }

    public static void sortArr(int[] arr) {

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
