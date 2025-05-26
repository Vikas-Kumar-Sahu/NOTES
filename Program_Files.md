1. Check Whether Number is Positive
java
Copy
Edit
int num = 5;
if(num > 0) {
    System.out.println("Positive Number");
} else {
    System.out.println("Not a Positive Number");
}
2. Check Marriage Eligibility (Assuming 21 for male)
java
Copy
Edit
int age = 22;
if(age >= 21) {
    System.out.println("Eligible to Marry");
} else {
    System.out.println("Not Eligible");
}
3. Print Good Morning if Number is 8
java
Copy
Edit
int number = 8;
if(number == 8) {
    System.out.println("Good Morning");
}
4. Display Message if Number is 8, 10, or 11
java
Copy
Edit
int number = 10;
if(number == 8 || number == 10 || number == 11) {
    System.out.println("Good Morning");
}
5. Program for Nested if and else-if Ladder
java
Copy
Edit
int marks = 85;
if(marks >= 90) {
    System.out.println("Grade A");
} else if(marks >= 75) {
    System.out.println("Grade B");
} else if(marks >= 60) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
6. Print Numbers from 1 to 10
java
Copy
Edit
for(int i = 1; i <= 10; i++) {
    System.out.print(i + " ");
}
7. Print Numbers from 20 to 10
java
Copy
Edit
for(int i = 20; i >= 10; i--) {
    System.out.print(i + " ");
}
8. Print Even Numbers from 1 to 10
java
Copy
Edit
for(int i = 1; i <= 10; i++) {
    if(i % 2 == 0) {
        System.out.print(i + " ");
    }
}
9. Print Odd Numbers from 1 to 10
java
Copy
Edit
for(int i = 1; i <= 10; i++) {
    if(i % 2 != 0) {
        System.out.print(i + " ");
    }
}
10. Print Even Numbers from 19 to 9
java
Copy
Edit
for(int i = 19; i >= 9; i--) {
    if(i % 2 == 0) {
        System.out.print(i + " ");
    }
}

11. Print Odd Numbers Between 20 to 10
java
Copy
Edit
for(int i = 20; i >= 10; i--) {
    if(i % 2 != 0) {
        System.out.print(i + " ");
    }
}
12. Calculate Sum from 1 to 5
java
Copy
Edit
int sum = 0;
for(int i = 1; i <= 5; i++) {
    sum += i;
}
System.out.println("Sum = " + sum);
13. Sum of Even Numbers from 1 to 10 with Tracing
java
Copy
Edit
int sum = 0;
for(int i = 1; i <= 10; i++) {
    if(i % 2 == 0) {
        System.out.println("Adding: " + i);
        sum += i;
    }
}
System.out.println("Total Sum = " + sum);
14. Sum of Odd Numbers from 1 to 10 with Tracing
java
Copy
Edit
int sum = 0;
for(int i = 1; i <= 10; i++) {
    if(i % 2 != 0) {
        System.out.println("Adding: " + i);
        sum += i;
    }
}
System.out.println("Total Sum = " + sum);
15. Sum of Even Numbers from 20 to 10
java
Copy
Edit
int sum = 0;
for(int i = 20; i >= 10; i--) {
    if(i % 2 == 0) {
        sum += i;
    }
}
System.out.println("Sum = " + sum);
16. Sum of Odd Numbers from 35 to 11
java
Copy
Edit
int sum = 0;
for(int i = 35; i >= 11; i--) {
    if(i % 2 != 0) {
        sum += i;
    }
}
System.out.println("Sum = " + sum);
17. Print Each Digit in a Number (in Reverse Order)
java
Copy
Edit
int num = 1234;
while(num > 0) {
    int digit = num % 10;
    System.out.println(digit);
    num /= 10;
}
18. Print Even Digits in a Number
java
Copy
Edit
int num = 42673;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 == 0) {
        System.out.println(digit);
    }
    num /= 10;
}
19. Print Odd Digits in a Number
java
Copy
Edit
int num = 42673;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 != 0) {
        System.out.println(digit);
    }
    num /= 10;
}
20. Calculate Sum of All Digits in a Number
java
Copy
Edit
int num = 1234;
int sum = 0;
while(num > 0) {
    int digit = num % 10;
    sum += digit;
    num /= 10;
}
System.out.println("Sum of digits = " + sum);

