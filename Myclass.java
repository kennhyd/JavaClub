class Myclass {
public static void main(String args[]) {

   System.out.println("Welcome to java Programming");
}
}



import java.util.*;

public class InputExample {
public static void main(String args[]) {

   scanner scan=new Scanner(System.in);

   System.out.println(*Enter a number: +$1) ; 
   int s1=scan.nextInt();

   System.out.println(*Enter a number: +$2) ; 
   int s2=scan.nextInt();

   int result = s1+s2;

   System.out.println("Result : " +result : " ) ; 

}
}



import java.util.*;

public class InputExample {

    public static void main(String args[]) {

        Scanner scan=new Scanner(System.in);

        System.out.println( "Enter a number: " ) ;  /* +s1, +s2 */
        int s1=scan.nextInt();

        System.out.println( "Enter a 2nd number: " ) ;
        int s2=scan.nextInt();

        int result = s1+s2;

        System.out.println("Result : " +result ) ;

    }
}






/* public static void main (String[] args) {} 

   javac Welcome.java   to compile
   java Welcome.java
   
   :\Users\Ken\Desktop\html\Java Code>dir
 Volume in drive C has no label.
 Volume Serial Number is 4A8A-BCFE

 Directory of c:\Users\Ken\Desktop\html\Java Code

09/13/2024  01:52 PM    <DIR>          .
09/13/2024  01:46 PM    <DIR>          ..
09/13/2024  01:48 PM                67 java_test.java
09/13/2024  01:56 PM               435 Welcome.class
09/13/2024  01:58 PM               124 Welcome.java
               3 File(s)            626 bytes
               2 Dir(s)  538,443,886,592 bytes free

c:\Users\Ken\Desktop\html\Java Code>  */
/*
Data Types
Primitive   							Non Primative
int			integer						String, Array, 	
boolean
float    decimal
long     more 
byte
double   more characters than float
long     more characters than int
short
*/

=========================================================================================================================


JAVA OPERATORS

int x = 100 + 50;

int sum1 = 100 + 50;        // 150 (100 + 50)
int sum2 = sum1 + 250;      // 400 (150 + 250)
int sum3 = sum2 + sum2;     // 800 (400 + 400)


Arithmetic Operators
--------------------

Arithmetic operators are used to perform common mathematical operations.

Operator	Name	Description	Example	Try it
+	Addition	Adds together two values	x + y	
-	Subtraction	Subtracts one value from another	x - y	
*	Multiplication	Multiplies two values	x * y	
/	Division	Divides one value by another	x / y	
%	Modulus	Returns the division remainder	x % y	
++	Increment	Increases the value of a variable by 1	++x	
--	Decrement	Decreases the value of a variable by 1	--x


Java Assignment Operators
-------------------------

Assignment operators are used to assign values to variables.

In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:

Example
int x = 10;

The addition assignment operator (+=) adds a value to a variable:

Example
int x = 10;
x += 5;


A list of all assignment operators:

Operator	Example	Same As	Try it
=	x = 5	x = 5	
+=	x += 3	x = x + 3	
-=	x -= 3	x = x - 3	
*=	x *= 3	x = x * 3	
/=	x /= 3	x = x / 3	
%=	x %= 3	x = x % 3	
&=	x &= 3	x = x & 3	
|=	x |= 3	x = x | 3	
^=	x ^= 3	x = x ^ 3	
>>=	x >>= 3	x = x >> 3	
<<=	x <<= 3	x = x << 3



Java Comparison Operators
-------------------------

Comparison operators are used to compare two values (or variables). This is important in programming, because it helps us to find answers and make decisions.

The return value of a comparison is either true or false. These values are known as Boolean values, and you will learn more about them in the Booleans and If..Else chapter.

In the following example, we use the greater than operator (>) to find out if 5 is greater than 3:

Example
int x = 5;
int y = 3;
System.out.println(x > y); // returns true, because 5 is higher than 3


Operator	Name	Example	Try it
==	Equal to	x == y	
!=	Not equal	x != y	
>	Greater than	x > y	
<	Less than	x < y	
>=	Greater than or equal to  x >= y	
<=	Less than or equal to	x <= y



