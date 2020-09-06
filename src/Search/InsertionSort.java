package Search;

public class InsertionSort {

    void sort (int arr[]){
        //assign n the length of the array
        int n = arr.length;

        for (int j = 1; j < n; j++){
            //save the value to compare
            int key = arr[j];
            //definition of the iterator wich will be compared
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

        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
    }

    public static void main (String[] args) {
        //array example
        int arr[] = {57, 11, 5, 9, 11, 7, 2 ,6, 17};

        //creation of the new object of InsertionSort class
        InsertionSort objectSort = new InsertionSort();

        System.out.println("\nGiven array :");
        printArray(arr);

        System.out.println("Array sorted:");
        //insert-sort the array example
        objectSort.sort(arr);

        printArray(arr);
    }
}
