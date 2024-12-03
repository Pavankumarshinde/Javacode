




// [Initial array: 8, 3, 1, 7, 0, 10, 2] // O(log(N)) * O(N)--> O(N(log(N)) >> O(N^2)
                                         // O(N), auxilary space complixity : O(N).
// [Divide Phase:]

// [8, 3, 1, 7] [0, 10, 2]

// [8, 3] [1, 7] [0, 10] [2]

// [8] [3] [1] [7] [0] [10] [2]

// [Merge Phase:]

// [3, 8] [1, 7] [0, 10] [2]

// [1, 3, 7, 8] [0, 2, 10]
// [0, 1, 2, 3, 7, 8, 10]








// [1, 3, 7, 8] [0, 2, 10]

// ans ={0,1,2,3,7,8,10}



class MergeSort {
    // Merge two sorted arrays into one sorted array
    public static int[] Merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        // time complexity :O(n +m)--> O(N). 
        // space complexity : O(N).

        // Merge the arrays while both have elements left
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }

        // Add remaining elements from arr1
        while (i < arr1.length) {
            ans[k++] = arr1[i++];
        }

        // Add remaining elements from arr2
        while (j < arr2.length) {
            ans[k++] = arr2[j++];
        }

        return ans;
    }

    // Sort an array using Merge sort
    public static int[] sortArray(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
       
        // Split the array into two halves
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Copy elements into left and right subarrays
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        // Recursively sort the left and right halves
        left = sortArray(left); // left = 8, 3, 1, 7;
        right = sortArray(right); // right= 0,2,10;

        // Merge the sorted halves
        return Merge(left, right);
    }




    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        int[] sorted = MergeSort.sortArray(arr);

        // Print the sorted array
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
