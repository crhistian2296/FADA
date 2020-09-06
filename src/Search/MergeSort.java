package Search;

public class MergeSort {
    void merge (int arr[], int start, int mid, int end) {
        //finding the size of the two sub-arrays
        int n1 = mid - start +1;
        int n2 = end - mid;

        //create the temporal arrays
        int L[] = new int[n1], R[] = new int[n2];

        //copy data to the temporal arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[start +i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        /* ==> now merge the temporal arrays <== */

        //initial indexes of first and second sub-arrays
        int a =0, b = 0;

        //initial index of merged sub-array
        int k = start;

        //merge after sort the array
        while ((a < n1) && (b < n2)){
            if (L[a] <= R[b]){
                arr[k] = L[a];
                a++;
            } else {
                arr[k] = R[b];
                b++;
            }
            k++;
        }

        //copy the remaining elements of L[] if there are any left
        while (a < n1){
            arr[k] = L[a];
            k++;
            a++;
        }

        //copy the remaining elements of R[] if there are any left
        while (b < n2){
            arr[k] = R[b];
            k++;
            b++;
        }
    }

    //recursively calls itself to divide the array till size becomes one
    void sort (int arr[], int start, int end){
        if (start < end){
            //find the mid
            int mid = (end + start) / 2;

            //recursion
            sort(arr, start, mid);
            sort(arr, mid + 1,end);

            merge(arr, start, mid, end);
        }
    }

    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
    }

    public static void main(String[] args){
        //array example
        int arr[] = {57, 11, 5, 9, 11, 7, 2 ,6, 17};

        //creation of the new object of MergeSort class
        MergeSort objectSort = new MergeSort();

        System.out.println("Given array:");
        printArray(arr);

        System.out.println("Array sorted:");
        //merge-sort the array example
        objectSort.sort(arr, 0, arr.length-1);
        printArray(arr);

        System.out.println();

    }
}
