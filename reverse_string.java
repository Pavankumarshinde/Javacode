import java.lang.reflect.Array;
import java.util.Arrays;

public class reverse_string {
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

    public static void main(String[] args) {

    }

}
