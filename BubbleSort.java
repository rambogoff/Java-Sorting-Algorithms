package javasimplee;

/*Ardışık duran iki hafıza bloğunun birbirine nispetle sıralanması 
* ve bu işlemin sürekli tekrarlanması sayesinde sıralar.
 */
public class BubbleSort {
    public static void buble_sort(int array[]){
        int n = array.length;
        
        for (int m = n; m >= 0; m--){    // n=m=6
            for(int i = 0; i < n - 1; i++){
                int k = i + 1;
                if (array[i] > array [k]){
                    swapnum(i, k, array);
                }
            }
            printnum(array);
        }
    }

    private static void swapnum(int i, int j, int[] array) {
        int temp;
        temp = array [i];
        array[i] = array [j];
        array [j] = temp;
    }

    private static void printnum(int[] input) {
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args){
        int [] input = {2, 12, 13, 32, 7, 30};
        buble_sort(input);
    }
    
}
/* OUTPUT

2, 12, 13, 7, 30, 32, 

2, 12, 7, 13, 30, 32, 

2, 7, 12, 13, 30, 32, 

2, 7, 12, 13, 30, 32, 

2, 7, 12, 13, 30, 32, 

2, 7, 12, 13, 30, 32, 

2, 7, 12, 13, 30, 32, 

*/