21. Calculate Sum of Even Digits in a Number
java
Copy
Edit
int num = 426738;
int sum = 0;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 == 0) {
        sum += digit;
    }
    num /= 10;
}
System.out.println("Sum of even digits = " + sum);
22. Calculate Sum of Odd Digits in a Number
java
Copy
Edit
int num = 13579;
int sum = 0;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 != 0) {
        sum += digit;
    }
    num /= 10;
}
System.out.println("Sum of odd digits = " + sum);
23. Logic for Swapping Two Numbers (Using Temp Variable)
java
Copy
Edit
int a = 5, b = 10;
int temp = a;
a = b;
b = temp;
System.out.println("a = " + a + ", b = " + b);
24. Swap Two Numbers Without Using Temp Variable
java
Copy
Edit
int a = 5, b = 10;
a = a + b;
b = a - b;
a = a - b;
System.out.println("a = " + a + ", b = " + b);
25. Count How Many Digits are Present in a Number
java
Copy
Edit
int num = 12345;
int count = 0;
while(num > 0) {
    count++;
    num /= 10;
}
System.out.println("Number of digits = " + count);
26. Count Even Digits in a Number
java
Copy
Edit
int num = 462378;
int count = 0;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 == 0) {
        count++;
    }
    num /= 10;
}
System.out.println("Even digits count = " + count);
27. Count Odd Digits in a Number
java
Copy
Edit
int num = 462378;
int count = 0;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 != 0) {
        count++;
    }
    num /= 10;
}
System.out.println("Odd digits count = " + count);
28. Reverse the Number
java
Copy
Edit
int num = 1234;
int rev = 0;
while(num > 0) {
    int digit = num % 10;
    rev = rev * 10 + digit;
    num /= 10;
}
System.out.println("Reversed number = " + rev);
29. Check Whether the Number is Palindrome
java
Copy
Edit
int num = 121;
int original = num;
int rev = 0;
while(num > 0) {
    int digit = num % 10;
    rev = rev * 10 + digit;
    num /= 10;
}
if(original == rev) {
    System.out.println("Palindrome");
} else {
    System.out.println("Not Palindrome");
}
30. Print Palindrome Numbers Between 10 to 200
java
Copy
Edit
for(int i = 10; i <= 200; i++) {
    int num = i;
    int rev = 0;
    int temp = num;
    while(num > 0) {
        int digit = num % 10;
        rev = rev * 10 + digit;
        num /= 10;
    }
    if(temp == rev) {
        System.out.print(temp + " ");
    }
}

31. Calculate Power of a Number → In class
java
Copy
Edit
int base = 2, power = 4;
int result = 1;
for(int i = 1; i <= power; i++) {
    result *= base;
}
System.out.println(base + " raised to " + power + " is " + result);
32. Calculate Square of the Digit in a Number (if digit is even)
java
Copy
Edit
int num = 426;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 == 0) {
        System.out.println("Square of " + digit + " = " + (digit * digit));
    }
    num /= 10;
}
33. Calculate Cube of Every Digit if Digit is Odd in a Number
java
Copy
Edit
int num = 1357;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 != 0) {
        System.out.println("Cube of " + digit + " = " + (digit * digit * digit));
    }
    num /= 10;
}
34. Calculate Sum of Squares of Each Digit if Digit is Even
java
Copy
Edit
int num = 2046, sum = 0;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 == 0) {
        sum += digit * digit;
    }
    num /= 10;
}
System.out.println("Sum of squares of even digits = " + sum);
35. Calculate Sum of Cubes of Each Digit if Digit is Odd
java
Copy
Edit
int num = 15379, sum = 0;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 != 0) {
        sum += digit * digit * digit;
    }
    num /= 10;
}
System.out.println("Sum of cubes of odd digits = " + sum);
36. Print Divisors of 10 → In class
java
Copy
Edit
int num = 10;
for(int i = 1; i <= num; i++) {
    if(num % i == 0) {
        System.out.print(i + " ");
    }
}
37. Print Numbers Between 1 to 30 Divisible by 3 and 9
java
Copy
Edit
for(int i = 1; i <= 30; i++) {
    if(i % 3 == 0 && i % 9 == 0) {
        System.out.print(i + " ");
    }
}
38. Print Numbers Between 1 to 100 Divisible Only by 9
java
Copy
Edit
for(int i = 1; i <= 100; i++) {
    if(i % 9 == 0 && i % 3 != 0 && i % 6 != 0) {
        System.out.print(i + " ");
    }
}
💡 Note: The phrase "only divisible by 9" can mean not divisible by any number except 1 and 9, but in programming questions, it's usually interpreted as "divisible by 9."

