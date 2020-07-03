package by.epamtc.task3.main;

public class Task5 {
    public static void main(String[] args) {

        int[] array = {1, 8, 3, 8, 9, 3, 9, 9};
        int sum = minimalPerOdd(array) + maxPerEven(array);

        System.out.println(sum);

    }

    public static int minimalPerOdd(int[] array) {

        int minimalValue = array[1];

        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {

                if (minimalValue > array[i]) {

                    minimalValue = array[i];
                }

            }
        }
        return minimalValue;
    }

    public static int maxPerEven(int[] array) {

        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 1) {

                if (maxValue < array[i]) {

                    maxValue = array[i];
                }

            }
        }
        return maxValue;

    }
}
