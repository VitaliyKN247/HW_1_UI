package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n = 100;
//        double [] array = new double[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Math.random();
//            System.out.println(array[i]);
//        }
//        double max_array = array[0];
//        double min_array = array[0];
//
//        for (int i = 1; i < (array.length + 1); i++){
//            if(max_array < array[i - 1]){
//                max_array = array[i - 1];
//            }
//            if (min_array > array[i - 1]) {
//                min_array = array[i - 1];
//            }
//        }
//        System.out.println();
//        System.out.println("Max count " + max_array);
//        System.out.println();
//        System.out.println("Min count " + min_array);

        // Реализуйте алгоритм сортировки пузырьком для сортировки массива
        double[] bubble_arr = new double[n];
        for (int i = 0; i < bubble_arr.length; i++) {
            bubble_arr[i] = Math.random();
        }

        for (int i = 1; i < bubble_arr.length + 1; i++) {
            if (bubble_arr[i] < bubble_arr[i - 1]) {
                bubble_arr[i] = bubble_arr[i - 1];
            }
        }

        for (int i = 0; i < bubble_arr.length; i++) {
            bubble_arr[i] = Math.random();
        }
    }
}