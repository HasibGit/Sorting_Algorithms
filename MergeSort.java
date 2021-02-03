public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        sort(arr,0,arr.length-1);
         for(int i : arr){
             System.out.print(i + " ");
         }
        System.out.println();

    }
    static void sort(int[] arr,int left,int right){
        if(left < right){
            int mid = (left + right) / 2;
            sort(arr,left,mid);
            sort(arr,mid + 1,right);
            merge(arr,left,mid,right);
        }
    }
    static void merge(int[] arr,int left,int mid,int right){
        int size1 = mid - left + 1; // left to mid projonto value store
        int size2 = right - mid;    // mid+1 theke right porjonto value store
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for(int i = 0;i < size1;i++){
            arr1[i] = arr[left+i];
        }
        for(int j = 0;j < size2;j++){
            arr2[j] = arr[mid + 1 + j];
        }
        int i = 0,j = 0,k = left;
        while(i < size1 && j < size2){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else if(arr1[i] > arr2[j]){
                System.out.println(arr1[i] + " " + arr2[j]);
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < size1){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < size2){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
