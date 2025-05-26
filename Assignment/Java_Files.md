// Basic Java
1. How does Java become a platform-independent language?
Java is platform-independent because Java code is compiled into bytecode by the Java compiler. This bytecode can run on any system that has a Java Virtual Machine (JVM), regardless of the underlying hardware and OS.

2. Difference between Procedure-Oriented Language and Object-Oriented Language:

Feature	Procedure-Oriented	Object-Oriented
Focus	Functions	Objects
Data	Not secure (global access)	Encapsulated (secure)
Reusability	Less	High
Example	C	Java

3. What is Bytecode in Java?
Bytecode is an intermediate code generated after compiling Java source code. It is executed by the JVM, making Java platform-independent.

4. Difference between JVM, JRE, JDK, and JIT Compiler:

JVM (Java Virtual Machine): Executes Java bytecode.

JRE (Java Runtime Environment): JVM + libraries to run Java apps.

JDK (Java Development Kit): JRE + tools (compiler, debugger) to develop Java apps.

JIT (Just-In-Time) Compiler: Improves performance by compiling bytecode to native code at runtime.

5. Difference between Keywords and Identifiers in Java:

Keywords: Reserved words in Java (e.g., class, public, if).

Identifiers: Names given to variables, classes, methods, etc.

6. Different Data Types in Java:

Primitive Types: byte, short, int, long, float, double, char, boolean

Non-Primitive Types: Strings, Arrays, Classes, Interfaces, etc.

7. Difference between Primitive and Non-Primitive Data Types:

Primitive	Non-Primitive
Predefined	User-defined or Java-defined
Stores values	Stores references
e.g., int, float	e.g., String, Array

8. What is Primitive Type Casting in Java? Explain Widening and Narrowing:

Type casting is converting one data type into another.

Widening (Implicit): Smaller to larger type (e.g., int to long)

Narrowing (Explicit): Larger to smaller type (e.g., double to int)

9. What is a Variable? What are the Different Types in Java?
A variable stores data.
Types:

Local (inside methods)

Instance (non-static, part of object)

Static (shared across all instances)

10. Can a Local Variable Have a Default Value in Java?
No, local variables must be initialized before use.

11. Use of break and continue Keywords in Java:

break: Exits the loop or switch statement.

continue: Skips the current loop iteration and continues with the next.

12. Why Should the Main Method be public?
It must be public so the JVM can access it from outside the class.

13. Why Should the Main Method be static?
It must be static so it can run without creating an object of the class.

14. Why is the Return Type of Main Method void?
It’s void because it doesn’t return anything to the JVM.

15. How Can We Call a Static Method Anywhere?
By using the class name:

ClassName.methodName();
16. How Can We Call a Non-Static Method Anywhere?
By creating an object of the class:

ClassName obj = new ClassName();  
obj.methodName();
17. Meaning of Formal Argument and Actual Argument of Method:

Formal Argument: Parameters in method definition.

Actual Argument: Values passed during method call.

18. What is Compile-Time Binding in Java?
It refers to method or variable binding at compile time, also called early binding. It applies to method overloading and static methods.


// Object Oriented
1. What is a Class in Java?
A class is a blueprint or template that defines the structure and behavior (via fields and methods) of objects.
Example:

java
Copy
Edit
class Car {
   int speed;
   void drive() { System.out.println("Driving"); }
}
2. What is an Object or Instance of a Class?
An object is a real-world entity created from a class using the new keyword.
Example:

java
Copy
Edit
Car myCar = new Car();
3. Is Java a 100% Object-Oriented Programming Language?
No, Java is not 100% object-oriented because it uses primitive data types (int, char, etc.) which are not objects.

4. What are the Four Pillars of Object-Oriented Programming?

Encapsulation

Inheritance

Polymorphism

Abstraction

5. What is new in Java? Why is it Used?
The new keyword is used to create objects from classes. It allocates memory on the heap.
Example:

java
Copy
Edit
Student s = new Student();
6. What is a Reference Variable in Java? What is its Default Value?
A reference variable refers to an object. It holds the memory address of the object.
Default value = null (if not initialized)

7. Difference between Local Variable and Instance Variable:

Local Variable	Instance Variable
Defined inside methods	Defined in a class (outside methods)
No default value	Has default value
Scope is limited to method	Scope is tied to object

8. Difference between Stack Area and Heap Area:

Stack: Stores local variables, method calls; memory is short-lived.

Heap: Stores objects and instance variables; memory is long-lived.

9. Explain Static Variable in Java:
A static variable belongs to the class, not the object. It is shared across all instances.
Example:

java
Copy
Edit
static int count;
10. Explain Non-Static (Instance) Variable in Java:
An instance variable belongs to each object. Every object has its own copy.
Example:

java
Copy
Edit
int id; // instance variable
11. Example: When to Use Static and Non-Static Variable:
Use static for common properties (e.g., school name), and non-static for unique ones (e.g., student name).

java
Copy
Edit
class Student {
   static String school = "ABC School"; // shared
   String name; // individual
}
12. Difference Between Static and Non-Static Variable:

Static	Non-Static
Shared across all objects	Unique to each object
Accessed using class name	Accessed via object
Loaded once in memory	Created with each object

13. What is Variable Hiding in Java? How is it Resolved?
Variable hiding occurs when a subclass defines a variable with the same name as in superclass.
It is resolved using super keyword.
Example:

java
Copy
Edit
class Parent {
   int x = 10;
}
class Child extends Parent {
   int x = 20;
   void print() {
      System.out.println(super.x); // Access parent variable
   }
}
14. Explain this Keyword in Java:
this refers to the current object. It is used to:

Refer to instance variables

Invoke current class methods

Pass current object as a parameter
Example:

class Test {
   int x;
   Test(int x) {
      this.x = x; // refers to instance variable
   }
}

// Constructor
15. What is a Constructor in Java?
A constructor is a special method that is automatically called when an object is created. It has the same name as the class and does not have a return type (not even void).

16. Differences Between Method and Constructor:

Feature	Constructor	Method
Purpose	Initialize object	Define behavior
Name	Same as class	Any name
Return type	None (not even void)	Has return type
Call	Automatically during object creation	Manually via object

17. Types of Constructors in Java:

Default Constructor

Parameterized Constructor

Copy Constructor (not built-in like C++, but can be created manually)

18. What is Default Constructor in Java?
A default constructor is a no-argument constructor created automatically by the compiler if no constructor is defined.
Use: Initializes the object with default values.
Example:

