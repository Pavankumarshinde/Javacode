package Java;
public class datatypes {
    public static void main(String[] args) {
      


        boolean y ;
        y = false;
        boolean x = false;
        System.out.println("value of y: " + y);





















        // // 2. char
        // // Size: 2 bytes
        // // Range: 0 to 65,535 (represents Unicode characters)
        // // Creating and initializing custom character
        // char a = 'G';
        // System.out.println("char: " + a);
        // // Integer data type is generally
        // // used for numeric values


        // 3. byte
        // Size: 1 byte
        // Range: -128 to 127
        byte b = 4;
        System.out.println("byte: " + b);
        // byte b1 = 7888888955;

        // // this will give error as number is
        // // larger than byte range

        // 5. int
        // Size: 4 bytes
        // Range: -2,147,483,648 to 2,147,483,647
        int i = 89;
        System.out.println("integer: " + i);
        // use byte and short
        // if memory is a constraint

        // // short
        // // Size: 2 bytes
        // // Range: -32,768 to 32,767
        // short s = 56;
        // System.out.println("short: " + s);
        // // short s1 = 87878787878;
        // // this will give error as number is
        // // larger than short range

        // double
        // Size: 8 bytes
        // Range: Approximately ±1.7e-308 to ±1.7e+308 (precision of about 15 decimal
        // digits)
        // by default fraction value
        // is double in java
        double d = 4.355453532;
        System.out.println("double: " + d);

        // float
        // Size: 4 bytes
        // Range: Approximately ±3.4e-38 to ±3.4e+38 (precision of about 7 decimal
        // digits)
        // for float use 'f' as suffix as standard
        float f = 4.7333434f;
        System.out.println("float: " + f);

        // // need to hold big range of numbers then we need
        // // this data type
        // // long
        // // Size: 8 bytes
        // // Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l = 12121;
        System.out.println("long: " + l);

    }

}