39. Print Numbers Between 1 to 20 Divisible by 2 and 4
java
Copy
Edit
for(int i = 1; i <= 20; i++) {
    if(i % 2 == 0 && i % 4 == 0) {
        System.out.print(i + " ");
    }
}
40. Sum of Numbers Between 20 to 60 Divisible Only by 11
java
Copy
Edit
int sum = 0;
for(int i = 20; i <= 60; i++) {
    if(i % 11 == 0) {
        sum += i;
    }
}
System.out.println("Sum = " + sum);

41. Check Whether a Number is a Perfect Number or Not → In class
java
Copy
Edit
int num = 28, sum = 0;
for(int i = 1; i < num; i++) {
    if(num % i == 0) {
        sum += i;
    }
}
if(sum == num)
    System.out.println(num + " is a Perfect Number");
else
    System.out.println(num + " is NOT a Perfect Number");
42. Tracing for Perfect Numbers: 28 and 6
Manually checking:

For 6: 1 + 2 + 3 = 6 → Perfect

For 28: 1 + 2 + 4 + 7 + 14 = 28 → Perfect

43. Calculate Factorial of a Number → In class
java
Copy
Edit
int num = 5;
int fact = 1;
for(int i = 1; i <= num; i++) {
    fact *= i;
}
System.out.println("Factorial = " + fact);
44. Extract Digit in Number, If Even Find Factorial
java
Copy
Edit
int num = 324;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 == 0) {
        int fact = 1;
        for(int i = 1; i <= digit; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + digit + " = " + fact);
    }
    num /= 10;
}
45. Calculate Factorial if Digit is Odd in a Number
java
Copy
Edit
int num = 735;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 != 0) {
        int fact = 1;
        for(int i = 1; i <= digit; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + digit + " = " + fact);
    }
    num /= 10;
}
46. Tracing for Factorial Program: 4 and 6
4! = 4×3×2×1 = 24

6! = 6×5×4×3×2×1 = 720

47. Sum of Factorial of Odd Digits in a Number
java
Copy
Edit
int num = 135, sum = 0;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 != 0) {
        int fact = 1;
        for(int i = 1; i <= digit; i++) {
            fact *= i;
        }
        sum += fact;
    }
    num /= 10;
}
System.out.println("Sum of factorial of odd digits = " + sum);
48. Sum of Factorial of Even Digits in a Number
java
Copy
Edit
int num = 246, sum = 0;
while(num > 0) {
    int digit = num % 10;
    if(digit % 2 == 0) {
        int fact = 1;
        for(int i = 1; i <= digit; i++) {
            fact *= i;
        }
        sum += fact;
    }
    num /= 10;
}
System.out.println("Sum of factorial of even digits = " + sum);
49. Create a Method to Add Two Numbers and Check Even/Odd → In class
java
Copy
Edit
public static int add(int a, int b) {
    return a + b;
}

