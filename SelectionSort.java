/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasimplee;

/**
 *  Her adımda dizideki en küçük sayının nerede olduğu bulur
 * @author Ramazan
 */
public class SelectionSort {
     public static int[] SelectionSrt(int[] array){
         
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index]) 
                    index = j;
      
            int number = array[index];  
            array[index] = array[i];
            array[i] = number;
        }
        return array;
    }
     
    public static void main(String a[]){
         
        int[] arr1 = {21,7,2,56,71,67,88};
        int[] arr2 = SelectionSrt(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}

