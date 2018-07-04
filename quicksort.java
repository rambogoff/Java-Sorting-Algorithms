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
public class quicksort {
    int partition(int array[], int low, int high)
    {
        int pivot = array[high]; 
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
            if (array[j] <= pivot)
            {
                i++; 
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
 
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
 
        return i+1;
    }
 
    void sort(int array[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(array, low, high);
 
            sort(array, low, pi-1);
            sort(array, pi+1, high);
        }
    }
 
    static void printArray(int array[])
    {
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }
    
    public static void main(String args[])
    {
        int array[] = {10, 7, 8, 9, 1, 5, 3, 2};
        int n = array.length;
 
        quicksort qsort = new quicksort();
        qsort.sort(array, 0, n-1);
 
        System.out.println("Sorted array :");
        printArray(array);
    }
}

/* 1 2 3 5 7 8 9 10 */