import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class interview_questions {
    // public String reverse(String str)
    // {
    // int n=str.length();
    // for(int i=0;i<n/2;i++)
    // {
    // char temp=str.charAt(i);
    // str.charAt(i)=str.charAt(n-1-i);
    // str.charAt(n-1-i)=temp;

    // }
    // return str;
    // }

    // Sum of Two Numbers
    // Write a function that takes two numbers and returns their sum.
    // Example: sum(3, 4) → 7
    public int sum(int a, int b) {
        return a + b;
    }

    // 3. Check if a Number is Prime
    // Write a function that checks if a given number is prime.
    // Example: isPrime(11) → true, isPrime(4) → false
    public boolean isprime(int a) {
        if (a == 2) {
            return true;
        }
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 4. Count Vowels in a String
    // Write a function that counts the number of vowels in a given string.
    // Example: countVowels("hello world") → 3

    public int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    // 5. Find the Largest Number in an Array
    // Write a function that takes an array of numbers and returns the largest
    // number.
    // Example: findLargest([1, 5, 3, 9, 2]) → 9

    public int findLargest(int[] arr) {
        int n = arr.length;
        int maxmimum = arr[0];
        for (int i = 1; i < n; i++) {
            maxmimum = Math.max(arr[i], maxmimum);
        }
        return maxmimum;
    }

    // 6. Check Palindrome
    // Write a function that checks if a given string is a palindrome (reads the
    // same
    // forward and backward).
    // Example: isPalindrome("madam") → true, isPalindrome("hello") → false
    public boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            // abcba
            // 0 n-1
            // 1 n-2
            // .
            // .
            // 0,1,2,3,....n-3,n-2,n-1

            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                continue;
            } else {
                return false;
            }

        }
        return true;
    }

    // 1. FizzBuzz
    // Write a function that prints numbers from 1 to 100. But for multiples of
    // three print
    // "Fizz" instead of the number, and for the multiples of five print "Buzz." For
    // numbers
    // which are multiples of both three and five print "FizzBuzz."
    public void FizzBuzz() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzBuzz");
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    // 2. Find Missing Number
    // Given an array of numbers from 1 to n with one missing number, find the
    // missing
    // number.
    // Example: findMissing([1, 2, 4, 5, 6]) → 3

    public int findMissing(int[] arr) {
        // 2 3 1 5

        // 1 2 3 5
        // 0 ,1,2,3

        //
        int n = arr.length;
        int Sum = 0;
        for (int i = 0; i < n; i++) {
            Sum += arr[i];
        }

        return (((n + 1) * (n)) / 2) - Sum;
        // arr have element from 1 to n+1, with one number missing.
        // 1 2 3 4 ... n+1
        // sorted

        // Arrays.sort(arr);

        // for(int i=0;i< arr.length;i++)
        // {
        // if(arr[i]==i+1)
        // {
        // continue;
        // }
        // else
        // {
        // return i+1;
        // }

        // }

    }

    // 4. Remove Duplicates from an Array
    // Write a function that removes duplicate values from an array.
    // Example: removeDuplicates([1, 2, 2, 3, 4, 4, 5]) → [1, 2, 3, 4, 5]

    // key(element in given array) ,

    public int[] ArrayWithoutDuplicates(int[] arr) {
        // time complexcity : O(N);
        // space complexcity : O(N);

        HashMap<Integer, Boolean> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) == false) {
                map.put(arr[i], true);
                count++;
            }
        }
        // [1, 2, 2, 3, 4, 4, 5]
        // 1 -->true --> false
        // 2 -- true --> false
        // 3--> true
        // 4--> true
        // 5--> true
        int[] ans = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i])) {
                ans[j] = arr[i];
                j++;
                map.put(arr[i], false);
            }
        }

        return ans;
    }

    // 5. Find the Second Largest Number
    // Write a function that finds the second largest number in an array.
    // Example: secondLargest([1, 3, 4, 2, 5,5]) → 5

    public static int secondLargest(int[] arr) {

        int index = -1;
        int maximimum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maximimum < arr[i]) {
                maximimum = arr[i];
                index = i;
            }
        }
        // index=4, maximum=5;

        int Secondmaximimum = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (Secondmaximimum < arr[i] && i != index) {
                Secondmaximimum = arr[i];
            }
        }
        return 0;

    }

    // 6. Sum of All Numbers in an Array
    // Write a function that calculates the sum of all numbers in an array.
    // Example: sumArray([1, 2, 8, 7, 5]) → 25

    // 3. Merge Two Sorted Arrays
    // Write a function that takes two sorted arrays and merges them into a single
    // sorted
    // array.
    // Example: mergeArrays([1, 3, 5], [2, 4, 6]) → [1, 2, 3, 4, 5, 6]

    public int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] MergedArray = new int[arr1.length + arr2.length];

        // O(N + M) : space complexcity .

        // [1, 3, 5]
        // [2, 4, 6,7,9,11]

        // 1,2,3,4,5,6

        int i = 0;
        int j = 0;
        int k = 0;
        // O(N+M) ,where N=arr1.length, M= arr2.length.

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                MergedArray[k] = arr1[i];
                k++;
                i++;
            } else {
                MergedArray[k] = arr2[j];
                k++;
                j++;
            }

        }
        while (i < arr1.length) {
            MergedArray[k] = arr1[i];
            k++;
            i++;

        }
        while (j < arr2.length) {
            MergedArray[k] = arr2[j];
            k++;
            j++;
        }

        return MergedArray;
    }

    // 5. Validate a Sudoku Puzzle
    // Write a function that validates a given Sudoku board to check if it is valid
    // according
    // to the Sudoku rules.
    // Example: isValidSudoku(board) → true/false
    public boolean rowCheck(int[][] Puzzle, int I, int J) {
        // j= 0,1,2,3...n;
        // [["5","3",".",".","7",".",".",".","."]
        // ,["6",".",".","1","9","5",".",".","."]
        // ,[".","9","8",".",".",".",".","6","."]
        // ,["8",".",".",".","6",".",".",".","3"]
        // ,["4",".",".","8",".","3","8",".","1"]
        // ,["7",".",".",".","2",".",".",".","6"]
        // ,[".","6",".",".",".",".","2","8","."]
        // ,[".",".",".","4","1","9",".",".","5"]
        // ,[".",".",".",".","8",".",".","7","9"]]

        // (4,3)
        for (int j = 0; j < Puzzle[0].length; j++) {
            if (Puzzle[I][J] == Puzzle[I][j] && J != j) {
                return false;

            }
        }
        return true;

    }

    public boolean columnCheck(int[][] Puzzle, int I, int J) {
        for (int i = 0; i < Puzzle.length; i++) {
            if (Puzzle[I][J] == Puzzle[i][J] && I != i) {
                return false;

            }
        }

        return true;

    }

    public boolean squareCheck(int[][] Puzzle, int I, int J) {
        // I,J
        // puzzle[I][J]
        if (I < 3 && J < 3) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // i,j
                    if (Puzzle[I][J] == Puzzle[i][j] && (I != i && J != j)) {
                        return false;

                    }
                }
            }

        }

        return true;
    }

    public boolean isValidSudoku(int[][] Puzzle) {
        int m = Puzzle.length;
        int n = Puzzle[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Puzzle[i][j] + " ");
                // I, J
                // row check
                rowCheck(Puzzle, i, j);
                // column check
                // square check

            }
            System.out.println();
        }

        return true;
    }

    public static void main(String[] args) {

    }

}
