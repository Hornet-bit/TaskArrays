package by.epamtc.task3.main;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] cipher = new int[10];

        int firstIndex = 3;
        int secondIndex = 8;

        cipher[firstIndex] = 4;
        cipher[secondIndex] = 3;

        System.out.println("Исходный массив\n" + Arrays.toString(cipher));

        basicCheck(firstIndex, secondIndex, cipher);

        substitution(cipher, firstIndex);
        substitution(cipher, secondIndex);

        int searchIndex = unknownValue(cipher);
        bruteForce(cipher, searchIndex);
        substitution(cipher, searchIndex);

        System.out.println(Arrays.toString(cipher));

    }

    public static int unknownValue(int[] array) {

        int index = 0;

        for (int i = 0; i <= 2; i++) {

            if (array[i] == 0) {

                index = i;
                break;
            }
        }
        return index;
    }


    public static void substitution(int[] array, int index) {
        if (index == 0 || index == 3 || index == 6 || index == 9) {

            array[0] = array[index];
            array[3] = array[index];
            array[6] = array[index];
            array[9] = array[index];
        } else if (index == 1 || index == 4 || index == 7) {

            array[1] = array[index];
            array[4] = array[index];
            array[7] = array[index];
        } else if (index == 2 || index == 5 || index == 8) {

            array[2] = array[index];
            array[5] = array[index];
            array[8] = array[index];
        }

    }


    public static void bruteForce(int[] array, int unknownIndex) {

        for (int i = 1; i <= 6; i++) {

            array[unknownIndex] = i;

            if (array[0] + array[1] + array[2] == 10) {
                break;
            }
            if (array[0] + array[1] + array[2] > 10) {
                System.out.println("Начальные данные не позволяют сгенерировать решение");
            }
        }

    }

    public static void basicCheck(int firstIndex, int secondIndex, int[] array) {
        if (secondIndex - firstIndex % 3 == 0 && array[firstIndex] != array[secondIndex]) {
            System.out.println("Начальные данные не позволяют сгенерировать решение");
        }

    }


}
