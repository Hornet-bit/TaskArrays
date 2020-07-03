package by.epamtc.task3.main;

public class Task1 {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        int maxSum = array[0] + array[1];
        int mass[] = new int[2];

        for (int i = 1; i < array.length - 1; i++) {

            int interimSum = array[i] + array[i + 1];

            if (maxSum < interimSum) {
                maxSum = interimSum;

                mass[0] = i + 1;
                mass[1] = i + 2;

            }
        }

        System.out.println("Макс. сумма = " + maxSum);
        System.out.println("Их индексы = " + mass[0] + " " + mass[1]);


    }
}