public static void main(String[] args) {
    int result = add(5, 4);
    if(result % 2 == 0)
        System.out.println("Addition is Even");
    else
        System.out.println("Addition is Odd");
}
50. Method to Calculate Factorial and Return Result → In class**
java
Copy
Edit
public static int factorial(int n) {
    int fact = 1;
    for(int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}

public static void main(String[] args) {
    System.out.println("Factorial of 5 is " + factorial(5));
}

51. Design a Method to Return Square of the Number
java
Copy
Edit
public static int square(int num) {
    return num * num;
}

public static void main(String[] args) {
    System.out.println("Square of 6 = " + square(6));
}
52. Design a Method to Return Power of a Number
java
Copy
Edit
public static int power(int base, int exponent) {
    int result = 1;
    for(int i = 1; i <= exponent; i++) {
        result *= base;
    }
    return result;
}

public static void main(String[] args) {
    System.out.println("2^4 = " + power(2, 4));
}
53. Method to Calculate Addition of All Digits in a Number and Return the Sum
java
Copy
Edit
public static int sumOfDigits(int num) {
    int sum = 0;
    while(num > 0) {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}

public static void main(String[] args) {
    System.out.println("Sum of digits = " + sumOfDigits(1234));
}
54. Method to Calculate Sum of Even Digits and Return, then Square It in Main
java
Copy
Edit
public static int evenDigitSum(int num) {
    int sum = 0;
    while(num > 0) {
        int digit = num % 10;
        if(digit % 2 == 0) {
            sum += digit;
        }
        num /= 10;
    }
    return sum;
}

public static void main(String[] args) {
    int sum = evenDigitSum(2648);
    System.out.println("Square of Even Digit Sum = " + (sum * sum));
}
55. Method to Return Factorial of Each Digit in a Number → In class
java
Copy
Edit
public static void factorialEachDigit(int num) {
    while(num > 0) {
        int digit = num % 10;
        int fact = 1;
        for(int i = 1; i <= digit; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + digit + " = " + fact);
        num /= 10;
    }
}
56. Method to Return Factorial of Each Digit and Calculate Sum → In class
java
Copy
Edit
public static int sumOfFactorials(int num) {
    int sum = 0;
    while(num > 0) {
        int digit = num % 10;
        int fact = 1;
        for(int i = 1; i <= digit; i++) {
            fact *= i;
        }
        sum += fact;
        num /= 10;
    }
    return sum;
}

public static void main(String[] args) {
    System.out.println("Sum of factorials = " + sumOfFactorials(123));
}
57. Check if Number is Strong Number or Not → In class
A number is strong if the sum of the factorials of its digits equals the number.

java
Copy
Edit
public static boolean isStrong(int num) {
    int temp = num, sum = 0;
    while(num > 0) {
        int digit = num % 10;
        int fact = 1;
        for(int i = 1; i <= digit; i++) {
            fact *= i;
        }
        sum += fact;
        num /= 10;
    }
    return sum == temp;
}

public static void main(String[] args) {
    System.out.println("Is 145 Strong? " + isStrong(145));
}
58. Print Strong Numbers Between 1 to 1000
java
Copy
Edit
for(int i = 1; i <= 1000; i++) {
    if(isStrong(i)) {
        System.out.println(i + " is a Strong number");
    }
}
59. Check Special Two-Digit Number → In class
A number is special if (sum of digits + product of digits) = original number.

java
Copy
Edit
int num = 59;
int d1 = num / 10;
int d2 = num % 10;

int sum = d1 + d2;
int product = d1 * d2;

if((sum + product) == num)
    System.out.println(num + " is a Special Number");
else
    System.out.println(num + " is NOT a Special Number");
60. Print Special Numbers Between 10 and 100
java
Copy
Edit
for(int i = 10; i < 100; i++) {
    int d1 = i / 10;
    int d2 = i % 10;
    if((d1 + d2 + d1 * d2) == i) {
        System.out.println(i + " is a Special Number");
    }
}

61. Design a Method to Count Number of Digits in a Number
java
Copy
Edit
public static int countDigits(int num) {
    int count = 0;
    while(num > 0) {
        count++;
        num /= 10;
    }
    return count;
}

public static void main(String[] args) {
    System.out.println("Digits count: " + countDigits(12345));
}
62. Check Whether Number is Prime or Not → In class
java
Copy
Edit
public static boolean isPrime(int num) {
    if (num <= 1) return false;
    for(int i = 2; i <= num / 2; i++) {
        if(num % i == 0) return false;
    }
    return true;
}

public static void main(String[] args) {
    System.out.println("Is 17 prime? " + isPrime(17));
}
63. Print Prime Numbers Between 1 to 50
java
Copy
Edit
for(int i = 1; i <= 50; i++) {
    if(isPrime(i)) {
        System.out.println(i + " is Prime");
    }
}
64. Print Fibonacci Number Series Up to 10 Digits → In class
java
Copy
Edit
public static void fibonacci(int count) {
    int a = 0, b = 1;
    System.out.print(a + " " + b + " ");
    for(int i = 3; i <= count; i++) {
        int c = a + b;
        System.out.print(c + " ");
        a = b;
        b = c;
    }
}

public static void main(String[] args) {
    fibonacci(10);  // or up to 50 for longer series
}
65. Check Number is Armstrong or Not & Print 1–1000 → In class
A number is Armstrong if the sum of cubes of its digits equals the number itself (for 3-digit).

java
Copy
Edit
public static boolean isArmstrong(int num) {
    int temp = num, sum = 0;
    while(num > 0) {
        int digit = num % 10;
        sum += digit * digit * digit;
        num /= 10;
    }
    return sum == temp;
}

public static void main(String[] args) {
    // Check a specific number
    System.out.println("Is 153 Armstrong? " + isArmstrong(153));

    // Print Armstrong numbers from 1 to 1000
    for(int i = 1; i <= 1000; i++) {
        if(isArmstrong(i)) {
            System.out.println(i + " is an Armstrong number");
        }
    }
}
PATTERN PROGRAMS STARTING BELOW ↓
66. Syntax for Pattern Drawing → In class
Usually involves nested loops.

java
Copy
Edit
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
67. Print Pattern B, C, X, A Using * → In Class
This refers to alphabet shape patterns. Here's an example for A:

java
Copy
Edit
for (int i = 0; i < 5; i++) {
    for (int j = 0; j <= 5; j++) {
        if ((j == 0 || j == 5) && i != 0 || (i == 0 || i == 2) && (j > 0 && j < 5))
            System.out.print("*");
        else
            System.out.print(" ");
    }
    System.out.println();
}
68. **Print Patterns H, D, E, F, I, L, N, O, S, T, U, Z, M, Y, J, K, W, Q, P, R Using ***
Each pattern is character-specific, and requires careful row/column logic. Example for H:

java
Copy
Edit
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        if (j == 0 || j == 4 || i == 2)
            System.out.print("*");
        else
            System.out.print(" ");
    }
    System.out.println();
}
69. Draw Triangle Pattern Using * → In Class
java
Copy
Edit
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
70. **Draw Other Triangle Pattern Using ***
java
Copy
Edit
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
for (int i = 4; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}

