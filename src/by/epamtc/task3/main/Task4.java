package by.epamtc.task3.main;

public class Task4 {

    public static void main(String[] args) {

        int[] mas = {3, 3, 3, 8, 9, 7, 9, 9};
        int[] frequency = new int[mas.length];

        for (int i = 0; i < mas.length; i++) {

            for (int j = 0; j < mas.length; j++) {


                if (mas[i] == mas[j]) {
                    frequency[i]++;
                }

            }
        }

        int freqResult = frequency[0];
        int valResult = mas[0];

        for (int i = 0; i < frequency.length; i++) {

            if (frequency[i] > freqResult) {

                freqResult = frequency[i];
                valResult = mas[i];
            }

            if (frequency[i] == freqResult && mas[i] < valResult) {

                valResult = mas[i];
            }
        }

        System.out.println(valResult);
    }

}
