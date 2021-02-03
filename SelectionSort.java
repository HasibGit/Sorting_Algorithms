/*
   For explanation : https://www.youtube.com/watch?v=g-PGLbMth_g
   Time Complexity : O(n^2)
*/


public class SelectionSort {
    static void selectionSort(int[] arr, int n){
        int unsortedIndex = 0;

        while (unsortedIndex < n-1){
            int min = arr[unsortedIndex];
            int curr = unsortedIndex;
            int minIndex = unsortedIndex;

            while (curr < n){
                if(arr[curr] < min){
                    min = arr[curr];
                    minIndex = curr;
                }
                curr++;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[unsortedIndex];
            arr[unsortedIndex] = temp;
            unsortedIndex++;
        }
    }


    public static void main(String[] args) {
       int[] arr = {2, 1, 5, 7, 3, 10, 8, 12, 4};

       selectionSort(arr, arr.length);

       for(int i : arr)
           System.out.print(i + " ");
        System.out.println();
    }
}