71. **Draw Reverse Triangle Pattern Using ***
java
Copy
Edit
for (int i = 5; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
72. Draw Triangle Pattern Using Numbers
java
Copy
Edit
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
73. Draw Triangle Pattern Using Alphabet
java
Copy
Edit
char ch = 'A';
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(ch + " ");
        ch++;
    }
    System.out.println();
}
74. Draw Triangle Pattern Using Same Alphabet
java
Copy
Edit
for (int i = 1; i <= 5; i++) {
    char ch = (char) ('A' + i - 1);
    for (int j = 1; j <= i; j++) {
        System.out.print(ch + " ");
    }
    System.out.println();
}
75. Draw Triangle Pattern Using Decrement Numbers
java
Copy
Edit
for (int i = 5; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
76. Draw Triangle Pattern Using Decrement Same Numbers
java
Copy
Edit
for (int i = 5; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
    }
    System.out.println();
}
77. Draw Number Diamond Pattern
java
Copy
Edit
int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = i; j < n; j++)
        System.out.print(" ");
    for (int j = 1; j <= (2 * i - 1); j++)
        System.out.print(i);
    System.out.println();
}
for (int i = n - 1; i >= 1; i--) {
    for (int j = n; j > i; j--)
        System.out.print(" ");
    for (int j = 1; j <= (2 * i - 1); j++)
        System.out.print(i);
    System.out.println();
}
78. Draw Star Diamond Pattern
java
Copy
Edit
int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = i; j < n; j++)
        System.out.print(" ");
    for (int j = 1; j <= (2 * i - 1); j++)
        System.out.print("*");
    System.out.println();
}
for (int i = n - 1; i >= 1; i--) {
    for (int j = n; j > i; j--)
        System.out.print(" ");
    for (int j = 1; j <= (2 * i - 1); j++)
        System.out.print("*");
    System.out.println();
}
79. Draw Square Pattern
java
Copy
Edit
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 5; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
80. Draw Square Pattern with Numbers
java
Copy
Edit
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 5; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}

