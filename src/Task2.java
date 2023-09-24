public class Task2 {
    public static void main(String[] args) {
//        Задача 2
//        Найти элемент N в массиве из сгенерированных чисел и заменить его на
//        минимальный элемент в массиве. Если n не найден в массиве вывести сообщение,
//        что элемент не найден!
//
//           пример: дано: {10,4,2,3, 1}, n = 2;. Результат: {10,4,1,3, 1}

        int[] arr = new int[20];
        fillArray(arr, 1, 9);
        printArray(arr);


        int elementN = 3;
        int minElement = minElement(arr);
        System.out.println("min element = " + minElement);
        int indexElementN = findIndexN(arr, elementN);

        changeNToMin(arr, indexElementN, minElement);
        printArray(arr);


    }

    public static void changeNToMin(int[] array, int element, int min) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[element]) {
                array[i] = min;
            }
        }
    }

    public static int findIndexN(int[] arr, int N) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == N) {
                index = i;
            }

        }
        return index;
    }

    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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
