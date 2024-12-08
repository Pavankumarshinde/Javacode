public class Time_and_Space_Complexcity {
    public static void main(String[] args) {
        
        // O(1) - Constant Time 
        // O(N) - Linear time 
        // O(Log N) -logarithmic time
        // O(N^2) - Quadratic time
        // O(2^N) - Exponential Time

        int[] arr= {1,2,3,4,5};

        System.out.println(getFirstElement(arr));
        System.out.println(sumArray(arr));
        printPairs(arr);
        System.out.println(binarySearch(arr, 3));
        System.out.println(findMax(arr));
        int [] reverseArray=reverseArray(arr);
        for(int num : reverseArray)
        {
            System.out.print(num + " ");
        }
    }
    
    // O(1) - Constant Time
    public static int getFirstElement(int[] arr) {
      
        return arr[0]; // Accessing the first element is constant time.
    }

    // O(N) - Linear Time
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) { // Traversing the entire array.
            sum += num;
        }
        
        
        return sum;
    }


    //O(N²) - Quadratic Time
    public static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) { // Nested loop causes O(N²)
                System.out.print("(" + arr[i] + " " + arr[j] + ")");
            }
            System.out.println();
       }
    }

    // O(log N) - Logarithmic Time
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1; // Target not found
    }

    // O(1) - Constant Space
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE; // Uses only one variable.
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // O(N) - Linear Space
    public static int[] reverseArray(int[] arr) {
        //1 2 3 4
        // 4 3 2 1

        // O(N/2) ---> O(N)
        
        for (int i = 0; i <= arr.length/2; i++) {
            int temp= arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i]=temp;
        }
        return arr;
    }
}
