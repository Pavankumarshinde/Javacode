public class MethodOverloading {







    //number of parameters
    // types of parameters
    // order of parameters.

    // function(int a, int b,int c) {};
    // function(int a) {};

    
    //function(double a, double b, double c) {};

    // function(int a, string b, string c);
    
    // function(string a, string b, int c);

    //function(1);
    //function(1,3,45);
    // function(1.2,4.5,6.1);
    // function(1,3,6);
    // function(1,"3","6");
    // function("1","3",6);
    









    // Overloading by changing the number of parameters

    public int sum(int a, int b) {
        System.out.println("Here I am using two parameters");
        return a + b;
    }

    public int sum(int a, int b, int c) {
        System.out.println("Here I am using three parameters");
        return a + b + c;
    }

    public double sum(int a, double b,int c)
    {
        return a+ b + c;
    }

    public double sum(double a, int b, int c)
    {
        System.out.println("here i have one double two ints");
        return a+ b +c;
    }
    public int sum()
    {
        System.out.println("NO parameters");
        return 0;
    }
    // Overloading by changing the type of parameters
    public double sum(double a, double b) {
        return a + b;
    }

    // Overloading by changing the order of parameters
    public void print(String text, int number) {
        System.out.println("String: " + text + ", Number: " + number);
    }

    public void print(int number, String text) {
        System.out.println("Number: " + number + ", String: " + text);
    }
    
    public int factorial(int a)
    {
        int ans=1;
        for(int x=1;x<=a;x++)
        {
            ans=ans *x;

        }
        return ans;

    }
    public int factorial(double a)
     {System.out.println("INvalid input, this is a double , pls give interger");return 0;}
    public int factorial (String a)
     {System.out.println("INvalid input, this is a string , pls give interger");return 0;}



    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading(); // create a object of a class.
        // int answer=mo.sum(3,6);
        // System.out.println(answer);
        // int answer2=mo.sum(3,5,7); 
        // System.out.println(answer2);
        // System.out.println(mo.sum(2,5.5,5));
        // System.out.println(mo.sum(4.5, 2,5));
        System.out.println(mo.factorial(5.5));
        System.out.println(mo.factorial(5));
        System.out.println(mo.factorial("5"));





        // // Example: Changing the number of parameters
        // System.out.println("Sum of 10 and 20: " + mo.sum(10, 20));
        // System.out.println("Sum of 10, 20, and 30: " + mo.sum(10, 20, 30));

        // // // Example: Changing the type of parameters
        // System.out.println("Sum of 10.5 and 20.5: " + mo.sum(10.5, 20.5));

        // // // Example: Changing the order of parameters
        // mo.print("Hello", 100);
        // mo.print(200, "World");


    }
}