81. WAP to Calculate Sum of Array Elements → IN CLASS
java
Copy
Edit
public class SumArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum = " + sum);
    }
}
82. WAP to Print Odd Elements in an Array
java
Copy
Edit
public class OddArrayElements {
    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 8, 5, 11};
        for (int num : arr) {
            if (num % 2 != 0)
                System.out.println(num);
        }
    }
}
83. WAP to Calculate Sum of Even Elements in an Array
java
Copy
Edit
public class SumEvenArray {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 7, 4};
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                sum += num;
        }
        System.out.println("Sum of even elements = " + sum);
    }
}
84. WAP to Calculate Sum of Odd Elements in an Array
java
Copy
Edit
public class SumOddArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0)
                sum += num;
        }
        System.out.println("Sum of odd elements = " + sum);
    }
}
85. Design a Method to Create Integer Array and Read Elements → IN CLASS
java
Copy
Edit
import java.util.Scanner;
public class ReadArray {
    public static int[] readArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = readArray(5);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
86. Design a Method to Create and Return Array from User → IN CLASS
java
Copy
Edit
import java.util.Scanner;
public class ReturnUserArray {
    public static int[] getArrayFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getArrayFromUser();
        for (int i : arr)
            System.out.print(i + " ");
    }
}
87. WAP to Check Array Length Without Using length Variable
java
Copy
Edit
public class ArrayLength {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int count = 0;
        try {
            while (true) {
                int temp = arr[count];
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Length = " + count);
        }
    }
}
88. WAP to Find Largest Element in Array → IN CLASS
java
Copy
Edit
public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {11, 45, 67, 89, 21};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest = " + max);
    }
}
89. WAP to Find Smallest Element in Array
java
Copy
Edit
public class MinArray {
    public static void main(String[] args) {
        int[] arr = {11, 45, 67, 89, 5};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest = " + min);
    }
}
90. WAP to Print Even Index Values in an Array → IN CLASS
java
Copy
Edit
public class EvenIndexArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
}

91. WAP to Print Elements Present at Odd Indexes in an Array
java
Copy
Edit
public class OddIndexElements {
    public static void main(String[] args) {
        int[] arr = {15, 25, 35, 45, 55, 65};
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
}
92. WAP to Count Even and Odd Numbers in an Array
java
Copy
Edit
public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 21, 32, 43, 54, 65};
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);
    }
}
93. WAP to Count Positive and Negative Numbers in an Array
java
Copy
Edit
public class CountPosNeg {
    public static void main(String[] args) {
        int[] arr = {-5, 3, -2, 7, -1, 4};
        int pos = 0, neg = 0;
        for (int num : arr) {
            if (num >= 0)
                pos++;
            else
                neg++;
        }
        System.out.println("Positive Count = " + pos);
        System.out.println("Negative Count = " + neg);
    }
}
94. WAP to Count Zeros in an Array
java
Copy
Edit
public class CountZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 3, 0, 4};
        int count = 0;
        for (int num : arr) {
            if (num == 0)
                count++;
        }
        System.out.println("Zero Count = " + count);
    }
}
95. WAP to Copy Elements of One Array into Another
java
Copy
Edit
public class CopyArray {
    public static void main(String[] args) {
        int[] src = {10, 20, 30, 40};
        int[] dest = new int[src.length];
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }
        System.out.print("Copied Array: ");
        for (int val : dest)
            System.out.print(val + " ");
    }
}
96. WAP to Reverse Elements of an Array
java
Copy
Edit
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
97. WAP to Sort an Array in Ascending Order
java
Copy
Edit
public class SortAscending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int val : arr)
            System.out.print(val + " ");
    }
}
98. WAP to Sort an Array in Descending Order
java
Copy
Edit
public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array (Descending): ");
        for (int val : arr)
            System.out.print(val + " ");
    }
}
99. WAP to Find Duplicate Elements in an Array
java
Copy
Edit
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 4, 1, 3};
        System.out.println("Duplicate Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
100. WAP to Merge Two Arrays
java
Copy
Edit
public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        System.out.print("Merged Array: ");
        for (int val : merged)
            System.out.print(val + " ");
    }
}

101. Design a Method to Accept Array and Index Value
java
Copy
Edit
import java.util.Scanner;

