/*
   For explanation : https://www.youtube.com/watch?v=JU767SDMDvA
   Time Complexity : O(n^2)
*/

public class InsertionSort {
    static void insertionSort(int[] arr, int n){
        if(n == 1)
            return;
        for(int i = 1;i < n;i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 7, 3, 10, 8, 12, 4};

        insertionSort(arr, arr.length);

        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