class A {
   A() {
      System.out.println("Default Constructor");
   }
}
19. Does Every Class in Java Have a Constructor?
Yes, every class has a constructor. If none is written, the compiler provides a default constructor.

20. Constructor Overloading in Java:
Constructor overloading means having multiple constructors with different parameter lists.
Ways to achieve it:

Vary number of parameters

Vary type of parameters
Example:

java
Copy
Edit
class Person {
   Person() {}
   Person(String name) {}
   Person(String name, int age) {}
}
21. Explain this() Statement in Java and Why it is Required:
this() is used to call another constructor in the same class.
Required to avoid code duplication and manage constructor chaining.
Example:

class A {
   A() {
      this(5); // calls parameterized constructor
   }
   A(int x) {
      System.out.println(x);
   }
}
22. What is Constructor Chaining in Java and How to Achieve It?
Constructor chaining means one constructor calls another.

Within same class: Use this()

From superclass: Use super()
Example:

class A {
   A() { this(10); }
   A(int x) { System.out.println(x); }
}
23. Explain Copy Constructor in Java:
A copy constructor creates a new object by copying values from another object.
Example:

class Student {
   int id;
   Student(Student s) {
      this.id = s.id;
   }
}
24. Can a Constructor be Static in Java?
No, constructors cannot be static because they are called when an object is created, and static belongs to the class, not to the instance.

25. What Does a Constructor Return in Java?
A constructor does not return any value, not even void. Internally, it returns the reference to the newly created object, but that is handled by the JVM.

// Method Overloading
26. What is Method Overloading in Java? How to Achieve It and What Is Its Advantage?
Method Overloading allows multiple methods with the same name but different parameter types, numbers, or order within the same class.
How to achieve:

Different number of parameters

Different types of parameters
Advantage:

Increases readability and reusability of code

Allows same method name for different behaviors

27. Examples of Method Overloading in Java:

java
Copy
Edit
class Calculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }
    void add(double a, double b) {
        System.out.println(a + b);
    }
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
28. Can We Overload main() Method in Java?
Yes, we can overload the main method, but the JVM always calls the one with String[] args. Others can be called manually.

public class Test {
    public static void main(String[] args) {
        main(10); // calls overloaded version
    }

    public static void main(int x) {
        System.out.println("Overloaded main: " + x);
    }
}
29. Can We Overload Both Static and Non-Static Methods?
Yes, both static and non-static methods can be overloaded as long as their parameter list is different.

30. Why Is Method Overloading Called Compile-Time Polymorphism or Static Polymorphism?
Because the method to be executed is decided at compile time based on the method signature (number/type of arguments).

31. What Is Method Chaining in Java and How to Achieve It?
Method Chaining is calling multiple methods on the same object in a single line. Each method must return the current object (this).

32. Program to Explain Method Chaining in Java:

class Student {
    String name;
    int age;

    Student setName(String name) {
        this.name = name;
        return this;
    }

    Student setAge(int age) {
        this.age = age;
        return this;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        new Student()
            .setName("Rahul")
            .setAge(21)
            .display(); // Chained method calls
    }
}

// Association
33. What Is Association Relationship in Java?
Association defines a relationship between two separate classes that are connected through their objects. It can be one-to-one, one-to-many, etc.
Example:

class Teacher {}
class Student {
    Teacher teacher; // Association
}
34. What Are the Different Types of Relationships in Java?

Association

Aggregation

Composition

Inheritance (IS-A relationship)

Dependency

35. What Is HAS-A and IS-A Relationship in Java?

IS-A: Inheritance; one class is a type of another.
Example: Dog IS-A Animal (class Dog extends Animal)

HAS-A: Composition or aggregation; one class has a reference to another.
Example: Car HAS-A Engine

36. What Is Composition and Aggregation in Java?

Aggregation: Weak relationship. Child can exist independently of parent.
Example: Department and Teacher

Composition: Strong relationship. Child cannot exist without parent.
Example: House and Room

37. When Is an Object Deleted or Garbage Collected in Java?
An object is garbage collected when it has no references pointing to it (i.e., unreachable).

38. What Is Automatic Garbage Collection in Java?
Java has automatic memory management. The Garbage Collector (GC) runs in the background and frees memory by removing unused objects.

39. Explain System.out.println() Statement in Java:

System: A final class from java.lang package.

out: A static object of PrintStream.

println(): A method used to print a line of text followed by a newline.

40. What Is Call by Value and Call by Reference?

Call by Value: A copy of the variable’s value is passed to the method.

Call by Reference: A reference (memory address) is passed to the method.

41. Does Java Support Call by Reference? Why?
No, Java supports only call by value.
When objects are passed, the reference is passed by value — meaning changes to the object's internal state are reflected, but reassignments don't affect the original object.

42. How Many References Can One Object Have in Java?
An object can have multiple references. All references point to the same memory location.
Example:

Student s1 = new Student();
Student s2 = s1; // s1 and s2 point to the same object

// Inheritance
43. What is Inheritance and How to Achieve It in Java?
Inheritance is a mechanism where a class inherits fields and methods from another class using the extends keyword.

class Animal { void eat() {} }
class Dog extends Animal { void bark() {} }
44. Different Types of Inheritance in Java:

Single Inheritance

Multilevel Inheritance

Hierarchical Inheritance
(Note: Java does not support multiple inheritance with classes.)

45. What Is Base Class or Superclass?
The class being inherited from is the superclass (or base class or parent class).

46. What Is Derived Class or Subclass?
The class that inherits from another class is the subclass (or derived/child class).

47. What Is super Keyword in Java?
super is used to access members of the parent class, including:

Parent class constructor: super()

Parent class methods or variables

48. How Many Classes Can Be Extended by One Class?
A class can extend only one class (single inheritance).

49. Why Java Doesn't Support Multiple Inheritance?
To avoid ambiguity (diamond problem) and simplify the design.
Java solves this by using interfaces.

50. What Is Diamond Problem and How to Resolve It in Java?
It occurs in multiple inheritance when a class inherits from two classes with a common ancestor.
Solution: Use interfaces instead of classes.

51. Explain super() Statement in Java:
super() is used in a subclass constructor to call the parent class constructor. It must be the first statement.

52. Difference Between this and super Keyword:

Feature	this	super
Refers to	Current class object	Parent class object
Constructor	Calls current class constructor	Calls parent class constructor