public class AcceptArrayAndIndex {
    public static int[] acceptArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int acceptIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index value: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int[] arr = acceptArray();
        int index = acceptIndex();
        System.out.println("Array and index accepted successfully.");
    }
}
102. Remove Element Present at Given Index in an Array and Return Revised Array
java
Copy
Edit
import java.util.Arrays;

public class RemoveElementByIndex {
    public static int[] removeAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2;  // remove element at index 2 (30)
        int[] result = removeAtIndex(arr, index);
        System.out.println("Array after removal: " + Arrays.toString(result));
    }
}
103. WAP to Sort an Array Element in Ascending Order
java
Copy
Edit
import java.util.Arrays;

public class SortArrayAscending {
    public static void main(String[] args) {
        int[] arr = {25, 15, 30, 10, 20};
        Arrays.sort(arr);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));
    }
}
104. WAP to Sort an Array Element in Descending Order
java
Copy
Edit
import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {
    public static void main(String[] args) {
        Integer[] arr = {25, 15, 30, 10, 20}; // Use Integer wrapper for Collections.reverseOrder()
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));
    }
}
105. WAP to Find the Second Largest Element in an Array
java
Copy
Edit
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 20, 40};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second largest element is: " + secondLargest);
    }
}
106. Create a Method and Sort Array Elements
java
Copy
Edit
import java.util.Arrays;

public class SortArrayMethod {
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, 5};
        sortArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
107. WAP to Find the Second Smallest Element in an Array
java
Copy
Edit
public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {12, 7, 15, 10, 5};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println("Second smallest element is: " + secondSmallest);
    }
}
108. Design a Method to Return Second Largest Element in an Array
java
Copy
Edit
public class ReturnSecondLargest {
    public static int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {15, 25, 5, 10, 20};
        int secondLargest = getSecondLargest(arr);
        System.out.println("Second largest element: " + secondLargest);
    }
}
109. Design a Method to Return Smallest Element in an Array
java
Copy
Edit
public class ReturnSmallest {
    public static int getSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 15, 3, 20};
        System.out.println("Smallest element is: " + getSmallest(arr));
    }
}
110. Design a Method to Sort Array Elements in Descending Order and Return Sorted Array
java
Copy
Edit
import java.util.Arrays;
import java.util.Collections;

public class SortDescendingMethod {
    public static Integer[] sortDescending(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = {10, 30, 20, 40, 50};
        Integer[] sorted = sortDescending(arr);
        System.out.println("Sorted in descending order: " + Arrays.toString(sorted));
    }
}

111. WAP to Print Duplicate Elements in an Array
java
Copy
Edit
import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Duplicate elements: ");
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
112. WAP to Remove Duplicate Elements in an Array
java
Copy
Edit
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        int[] result = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
113. WAP to Find How Many Times a Value is Duplicated in an Array
java
Copy
Edit
public class CountDuplicates {
    public static int countOccurrences(int[] arr, int value) {
        int count = 0;
        for (int num : arr) {
            if (num == value) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        int value = 10;
        int count = countOccurrences(arr, value);
        System.out.println(value + " appears " + count + " times");
    }
}
114. WAP to Print Only First Half of the Array Elements
java
Copy
Edit
public class FirstHalfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int half = arr.length / 2;
        System.out.print("First half elements: ");
        for (int i = 0; i < half; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
115. WAP to Find Missing Element in an Array
java
Copy
Edit
public class MissingElement {
    public static int findMissing(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return totalSum - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        System.out.println("Missing element is: " + findMissing(arr, n));
    }
}
116. WAP to Calculate Consecutive Sum (First Two and Next Two Element Sum) of the Array Elements
java
Copy
Edit
public class ConsecutiveSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i += 2) {
            int sum = arr[i];
            if (i + 1 < arr.length) sum += arr[i + 1];
            System.out.println("Sum of elements at index " + i + " and " + (i + 1) + " = " + sum);
        }
    }
}
117. WAP to Find the Biggest Consecutive Sum in Array Elements
java
Copy
Edit
public class BiggestConsecutiveSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 8, 1, 4};
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("Biggest consecutive sum is: " + maxSum);
    }
}
118. WAP to Sort First Half in Ascending Order and Second Half in Descending Order
java
Copy
Edit
import java.util.Arrays;
import java.util.Collections;

public class HalfSort {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        int mid = arr.length / 2;

