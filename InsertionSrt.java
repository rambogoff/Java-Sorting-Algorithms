/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasimplee;

/**
 *
 * @author Ramazan
 */
public class InsertionSrt {
    public static void main(String a[]){
        int[] array1 = {10,4,12,56,7,61,18,42};
        int[] array2 = Insertionsort(array1);
        for(int i:array2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
     
    public static int[] Insertionsort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}