53. Difference Between this() and super() Statement:

Feature	this()	super()
Used for	Calls another constructor in same class	Calls parent class constructor
Must be first?	Yes	Yes

54. Why this() and super() Can't Be Used Together in Constructor?
Because both must be the first statement in a constructor, so only one can be used.

55. Which Type of Parent Class Members Are Not Inherited by Child Class?

Private members

Constructors

Static blocks

56. Is Constructor of Parent Class Inherited by Child Class? Why?
No, but it is called implicitly using super() during object creation.

57. What Is Non-Primitive Type Casting in Java?
Type casting between object types, usually in inheritance scenarios.

58. Upcasting (Generalization) and Downcasting (Specialization):

Upcasting: Subclass to superclass

Animal a = new Dog(); // Implicit
Downcasting: Superclass to subclass

Dog d = (Dog) a; // Explicit
59. Use of Upcasting and Downcasting:

Upcasting: Enables polymorphism

Downcasting: Access subclass-specific methods

60. Why Perform Upcasting?

For generalized code

To handle multiple object types using a common interface/superclass

61. Why Perform Downcasting?

To access subclass-specific members after upcasting

62. What Is Implicit and Explicit Type Casting?

Implicit: Performed automatically by compiler

int x = 10; long y = x;
Explicit: Done manually

double d = 10.5; int i = (int)d;

// Method Overriding
63. What Is Method Overriding in Java?
Method overriding occurs when a subclass provides its own implementation of a method that is already defined in the parent class, with the same name, return type, and parameters.

Example:

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
64. Can We Override a Static Method in Java?
No, static methods cannot be overridden because they belong to the class, not the object.
If you define a static method with the same signature in a subclass, it is method hiding, not overriding.

65. When to Go for Method Overriding? Give Examples.
Use method overriding when you want a subclass to provide a specific implementation of a method defined in the parent class.

Example:

class Vehicle {
    void start() { System.out.println("Vehicle starting"); }
}
class Car extends Vehicle {
    @Override
    void start() { System.out.println("Car starting"); }
}
66. What Is the Benefit of Method Overriding?

Supports runtime polymorphism

Helps in implementing specific behavior in a subclass

Makes code more flexible and extensible

67. Can We Override the main Method in Java? Why?
Technically, yes, you can declare another main method in a subclass, but the JVM always calls the main method of the class specified at runtime. So overriding it serves no practical purpose.

68. Which Method of Parent Class Can't Be Overridden by Child Class?

Final methods

Static methods

Private methods

Constructors

69. Can We Override Constructor of a Class in Java?
No, constructors cannot be overridden because they are not inherited. But they can be overloaded within the same class.

// Polymorphism
70. What is Polymorphism?
Polymorphism means "many forms". In Java, it allows one interface to be used for different underlying data types, enabling objects to behave differently based on their actual class type.

71. What Are the Different Types of Polymorphism in Java?

Compile-Time Polymorphism (Static) – Achieved using method overloading

Run-Time Polymorphism (Dynamic) – Achieved using method overriding

72. Ways to Achieve Compile-Time Polymorphism:

Method Overloading: Same method name, different parameters

Constructor Overloading

Example:

class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}
73. Ways to Achieve Run-Time Polymorphism:

Method Overriding with inheritance and dynamic method dispatch

Example:

class Animal { void sound() { System.out.println("Animal"); } }
class Dog extends Animal { void sound() { System.out.println("Dog"); } }

Animal a = new Dog(); // Runtime polymorphism
a.sound(); // Outputs "Dog"
74. Difference Between Compile-Time and Run-Time Polymorphism:

Feature	Compile-Time Polymorphism	Run-Time Polymorphism
Also called	Static polymorphism	Dynamic polymorphism
Achieved by	Method overloading	Method overriding
Binding time	At compile time	At runtime
Flexibility	Less flexible	More flexible

75. Explain Static Method Dispatch and Dynamic Method Dispatch:

Static Method Dispatch: Method call is resolved at compile time (overloading)

Dynamic Method Dispatch: Method call is resolved at runtime using the actual object type, not reference type (overriding)

76. Why Operator Overloading Is Not Allowed in Java?
To keep Java simple, clean, and maintainable. Operator overloading can lead to confusing and unreadable code, so Java designers avoided it (unlike C++).

77. What Is Method Shadowing and Variable Shadowing?

Method Shadowing: Hiding a static method in a subclass with another static method having the same signature.

Variable Shadowing: When a subclass declares a variable with the same name as one in the parent class, the subclass variable hides the superclass one.

Example:

class A { int x = 10; static void show() { System.out.println("A"); } }
class B extends A { int x = 20; static void show() { System.out.println("B"); } }

// Encapsulation
78. Define Encapsulation. How Is Encapsulation Achieved in Java?
Encapsulation is the process of wrapping data (variables) and code (methods) into a single unit called a class.
It hides the internal details and protects object data from unintended access or modification.

How it’s achieved in Java:

Declare variables private

Provide public getter and setter methods to access and modify them

Example:

class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
79. What Are Getters and Setters in Encapsulation?

Getter method: Returns the value of a private variable

Setter method: Updates or sets the value of a private variable

Example:

public class Student {
    private int age;

    public int getAge() { return age; }
    public void setAge(int a) { age = a; }
}
80. What Is Data Hiding in Java? Why Is It Used?
Data hiding is the technique of restricting access to internal object details using access modifiers like private.
It ensures security, modularity, and control over data.

Why it's used:

To protect object data from unauthorized access

To maintain integrity by allowing data to be accessed only through controlled methods (getters/setters)

// Abstraction
81. What Is Abstraction in Java?
Abstraction is the concept of hiding internal implementation details and showing only essential features of an object.

82. What Are the Different Ways to Achieve Abstraction in Java?

Using Abstract Classes – Class with abstract methods (declared using abstract keyword)

Using Interfaces – All methods in an interface are abstract by default (in older versions of Java)

83. What Is an Abstract Method?
An abstract method is a method that has no body, only a declaration.
It must be implemented in a subclass.

Example:

abstract class Animal {
    abstract void makeSound();
}
84. Can a Static Method Be Abstract?
No, a static method cannot be abstract because abstract methods must be overridden, and static methods cannot be overridden.

85. Can We Make an Abstract Method Private?
No, abstract methods cannot be private because they are meant to be overridden in subclasses, and a private method is not accessible outside its own class.

