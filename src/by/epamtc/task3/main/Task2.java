package by.epamtc.task3.main;

public class Task2 {
    public static void main(String[] args) {

        int[] array = {9, 8, 3, 8, 9, 3, 9, 9};

        int minimalValue = array[0];
        int repeatMin=0;

        for (int i = 0; i < array.length; i++){

            if(array[i] == minimalValue){
                repeatMin++;
            }

            if(array[i]<minimalValue){

                minimalValue = array[i];
                repeatMin = 1;

            }


        }

        int [] modifedArray= new int[array.length - repeatMin];

        for (int i = 0, k = 0; i < array.length; i++){

            if(array[i]!= minimalValue){
                modifedArray[k] = array[i];
                k++;
            }
        }

        for (int i = 0; i < modifedArray.length; i++){

            System.out.println(modifedArray[i]);
        }




    }
}
