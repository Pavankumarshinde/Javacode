public class sorting {
    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        // Bubble Sort
        int[] bubbleSorted = array.clone();
        bubbleSort(bubbleSorted);
        System.out.println("Bubble Sort:");
        printArray(bubbleSorted);

        // Selection Sort
        int[] selectionSorted = array.clone();
        selectionSort(selectionSorted);
        System.out.println("Selection Sort:");
        printArray(selectionSorted);

        // Quick Sort
        int[] quickSorted = array.clone();
        quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("Quick Sort:");
        printArray(quickSorted);

        // Insertion Sort
        int[] insertionSorted = array.clone();
    
        System.out.println("Insertion Sort:");
        printArray(insertionSorted);

        // Merge Sort
        int[] mergeSorted = array.clone();
        mergeSort(mergeSorted);
        System.out.println("Merge Sort:");
        printArray(mergeSorted);
    }

    // Bubble Sort
    // 23 46 26 37
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

        }
    }

    // Merge Sort
    public static int[] merge(int [] arr1, int [] arr2)
    {
        int [] Arr= new int [arr1.length+ arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i <arr1.length && j <arr2.length)
        {
            if(arr1[i] <arr2[j])
            {
                
                Arr[k]=arr1[i];
                i++;
            }
            else
            {
                
                Arr[k]=arr2[j];
                j++;
            }

        }
        while(i <arr1.length && j <arr2.length)
        {
            if(arr1[i] <arr2[j])
            {
                
                Arr[k]=arr1[i];
                i++;k++;
            }
            else
            {
                
                Arr[k]=arr2[j];
                j++;k++;
            }

        }
        while(i <arr1.length )
        {
             
                Arr[k]=arr1[i];
                i++;
                k++;
            
           

        }
        while(j <arr2.length )
        {
             
                Arr[k]=arr1[j];
                j++;
                k++;
        }
        return Arr;

    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1); // Recursively sort elements before partition
            quickSort(arr, pi + 1, high); // Recursively sort elements after partition
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Utility function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