86. Can We Create an Object of an Abstract Class?
No, we cannot create an object of an abstract class directly. However, we can use it to create a reference and instantiate a subclass.

Example:

abstract class Shape { }
class Circle extends Shape { }
Shape s = new Circle(); // Valid

You said:
87. Are CO{'Struct.ors allowed inside an abst.ract class? Why? 
8·8. Is It mandatory to have abstract•meth9d inside an abstriact class?
ChatGPT said:
Here are the answers for your questions 87 and 88:

87. Are Constructors Allowed Inside an Abstract Class? Why?
Yes, constructors are allowed inside an abstract class.
Why? Because abstract classes cannot be instantiated directly, but their constructors are called when a subclass is instantiated to initialize the abstract part of the object.

88. Is It Mandatory to Have Abstract Methods Inside an Abstract Class?
No, it is not mandatory to have abstract methods in an abstract class.
An abstract class can have zero or more abstract methods. Even if it has no abstract methods, declaring it abstract prevents direct instantiation.

//Final Keyword
89. What Is the Purpose of the final Keyword in Java?
The final keyword is used to restrict the user:

final variable: value cannot be changed once initialized

final method: method cannot be overridden

final class: class cannot be subclassed (inherited)

90. Can We Make an Instance Variable final? What Is Its Use and How Should It Be Initialized?
Yes, an instance variable can be declared final.

It must be initialized at the time of declaration or inside the constructor.

Its value cannot be changed afterward, ensuring constant state for the object.

Example:

final int age;
public Person(int age) {
    this.age = age;
}
91. Can We Override a final Method?
No, final methods cannot be overridden by subclasses.

92. Can We Declare an Abstract Method as final?
No, an abstract method cannot be declared final because abstract methods require overriding, and final methods cannot be overridden.

93. Can a Class Be Declared final? Can a final Class Have a Child Class?

Yes, a class can be declared final.

A final class cannot be subclassed; therefore, it cannot have child classes.

94. When Do We Need to Make a Class Final?

When you want to prevent inheritance for security or design reasons

To ensure immutability (e.g., String class is final)

To improve performance by preventing method overriding (optional)

// Interface
95. What Is an Interface in Java? How Can We Create an Interface?
An interface is a reference type in Java that can contain abstract methods, default methods, static methods, and constants.
It is used to define a contract that implementing classes must follow.

Create with the interface keyword:

public interface Drawable {
    void draw();
}
96. For What Purpose Is an Interface Used?
To achieve abstraction and multiple inheritance in Java, allowing unrelated classes to implement common behavior.

97. What Are the Different Types of Members Allowed Inside an Interface?

Abstract methods (implicitly public and abstract)

Static methods

Default methods (introduced in Java 8)

Constants (public static final variables)

98. Can We Have Instance Variables Inside an Interface?
No, interfaces cannot have instance variables. All variables are public static final constants.

99. Can We Create Object of an Interface?
No, you cannot instantiate an interface directly.

100. Are Constructors Allowed Inside an Interface? Why?
No, interfaces cannot have constructors because they cannot be instantiated.

101. What Are the Different Types of Members Allowed Inside Interface in Java 7 Version?
Only abstract methods and public static final constants.

102. Which Type Member Is Allowed Inside Interface in Java 9 Version?
In Java 9, interfaces can have private methods (both static and instance private methods) to share code within the interface.

103. Explain the Default Method of Interface.
A default method is a method with a default implementation inside an interface, introduced in Java 8, allowing interfaces to evolve without breaking existing implementations.

104. How Is Multiple Inheritance Supported by Interface? Explain.
A class can implement multiple interfaces, thereby achieving multiple inheritance of behavior.

105. Can an Interface Define Non-static Variables?
No, all variables in an interface are implicitly public static final constants.

106. How Many Interfaces Can Be Implemented by One Class?
A class can implement any number of interfaces.

107. Can an Interface Extend a Class?
No, interfaces can only extend other interfaces, not classes.

108. Can We Make an Interface as final?
No, interfaces cannot be declared final.

109. Explain Functional and Marker Interface.

Functional Interface: Contains exactly one abstract method (used for lambda expressions).

Marker Interface: Has no methods, used to mark or tag classes (e.g., Serializable).

110. Difference Between a Class and an Abstract Class:

Class	Abstract Class
Can be instantiated	Cannot be instantiated
Can have full method implementations	Can have abstract and concrete methods
Used for general object	Used for partial abstraction

111. Difference Between a Class and an Interface:

Class	Interface
Can have instance variables and methods	Only abstract, default, static methods, and constants
Supports single inheritance	Supports multiple inheritance via interfaces
Can be instantiated	Cannot be instantiated

112. Difference Between an Abstract Class and an Interface:

Abstract Class	Interface
Can have constructors	No constructors
Can have state (variables)	Only constants
Can have method implementations	Mostly abstract, with default/static methods

113. Real-time Examples of Abstraction/Interface:

Vehicle Interface: with methods like start(), stop() implemented differently by Car, Bike.

Payment Gateway: Interface with processPayment() implemented by Paypal, CreditCard.

114. Explain Briefly All the Four Pillars of Java:

Encapsulation: Wrapping data and methods into a single unit (class) and restricting access via access modifiers.

Inheritance: Mechanism where one class inherits properties and behaviors from another.

Polymorphism: Ability to take many forms; method overloading and overriding.

Abstraction: Hiding complex implementation details and showing only essential features.

// Packages
115. What is a Package? What Are the Benefits of Creating a Package?
A package in Java is a namespace that organizes a set of related classes and interfaces. It helps avoid name conflicts and controls access.
Benefits:

Modularity: Group related classes together

Namespace management: Avoids class name conflicts

Access protection: Can restrict visibility with access modifiers

Reusability: Easier to reuse classes

Maintainability: Easier to manage large codebases

116. Name Some Important Packages in Java

java.lang – fundamental classes (String, Math, System)

java.util – utility classes (Collections, Date, Scanner)

java.io – input/output classes

java.net – networking classes

java.awt and javax.swing – GUI components

java.sql – database connectivity

117. How Are User-Defined Packages Created in Java?

Use the package keyword at the top of the Java source file to declare a package.

Place the source file inside a directory structure that matches the package name.

Example:

package com.example.myapp;

public class MyClass {
    // class code
}
Compile with javac and run using fully qualified class name.

// Access Modifiers
118. What Are Access Modifiers? Why Are Access Modifiers Used?
Access modifiers control the visibility and accessibility of classes, methods, and variables.
They are used to implement encapsulation and protect data from unauthorized access.

119. Explain Public, Protected, Default, and Private Access Modifiers in Java:

public: Accessible from anywhere

protected: Accessible within the same package and subclasses

default (no modifier): Accessible only within the same package

private: Accessible only within the declaring class

120. What Is the Scope of Public Access Modifier?
Accessible from any other class, package, or subclass everywhere.

121. What Is the Scope of Protected Access Modifier?
Accessible within the same package and by subclasses even if they are in different packages.

122. What Is the Scope of Default Access Modifier?
Accessible only within the same package. It is the default if no modifier is specified.

123. What Is the Scope of Private Access Modifier?
Accessible only within the same class where it is declared.

124. Which Access Modifiers Are Not Allowed with Class or Interface?

private and protected are not allowed with top-level classes or interfaces (only public or default is allowed).

125. Can a Constructor Be Private? What Is Its Use?
Yes, a private constructor restricts instantiation from outside the class.
Used in Singleton design pattern or utility classes with static methods only.

126. What Is the Access of Default Constructor?
The default constructor (no-arg) has default access (package-private), accessible only within the same package.

127. Can We Decrease the Visibility of Method in Child Class While Overriding a Method of Parent Class?
No, you cannot reduce the visibility of an overridden method; it must be the same or more visible.

128. Can We Make an Abstract Method as Private?
No, abstract methods cannot be private because they must be implemented by subclasses.

129. Can We Override a Method If It Is Private in Parent Class?
No, private methods are not inherited, so they cannot be overridden.

130. What Are Non-Access Modifiers in Java?
Modifiers that provide information other than access control, e.g., static, final, abstract, synchronized, volatile.

131. Mention Some Non-Access Modifiers in Java with Their Use:

static: Belongs to class rather than instance

final: Prevents modification (variables can't change, methods can't override, classes can't extend)

abstract: Declares abstract class/method without implementation

synchronized: Used for thread safety

volatile: Ensures visibility of changes to variables across threads

// Other
132. Can we use static and abstract keywords together?
No, a method cannot be both static and abstract because:

abstract methods must be overridden in subclasses and belong to instance behavior,

static methods belong to the class and cannot be overridden.

133. What is the difference between static block and non-static block?

Static block: Runs once when the class is loaded. Used for static initialization.

Non-static block (instance initializer): Runs every time an instance is created, before the constructor.

134. What is implicit and explicit constructor call in Java?

Implicit constructor call: When the compiler automatically inserts a call to the superclass constructor (super()) if not explicitly written.

Explicit constructor call: When the programmer explicitly calls super() or this() in a constructor.

135. Describe Outer and Inner class.

Outer class: The main/top-level class.

Inner class: A class defined inside another class. Can access outer class members including private ones.

136. Explain Static Class.
Java doesn’t have static top-level classes, but static nested classes are inner classes declared static. They do not need an instance of the outer class to be created.

137. What is the use of instanceof keyword?
Used to check if an object is an instance of a specific class or interface, returning true or false.

Example:

if(obj instanceof String) { ... }
138. What is the purpose of native keyword?
Indicates that a method is implemented in platform-dependent code (usually C/C++) outside the Java Virtual Machine.

139. What is the purpose of strictfp keyword?
Used to restrict floating-point calculations to ensure portability and consistent results across different platforms by following IEEE 754 standards.

// Object Class
140. Describe Object class.
The Object class is the root superclass of all classes in Java. Every class implicitly extends Object if no other superclass is specified. It provides basic methods like toString(), equals(), hashCode(), and finalize().

141. Describe toString(), hashCode(), and equals() methods of Object class.

toString(): Returns a string representation of the object (default is className@hashcode).

hashCode(): Returns an integer hash code value for the object, used in hashing data structures like HashMap.

equals(Object obj): Checks if the current object is equal to another object (default compares memory addresses).

142. Why do we need to override toString() method of Java?
To provide a meaningful string representation of the object, useful for debugging and logging, instead of the default which prints the class name and hash code.

143. What is hashCode() method in Java?
It returns an integer hash code that represents the object, used in hashing-based collections (like HashMap and HashSet) to quickly locate objects.

144. Why do we need to override equals() method of Object class?
Because the default equals() method compares references (memory locations), overriding it allows comparing object content or logical equality instead.

145. What is the purpose of finalize() method of Object class?
finalize() is called by the garbage collector before an object is destroyed, allowing cleanup of resources.
Note: It’s deprecated and generally discouraged due to unpredictability and performance issues.

// Other Important Question
146. What is Wrapper class?
A Wrapper class in Java provides an object representation for primitive data types. Examples: Integer for int, Double for double.

147. Explain Boxing and Unboxing in Java.

Boxing: Converting a primitive type to its corresponding wrapper object (e.g., int to Integer).

Unboxing: Converting a wrapper object back to a primitive type.

148. What is the meaning of String[] args in main method? Why is it used?
It represents command-line arguments passed to the program as an array of strings. Used to receive input from the user when the program starts.

149. Describe Command line arguments in Java.
Command line arguments are strings passed to the program at runtime via String[] args in the main method. They allow users to influence program behavior.

150. What is varargs method? Explain how it is used?
Varargs (variable-length arguments) allow passing zero or more arguments of the same type to a method using ....
Example:

void printNumbers(int... numbers) { }
151. Explain static import statement in Java.
static import allows accessing static members (fields or methods) of a class directly without class name prefix.
Example:

import static java.lang.Math.*;  
double r = sqrt(25);
152. What is a Java Bean class? What is its use?
A Java Bean is a reusable software component that follows conventions: private fields, public getters/setters, a no-arg constructor, and serializable. Used in frameworks for encapsulation and easy manipulation.

153. What is immutable class? What is its use and how to create it?
An immutable class is a class whose objects cannot be changed once created.
Use: Thread safety, security.
How to create:

Make class final

Private final fields

No setters

Initialize fields via constructor only

154. What is singleton class? How to create it and what is its use?
A singleton class allows only one instance of the class to be created.
Use: Controlled access to resources (e.g., configuration, logging).
How to create:

Private constructor

Static private instance

Public static method returning the instance

155. Mention important features of Java 8 version.

Lambda expressions

Stream API

Functional interfaces

Default and static methods in interfaces

New Date/Time API

Optional class

156. Explain lambda expression introduced in Java 8 update.
Lambda expressions provide a concise way to represent anonymous functions (functional programming). They enable passing behavior as method arguments.

Example:

(numbers) -> numbers.stream().mapToInt(Integer::intValue).sum();

// String
1. What is String in Java?
A String in Java is an object that represents a sequence of characters. It is a class in the java.lang package and is used extensively for text manipulation.

2. Why is the String class final?
The String class is declared as final to:

Prevent inheritance

Ensure immutability and thread-safety

Prevent security issues like altering file paths or URLs at runtime

3. What is the meaning of immutable in terms of String?
An immutable object is one whose state (data) cannot be changed once it is created. For String, this means that once a String object is created, its value cannot be changed.

4. Why is a String object immutable in Java and what is its advantage?
Why:

Strings are stored in the String Constant Pool (SCP). If mutable, one change could affect all references to that string.

Advantages:

Security (used in class loading, network credentials)

Thread-safety (can be shared without synchronization)

Performance (can reuse from SCP)

Caching hashcode improves performance in collections like HashMap

5. What are the different ways to create a String object?
Using a String literal:


String s1 = "Hello";
Using the new keyword:

String s2 = new String("Hello");
6. What is the String Constant Pool (SCP) in Java?
The SCP is a special memory region in the Java heap where string literals are stored. When you create a string literal, the JVM checks the SCP first:

If it exists, it reuses it.

If not, it creates a new one.

7. What is the difference between these two String objects?
String s1 = "abcde";
String s2 = new String("abcde");
s1: created in the SCP

s2: creates a new object in the heap even if "abcde" exists in the SCP

So, s1 == s2 → false, but s1.equals(s2) → true

8. What is StringBuilder and StringBuffer in Java?
Both are mutable classes used for modifying character sequences.

StringBuilder is not synchronized (faster, but not thread-safe).

StringBuffer is synchronized (thread-safe, slightly slower).

9. Why is String not eligible for automatic garbage collection in Java?
Actually, String objects are eligible for garbage collection just like any other object if:

They are not referenced anymore.
However, string literals in SCP may remain until the JVM shuts down because they are interned.

10. Which interfaces are implemented by the String class?
Serializable

Comparable<String>

CharSequence

11. What is the difference between == (equals operator) and .equals() method in Java?
== → compares references (memory locations)

.equals() → compares values (content)

Example:

String a = "hello";
String b = new String("hello");

a == b        // false
a.equals(b)   // true
12. What is a mutable string in Java?
A mutable string can be modified after it's created. Java provides:

StringBuilder

StringBuffer
Both allow changes without creating new objects.

13. Why are StringBuffer objects mutable in Java?
Because they maintain a mutable character array internally, allowing changes like appending, inserting, or deleting characters directly, which improves performance in repeated modifications.

14. Why do we need StringBuilder in Java?
StringBuilder is used to create mutable (modifiable) strings in Java. It helps when we need to perform many modifications (append, insert, delete, replace) on strings without creating new objects each time (which happens with immutable String).

Advantages of using StringBuilder:

Better performance for frequent string manipulation

Reduces memory overhead caused by creating multiple String objects

15. Which class is more preferable: StringBuffer or StringBuilder? Why?
Prefer StringBuilder when working in a single-threaded environment because it is faster.

Use StringBuffer when thread safety is needed because its methods are synchronized.

So, StringBuilder is more preferable in most cases due to its performance advantage unless synchronization is required.

16. When should you use StringBuilder?
Use StringBuilder when:

You're performing many modifications on strings (loops, concatenation, inserts).

You're working in a single-threaded environment.

You want to optimize performance and memory usage compared to using immutable String.

17. Mention the difference between String, StringBuilder, and StringBuffer class.
Feature	String	StringBuilder	StringBuffer
Mutability	Immutable	Mutable	Mutable
Thread Safety	Not thread-safe	Not thread-safe	Thread-safe
Performance	Slow (creates new object every time)	Fast (no synchronization)	Slower (due to synchronization)
Synchronization	Not required	Not synchronized	Synchronized
Use Case	Read-only or few modifications	Many modifications in single-threaded code	Many modifications in multithreaded code

// Exception Handling
**1. What is Exception in Java?**
An exception is an unwanted or unexpected event that disrupts the normal flow of a program. It is an object that represents an error.

**2. What is Exception Handling in Java?**
Exception handling is a mechanism to handle runtime errors so the program can continue its normal execution.

**3. Types of Exceptions in Java:**

* Checked Exceptions
* Unchecked Exceptions
* Errors

**4. Difference between Checked and Unchecked Exceptions:**

* Checked: Detected at compile-time (e.g., IOException).
* Unchecked: Detected at runtime (e.g., ArithmeticException).

**5. Examples:**

* Checked: SQLException, FileNotFoundException
* Unchecked: NullPointerException, ArrayIndexOutOfBoundsException

**6. Exception Hierarchy:**

* Throwable

  * Exception

    * Checked
    * Unchecked
  * Error

**7. Supermost class of all exceptions and errors:**
`Throwable`

**8. Supermost class of all exceptions:**
`Exception`

**9. Why does an exception occur?**
Due to programming mistakes like dividing by zero, accessing invalid array indices, or null references.

**10. Difference between Exception and Error:**

* Exception: Recoverable, user mistakes
* Error: Irrecoverable, system failures (e.g., OutOfMemoryError)

**11. Advantage of Exception Handling:**
It maintains normal flow of application and helps with debugging.

**12. NullPointerException:**
Occurs when trying to use a null reference.

**13. ClassCastException:**
Occurs when trying to cast an object to a subclass it doesn't belong to.

**14. What happens when an exception occurs?**
The normal flow is interrupted, and the control is transferred to the nearest catch block.

**15. Ways to Handle Exception:**

* try-catch block
* throws keyword
* custom exceptions

**16. What does JVM do?**
JVM wraps the exception in an object and looks for an appropriate catch block.

**17. Try-Catch Block:**
Encapsulates code that might throw an exception and provides code to handle it.

**18. How many exceptions from try block?**
Only one exception can be thrown at a time.

**19. Catch blocks per try block?**
Multiple catch blocks are allowed to handle different exceptions.

**20. How many try-catch blocks in a program?**
Any number.

**21. Nested try-catch block:**
A try block inside another try block.

**22. Finally Block:**
Used for code that must be executed regardless of exception (like closing resources).

**23. Try without Catch?**
Yes, but only if followed by finally.

**24. Throw Keyword:**
Used to explicitly throw an exception.

**25. Throws Keyword:**
Declares exceptions that can be thrown by a method.

**26. Difference between throw and throws:**

* throw: used to throw an exception
* throws: used to declare exceptions

**27. printStackTrace():**
Prints exception name, description, and stack trace.

**28. When finally won’t execute:**

* System.exit()
* JVM crashes

**29. Custom Exception:**
User-defined exception by extending Exception class.

**30. Exception object after handling:**
It becomes eligible for garbage collection.

31. Define Unreachable Catch Block Error in Java:
An Unreachable Catch Block error in Java occurs when a catch block is written for an exception type that can never be thrown in the corresponding try block, usually because a more general exception type is caught before a more specific one.

✅ Example of Unreachable Catch Block:
try {
    int x = 10 / 0;
} catch (Exception e) {
    System.out.println("General exception caught");
} catch (ArithmeticException ae) { // ❌ Unreachable
    System.out.println("Arithmetic exception caught");
}
❌ Why this is wrong:
ArithmeticException is a subclass of Exception.

Since Exception is caught first, the second catch block is never reachable.

Java compiler throws a compile-time error: "Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception."

✅ Corrected Version:
try {
    int x = 10 / 0;
} catch (ArithmeticException ae) {
    System.out.println("Arithmetic exception caught");
} catch (Exception e) {
    System.out.println("General exception caught");
}

// Collection Framework
1. **What is Collection Framework?**

   * A Collection Framework in Java is a set of classes and interfaces that implement commonly reusable collection data structures like lists, sets, and maps.

2. **What are the different hierarchies of the collection framework?**

   * Interfaces: Collection, List, Set, Queue, Deque, Map
   * Classes: ArrayList, LinkedList, HashSet, TreeSet, LinkedHashSet, PriorityQueue, HashMap, TreeMap, LinkedHashMap, Stack, Vector

3. **What are the differences between Collection and Array?**

   * Arrays are fixed in size, collections are dynamic.
   * Arrays can store both primitives and objects, collections store only objects.
   * Collections provide more methods for manipulation and are part of Java's Collection Framework.

4. **What is List? Explain its features.**

   * List is an ordered collection that allows duplicate elements.
   * Features: Maintains insertion order, can access elements via index, allows duplicates.

5. **Explain the features of ArrayList.**

   * Resizable array, allows duplicate elements, maintains insertion order, fast access via index.

6. **For which requirements is ArrayList best recommended to use?**

   * When frequent access operations are needed and insert/delete operations are minimal.

7. **What is the difference between Array and ArrayList?**

   * Arrays are fixed in size and type-safe for primitives; ArrayList is resizable and only stores objects.

8. **How does ArrayList grow?**

   * ArrayList increases its size by 50% of the current capacity when it exceeds its limit.

9. **What is the internal implementation of data structure used by ArrayList?**

   * It uses a dynamic array.

10. **Explain LinkedList and its features.**

    * Doubly linked list implementation, allows insertion/deletion from both ends, maintains insertion order.

11. **For which requirements is LinkedList best recommended to use?**

    * When frequent insertion and deletion operations are needed.

12. **What are the different interfaces implemented by LinkedList?**

    * List, Deque, Queue, Cloneable, Serializable.

13. **What are the differences between ArrayList and LinkedList?**

    * ArrayList is faster for access; LinkedList is faster for insert/delete.

14. **Explain Vector and its features.**

    * Synchronized version of ArrayList, thread-safe, grows by doubling its size.

15. **What are the differences between ArrayList and Vector?**

    * Vector is synchronized, ArrayList is not.

16. **Explain Stack and its features with some of its methods.**

    * Stack is a subclass of Vector, follows LIFO.
    * Methods: push(), pop(), peek(), empty()

17. **Explain Set and its features.**

    * Set doesn't allow duplicate elements, no positional access.

18. **What are the differences between List and Set?**

    * List allows duplicates and is ordered; Set doesn’t allow duplicates and is unordered.

19. **Explain HashSet implementations in details along with its features.**

    * HashSet uses a hash table, doesn't guarantee order, allows null, uses hashing mechanism.

20. **What is Hashing?**

    * Hashing is a technique to convert an object into an integer (hash code) to determine the bucket for storage.

21. **Explain LinkedHashSet implementations in detail.**

    * Maintains insertion order using a linked list with hashing mechanism.

22. **Explain TreeSet implementations in detail.**

    * Implements NavigableSet, uses Red-Black tree, stores elements in sorted order.

23. **Describe the differences between HashSet, LinkedHashSet and TreeSet.**

    * HashSet: No order, fastest.
    * LinkedHashSet: Maintains insertion order.
    * TreeSet: Sorted order, slower.

24. **What is a Queue? Explain its features.**

    * Queue is used to hold elements prior to processing.
    * Follows FIFO, methods include offer(), poll(), peek().

25. **Explain various Queue implementations in detail.**

    * PriorityQueue: Orders based on priority.
    * LinkedList: As Queue supports FIFO.

26. **What is Iterator? How to use it?**

    * Iterator is used to traverse elements in a collection.
    * Methods: hasNext(), next(), remove()

27. **What is ListIterator? How to use it?**

    * Extends Iterator, allows bidirectional traversal of lists.
    * Methods: hasPrevious(), previous(), add(), set()

28. **What are Comparator and Comparable interfaces?**

    * Used for sorting objects.
    * Comparable: Single sorting logic (compareTo method).
    * Comparator: Multiple sorting logic (compare method).

29. **Which collection class helps to achieve sorting for custom objects?**

    * TreeSet or Collections.sort() using Comparable or Comparator.

30. **Explain the use and flow of how to achieve sorting for custom objects.**

    * Implement Comparable or Comparator and define sorting logic, then use Collections.sort() or TreeSet.

31. **What is Comparator interface and how is it used to achieve sorting for custom objects?**

    * Comparator is an interface used to define multiple sorting logics for objects. It overrides the `compare(T o1, T o2)` method. You can pass a Comparator object to `Collections.sort()` or TreeSet constructor to sort objects based on specific fields.

32. **Describe the differences between Comparable and Comparator interfaces.**

    * Comparable defines natural ordering, Comparator defines custom ordering.
    * Comparable is implemented in the class; Comparator is passed externally.
    * Comparable uses `compareTo()`, Comparator uses `compare()`.

33. **What is Map? How are objects stored in Map?**

    * A Map is an object that maps keys to values. It doesn't allow duplicate keys but allows duplicate values. Objects are stored as key-value pairs.

34. **What is HashMap and explain its implementations along with features.**

    * HashMap stores key-value pairs using a hashing mechanism. It allows one null key and multiple null values, does not maintain order, and provides constant-time performance for basic operations.

35. **What is LinkedHashMap and explain its implementations along with features.**

    * LinkedHashMap maintains a linked list of entries in insertion order. It inherits from HashMap and maintains predictable iteration order.

36. **What is TreeMap and explain its implementations along with features.**

    * TreeMap implements NavigableMap and is based on Red-Black tree. It stores entries in sorted order based on natural ordering or a custom comparator.

37. **How to run loop on Map?**

    * You can iterate over a Map using:

      * `for (Map.Entry<K, V> entry : map.entrySet()) {}`
      * `for (K key : map.keySet()) {}`
      * `map.forEach((k, v) -> {})`

// Multitheading
1. **What is a Process?**

   * A process is an independent executing instance of a program. It has its own memory space and system resources.

2. **What is a Thread?**

   * A thread is a lightweight subprocess, the smallest unit of processing. It shares the process's memory and resources.

3. **Explain Thread properties.**

   * Threads have properties like ID, priority, name, daemon status, and execution state.

4. **What is multithreading?**

   * Multithreading is the concurrent execution of two or more threads to maximize CPU utilization.

5. **What are the advantages of multithreading?**

   * Increases application responsiveness
   * Efficient CPU utilization
   * Enables parallel execution
   * Better resource sharing

6. **What are the different ways of creating a thread?**

   * By extending the `Thread` class
   * By implementing the `Runnable` interface

7. **How a thread starts in Java?**

   * By calling the `start()` method on a Thread instance.

8. **What are the different stages of a thread lifecycle?**

   * New → Runnable → Running → Blocked/Waiting → Terminated

9. **What is thread priority? What is the range of thread priority and what is the default priority?**

   * Thread priority determines the order of thread execution.
   * Range: 1 (MIN\_PRIORITY) to 10 (MAX\_PRIORITY)
   * Default: 5 (NORM\_PRIORITY)

10. **What is the first thread created by JVM when a program starts its execution?**

    * The `main` thread.

11. **What is the use of Runnable interface?**

    * It provides a target for a thread and is implemented to define a thread's execution code.

12. **Explain `sleep()` method of Thread class.**

    * `sleep(milliseconds)` pauses the current thread for a specified time.

13. **Explain `join()` method of Thread class.**

    * Causes the current thread to wait until another thread finishes execution.

14. **What is thread-safe environment? How is it achieved?**

    * Thread-safe code ensures data consistency in multithreaded access.
    * Achieved using synchronization, locks, concurrent classes.

15. **What is Object lock? When it gets created?**

    * A lock associated with an object, acquired when a synchronized method/block is executed.

16. **Explain class lock. When it gets created?**

    * Lock on the class's Class object, acquired by static synchronized methods.

17. **What is thread deadlock?**

    * A condition where two or more threads wait indefinitely for resources locked by each other.

18. **Explain how to overcome thread deadlock?**

    * Avoid nested locks, use timeout, lock ordering, deadlock detection tools.

19. **What is inter-thread communication? How to achieve it?**

    * Communication between threads using shared resources.
    * Achieved using `wait()`, `notify()`, and `notifyAll()` methods.

20. **Explain `wait()` method.**

    * Causes the current thread to wait until another thread calls `notify()` or `notifyAll()` on the same object.

21. **Explain `notify()` and `notifyAll()` methods.**

    * `notify()` wakes one waiting thread; `notifyAll()` wakes all threads waiting on the object.

22. **What is thread Synchronization? How is it achieved?**

    * Thread synchronization ensures only one thread accesses a shared resource at a time.
    * Achieved using synchronized methods/blocks and explicit locks.

23. **What is a daemon thread?**

    * A daemon thread runs in the background and does not prevent the JVM from exiting.

24. **What are the differences between user thread and daemon thread?**

    * User thread: Main thread performing core tasks.
    * Daemon thread: Runs background tasks; terminates when all user threads finish.

25. **How to pause execution of current thread?**

    * Using `Thread.sleep(milliseconds)`.

26. **What is the use of volatile keyword?**

    * Ensures visibility of changes to variables across threads. Prevents caching of variables locally in threads.

// File Handling
1. What is serialization and de-serialization process?

Serialization is the process of converting an object into a byte stream so that it can be easily saved to a file, sent over a network, or stored in a database.

De-serialization is the reverse process where the byte stream is converted back into a copy of the original object.

This process is useful for persisting objects or for communication between different parts of a system (e.g., client-server).

2. What is the use of transient keyword?

The transient keyword in Java is used to mark a member variable so that it will not be serialized during serialization.

When an object is serialized, transient fields are ignored and are not part of the serialized representation.

This is useful for sensitive data like passwords or for fields that can be recalculated or are not necessary to save.

// Others
1. What are the differences between final, finally, and finalize() in Java?
Keyword/Method	Description	Usage Example
final	A keyword used to declare constants, prevent method overriding, and inheritance of classes.	final int x = 10;
final class MyClass {}
finally	A block that always executes after try-catch, used for cleanup code.	java try { ... } catch(Exception e) { ... } finally { ... }
finalize()	A method called by the garbage collector before an object is destroyed, used for cleanup. (Deprecated in recent Java versions)	java protected void finalize() { ... }

2. Explain the use of garbage collector.
Automatically frees memory by destroying objects no longer referenced.

Helps prevent memory leaks and manual memory management.

Runs in the background without user intervention.

3. Can we call garbage collector explicitly?
You can request garbage collection using System.gc() or Runtime.getRuntime().gc().

The JVM may or may not run garbage collection immediately; it is only a suggestion.

4. Why pointers are not used in Java?
To enhance security and simplicity.

Prevents memory corruption, dangling pointers, and buffer overflows.

Java manages memory references internally, avoiding direct pointer manipulation.

5. Explain Java features.
Platform Independent: Java bytecode runs on any platform with JVM.

Object-Oriented: Supports encapsulation, inheritance, polymorphism.

Simple & Secure: No pointers, strong memory management, runtime checks.

Robust: Exception handling, garbage collection, strong type checking.

Multithreaded: Supports concurrent programming.

High Performance: JIT compiler improves execution speed.

Distributed: Built-in networking capabilities.

Dynamic: Supports runtime class loading and reflection.