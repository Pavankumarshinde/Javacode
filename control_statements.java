
public class control_statements {
    public static void main(String[] args) {

        // boolean condition = true;
        // if (condition)
        // {
        // statements to execute.
        // }
        // statements ouside the if block.

        // int i = 5;
        // if (i < 10)
        // {
        // System.out.println("inside the if block");

        // }
        // if(i<6)
        // System.err.println("inside the if block");
        // System.out.println("Outside the if block");

        // when we dont use curly brackets.

        // 2. if-else:
        // boolean condition = false;
        // int x=5;
        // if (condition && x <4) {
        // System.err.println("if block");

        // // Executes this block if
        // // condition is true
        // } else {

        // System.err.println("else block");

        // // Executes this block if
        // // condition is false
        // }

        // 3. nested if
        // boolean condition1 = true;
        // boolean condition2 = true;

        // if (condition1 ) {
        // // Executes when condition1 is true
        // if (condition2) {
        // // Executes when condition2 is true
        // }
        // }

        // int i = 10;
        // if (i == 10 || i < 15)
        // {
        // // First if statement
        // if (i < 15)
        // System.out.println("i is smaller than 15");
        // if (i < 12)
        // System.out.println("i is smaller than 12 too");
        // } else {
        // System.out.println("i is greater than 15");
        // }

        // 4. if-else-if ladder
        // int i = 20;
        // if (i == 10)
        // System.out.println("i is 10");
        // else if (i == 15)
        // System.out.println("i is 15");
        // else if (i == 20)
        // System.out.println("i is 20");
        // else
        // System.out.println("i is not present");

        // 5. switch-case:

        // Syntax
        // switch (expression)
        // {
        // case value1:
        // statement1;
        // break;
        // case value2:
        // statement2;
        // break;
        // .
        // .
        // case valueN:
        // statementN;
        // break;
        // default:
        // statementDefault;
        // }

        // int num = 20;
        // switch (num) {
        // case 5:
        // System.out.println("It is 5");
        // System.out.println("This is another statement for case 5");
        // break;
        // case 10:
        // System.out.println("It is 10");
        // System.out.println("This is another statement for case 10");
        // break;
        // case 15:
        // System.out.println("It is 15");
        // System.out.println("This is another statement for case 15");
        // break;
        // case 20:
        // System.out.println("It is 20");
        // System.out.println("This is another statement for case 20");
        // System.out.println("You can add as many statements as you need here");
        // break;
        // default:
        // System.out.println("Not present");
        // }

        // 6. jump: break, continue, return

        // Break: In Java, a break is majorly used for:
        // Terminate a sequence in a switch statement (discussed above).
        // To exit a loop

        // Continue :if you want to skip remaining part of loop

        // Return: The return statement is used to explicitly return from a method. That
        // is,
        // it causes program control to transfer back to the caller of the method.

        // for(variable, condition ; increment or decrement )
        // {

        // }
        // for (int i = 0; i < 5; i++) {
        // // 0,1,2,3,4
        // if (i > 3) {
        // break;
        // }
        // System.out.println("Iteration " + i);

        // }

        // variable
        // while(condition)
        // {

        // }
        // int j = 0;
        // while (j < 5) {

        // //
        // //
        // //
        // if(j>3)
        // {

        // }
        // //
        // //
        // //
        // if(j>2)
        // {break;}
        // System.out.println("Iteration " + j);
        // j++;
        // }

        // continue
        // for (int i = 0; i < 10; i++) {

        // System.out.println("statement1");
        // if (i == 5) {
        // continue;
        // }
        // System.out.println("statement2");

        // }
        // int i=0;
        // while(i <10)
        // {

        // System.out.println("statement1");
        // if (i == 5) {
        // continue;
        // }
        // if(i>7) break;
        // System.out.println("statement1");
        // i++;
        // }

        // return
        // boolean t = true;
        // System.out.println("Before the return.");
        // if (t)
        // return;
        // Compiler will bypass every statement
        // after return
        // System.out.println("This won't execute.");

        // 1) Write a program that prints numbers from 1 to 100, but for multiples of 3
        // print "Fizz" and
        // for multiples of 5 print "Buzz".

        // int j=1;
        // while(j<=100)
        // {
        // if(j%3==0) System.err.println("Fizz");
        // else if(j%5==0) System.err.println("Buzz");
        // else System.err.println(j);
        // j++;
        // }

        // for (int i = 1; i <= 100; i++) {
        //     if (i % 3 == 0) {
        //         System.out.println("Fizz");
        //     } else if (i % 5 == 0) {
        //         System.err.println("Buzz");
        //     } else {
        //         System.out.println(i);
        //     }

        // }



        // 2) Create a simple calculator that takes two numbers and an operator as
        // input(hardcode the
        // value), then performs the operation using if-else statements.





        float num1 = 3f;
        float num2 = 7.5f;
        char operator = '+';
        float result = 0;
        if(operator=='+')
        {
            result=num1 +num2;
        } 
        else if(operator=='*')
        {
            result=num1 * num2;
        }else if(operator=='-')
        {
            result=num1 -num2;
        }else if(operator== '/')
        {
            result=num1 / num2;
        }






        // if (operator == '+') {
        // result = num1 + num2;
        // } else if (operator == '-') {
        // result = num1 - num2;
        // } else if (operator == '*') {
        // result = num1 * num2;
        // } else if (operator == '/') {
        // result = num1 / num2;
        // } else {
        // System.out.println("Invalid operator.");
        // }

        // System.out.println("Result: " + result);

    }
}