        Arrays.sort(arr, 0, mid); // sort first half ascending
        Arrays.sort(arr, mid, arr.length, Collections.reverseOrder()); // sort second half descending

        System.out.println("Array after sorting halves: " + Arrays.toString(arr));
    }
}
119. WAP for Given Input and Show Output as Given Below
i/p = {3, 6, 7, 9, 5, 11}
o/p = {3, 7, 5, 11}

java
Copy
Edit
import java.util.ArrayList;

public class FilterOddNumbers {
    public static void main(String[] args) {
        int[] input = {3, 6, 7, 9, 5, 11};
        ArrayList<Integer> output = new ArrayList<>();

        for (int num : input) {
            if (num % 2 != 0) {
                output.add(num);
            }
        }
        System.out.println("Output: " + output);
    }
}
120. WAP for Given Input and Show Output as Given Below
i/p = {6, 7, 8, 28, 19}
o/p = {6, 28}

java
Copy
Edit
import java.util.ArrayList;

public class FilterDivisibleBy2And4 {
    public static void main(String[] args) {
        int[] input = {6, 7, 8, 28, 19};
        ArrayList<Integer> output = new ArrayList<>();

        for (int num : input) {
            if (num % 2 == 0 && num % 4 == 0) {
                output.add(num);
            }
        }
        System.out.println("Output: " + output);
    }
}

121. WAP to Show the Count of Numbers Present in the Array
java
Copy
Edit
public class CountArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Number of elements in the array: " + arr.length);
    }
}
122. What is String and How to Create String
String in Java is an object that represents a sequence of characters.

String can be created using string literal or by using the new keyword.

java
Copy
Edit
public class StringCreation {
    public static void main(String[] args) {
        String str1 = "Hello";               // Using string literal
        String str2 = new String("World");   // Using new keyword
        System.out.println(str1 + " " + str2);
    }
}
123. What is SCP and Why String is Immutable
SCP = String Constant Pool is a special memory location where string literals are stored to save memory.

String is immutable because once created, its value cannot be changed. This allows sharing and caching of string objects safely.

124. Difference Between equals() and ==
Feature	equals()	==
Purpose	Checks content equality	Checks reference equality
Applicable To	Overridden in String and other classes	Compares memory addresses
Example	"hello".equals("hello") → true	str1 == str2 → true if same object

125. Methods of String Class
charAt(index) - Returns character at index

toUpperCase() - Converts string to uppercase

toLowerCase() - Converts string to lowercase

length() - Returns length of string

trim() - Removes leading and trailing spaces

toCharArray() - Converts string to char array

substring(start, end) - Returns substring

split(regex) - Splits string by regex

equalsIgnoreCase() - Compares ignoring case

126. WAP to Count Characters Present in String Without Using length()
java
Copy
Edit
public class CountCharactersWithoutLength {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Number of characters: " + count);
        }
    }
}
127. WAP to Convert Uppercase to Lowercase Without Using Inbuilt Method
java
Copy
Edit
public class UpperToLower {
    public static void main(String[] args) {
        String str = "HELLO";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result.append(ch);
        }
        System.out.println(result.toString());
    }
}
128. WAP to Convert Lowercase to Uppercase Without Using Inbuilt Method
java
Copy
Edit
public class LowerToUpper {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result.append(ch);
        }
        System.out.println(result.toString());
    }
}
129. WAP to Find Duplicate Characters Present in the String
java
Copy
Edit
import java.util.HashSet;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!set.add(ch)) {
                duplicates.add(ch);
            }
        }
        System.out.println("Duplicate characters: " + duplicates);
    }
}
130. WAP to Find the Occurrence of Each Character in a String
java
Copy
Edit
import java.util.HashMap;

public class CharOccurrence {
    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : map.keySet()) {
            System.out.println(ch + ": " + map.get(ch));
        }
    }
}

131. WAP to Reverse the String
java
Copy
Edit
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }
}
132. WAP to Check Whether String is Palindrome or Not
java
Copy
Edit
public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
133. WAP to Reverse the Word in a String
Input: PRINCE IS GOOD SINGER
Output: ECNIRP SI DOOG REGNIS

java
Copy
Edit
public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "PRINCE IS GOOD SINGER";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            result.append(reversedWord).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
