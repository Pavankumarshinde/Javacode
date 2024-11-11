public class operators {
    public static void main(String args[]) {
        // Arithmetic operators
        // int a = 10;
        // int b = 3;
        // System.out.println("a + b = " + (a + b));
        // System.out.println("a - b = " + (a - b));
        // System.out.println("a * b = " + (a * b));
        // System.out.println("a / b = " + (a / b));
        // System.out.println("a % b = " + (a % b));

        // Interger declared
        // int a = 10;
        // int b = 10;// Using unary operators
        // System.out.println("Postincrement : " + (a++));
        // System.out.println("Preincrement : " + (++a));
        // System.out.println("Postdecrement : " + (b--));
        // System.out.println("Predecrement : " + (--b));

        // Assignment operators
        // int f = 7;
        // System.out.println("f += 3: " + (f += 3)); // f = f+ 3
        // System.out.println("f -= 2: " + (f -= 2)); // f= f-2
        // System.out.println("f *= 4: " + (f *= 4));
        // System.out.println("f /= 3: " + (f /= 3));
        // System.out.println("f %= 2: " + (f %= 2)); // f= f%2

        // Comparison operators
        // int a = 10;
        // int b = 3;
        // int c = 5;
        // System.out.println("a > b: " + (a > b));
        // System.out.println("a < b: " + (a < b));
        // System.out.println("a >= b: " + (a >= b));
        // System.out.println("a <= b: " + (a <= b));
        // System.out.println("a == c: " + (a == c));
        // System.out.println("a != c: " + (a != c));

        // // Logical operators
        // boolean x = true;
        // boolean y = false;
        // System.out.println("x && y: " + (x && y));
        // System.out.println("x || y: " + (x || y));
        // System.out.println("!x: " + (!x));

        int a = 20, b = 10, c = 30;
        // result holds max of three
        // numbers

        int x = (true) ? 2 : 3;
        int temp = (b > c) ? b : c;
        int result = (a > temp) ? a : temp;

        // // result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = " + result);

        // Bitwise operators
        int d = 0b1010; // after leftshift 2 --> 101000
        int e = 0b1100; // after right shift by 1 --> 0110
        // int f=1b1100 // 1 00000000000000000000000000000000000000 1100
        // 00000000000000000000000 11001

        System.out.println("d & e: " + (d & e));
        System.out.println("d | e: " + (d | e));
        System.out.println("d ^ e: " + (d ^ e));
        System.out.println("~d: " + (~d));
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 1: " + (e >>> 1));

    }

}
