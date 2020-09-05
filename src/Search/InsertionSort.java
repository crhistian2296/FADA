package Search;

public class InsertionSort {

    public static void sort (int arr[]){
        //assign n the length of the array
        int n = arr.length;

        for (int j = 1; j < n; j++){
            //save the value to compare
            int key = arr[j];
            int i = j-1;

            while ((i >= 0) && (arr[i] > key)){
                arr[i+1] = arr[i];
                i -=1;
            }
            arr[i+1] = key;
        }
    }

    static void printArray (int arr[]){
        int n = arr.length;

        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
    }

    public static void main (String[] args) {
        //array example
        int arr[] = {57, 11, 5, 9, 11, 7, 2 ,6, 17};

        //creation of the object of Search.InsertionSort
        InsertionSort objectSort = new InsertionSort();
        objectSort.sort(arr);

        //printing the array
        printArray(arr);
    }
}
