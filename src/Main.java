import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Divyu");

        int student = 10;  // variable declaration and initialization
        student = 15;  // don't allocate new memory
        student = 40;  // it's overwrite the new value to the previous value only
//        int student;  // initialization is needed before using it
        System.out.println(student);


        // java is case-sensitive , age and AGE is different
        // variable can start with a-z , _, $
        // can't start with numbers, 1-0
        // can't use whitespace.

        // literals

        // ex.
        int a = 1;
        float b = 4.5f;
        char c = 'f';
        // 1, 4.5 , f are literals.

        // boolean literals - used to assign boolean data type
        // can store 2 vales true and false

        boolean flag1 = false;
        boolean flag2 = true;

        // 2. Integer literals = associate with numbers
        // numeric values without any fractional / exponential part
        // Integer literal 4 types

        // decimal (base 10)
        int decimalNum = 34;

        // octal(8)
        int octalNum = 23;

        //hexadecimal(16)
        int hexNum = 0x2F; // 0x represents hexadecimal

        // binary (base 2)
        int binaryNum = 0b10010; // 0b represents binary

        // Java, binary starts with 0b & hexa (0x)


        // 3. Floating-point literals

        double myDouble = 3.4;  // higher precision
        float myFloat = 3.4F;

        // 3.445*10^2
        double myDoubleScientific = 3.445e2;

        System.out.println(myDouble); //3.4
        System.out.println(myFloat);  // 3.4
        System.out.println(myDoubleScientific); // 344.5

        //4. Character Literals
        // unicode character enclosed inside single quotes
        char letter = 'a';

        // *** we can use escape sequences as character literals
        // \b backspace
        // \t tab
        // \n new line
        //used for formatting

        //5. string literals
        // sequence of characters enclosed inside double-quotes.
        //ex.
        String str1 = "Java Programming";
        String str2 = "Vinu";

        // this are two String literals






    }
}