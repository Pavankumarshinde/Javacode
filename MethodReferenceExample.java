@FunctionalInterface
interface Calculator {
    int operate(int a, int b); // here we have Calculator as interface class and it have operate as abstract function.
}














public class MethodReferenceExample {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sampleFunction(int a, int b)
    {
        System.out.println("sample function is running");
        return 0;
    }

    public static int factorialOffirst(int a,int b)
    {
        int x=1;
        for(int i=1;i<=a;i++)
        {
            x=x* i;

        }
        return x;
    }





    public static void main(String[] args) {
        Calculator addition = MethodReferenceExample::add;  // here this add function will work as operate function addition object.
        System.out.println("Addition using Method Reference: " + addition.operate(10, 5));

        Calculator factorialOf1= MethodReferenceExample :: factorialOffirst;
        
        System.out.println(factorialOf1.operate(5, 3));

        Calculator Sample= MethodReferenceExample :: sampleFunction;
        System.out.println(Sample.operate(5, 6));


    }
}

