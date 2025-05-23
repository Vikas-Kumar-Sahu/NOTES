# String :-
    string is a group of character and a sequence of character.
    string can be created in three ways -
    1.) String Class    2.) StringBuilder Class     3.) StringBuffer Class

    exp :-
        String s1 = new String("mohan");
        StringBuilder s2 = new String("mohan");
        StringBuffer s3 = new String("mohan");

        sop(s1);
        sop(s2);
        sop(s3);

# String Class :-
    String is a class which is avilable in java.lang package to help in creating String type Object.

# Features of String Class :-
1. String is final type class so that it can't be extended by any class and it's method can't be overridden.
2. String is a non-primitive type data.
3. String is a immutable type Object which can't be modified once it's created.
4. String is sequence of character which can be compared with another String.

Qn.) Explain the statement String is immutable ?
    Once a String Object is created then it can't be modified internally. Every time a new String is created and it's assign to String reference. Because String can't be modified after it's creation that's why String is called immutable.

    EXp :- 
        String s1 = "mohan";    // it's unchanged
               s1 = "sohan";   // it's unchanged
               s1 = s1+"singh";    // new String is created every time when we try to change the String Value

# Different Ways to create String Object By Using String Class :-
1. By Using String literals
2. By Using new keyword
3. By Using char sequence

# By Using String literals :-
    we can create String Object by Using String literals and it that case String is created in a dedicated area which is called String constant pool.
    In String constant pool only unique Objects are created.
    Exp :- 
        String s1 = "mohan";
        String s2 = "sohan";
        String s3 = "mohan";
        String s4 = "Mohan";
        String s5 = "mohan";
        String s6 = "john";
        String s7 = "john";

        s1,s3,s5 => ["mohan"]
        s2 => ["sohan"]
        s4 => ["Mohan"]
        s6 => ["john]

# String constant Pool :-
    String constant pool is a special memory block inside heap area which is used to create String Objects when String is created by Using String literals.
    In String constant pool only unique Objects are created if a String is created by Using String literals then first it's checked whether string constant pool is Object or not. if Object with same detail is not avilable in string constant pool then only new String Object is created in String constant pool.

2.) String Object Creation by Using new keyword :-
    We can create String Object by Using new keyword so in this case first Object gets created inside heap area and then Object will be created inside String constant pool if String constant pool is does't contain Objectwith the same detail.

    Exp :-
    String s1 = new String("mohan");
    String s2 = new String("sohan");
    String s3 = new String("mohan");
    s2 = "john";
    s2 = "mac";
    String s4 = "mohan";

# == and equals() :-
    == is a relational operator which is used to compare two primitive type Values. In case of non-primitive data == compares Object reference and it Object reference are Different then it's return false.
    equals is a method which is used to compare the internal contents of two non-primitive data.
    NOTE :-
        == is used to compare to primitive type data while equals() is used to compare to non-primitive data.
    Exp :-
        sop(s1 == s4);  // false
        sop(s1.equals(s4));     // true

# String Object Creation By Using Char Sequence :-
    We can create a string Object directly by passing char[] on string constructor.
    Exp :-
        Char[] a = {'m','o','h','a','n'};
        String s1 = new String(a);
        sop(s1);        // mohan

Q.) Why String constant pool is not eligble for automatic garbage collection?
    String is a frequently used datatype so the unique type of string get stored in String constant pool and automatic garbage collection is not allowed here so that whenever String will be required we will not required create again and again.
    String will be already avilable in String constant pool which will improve the performance at run time.

Q.) Calculate the length of a string without using length() ?
1. By using method toCharArray();
    toCharArray is a method of String which gives all the character of the String in Array form. 
    we can use length variable of Array to get the length.
    String s1 = "mohan";
    Char[] a = s1.toCharArray();
    sop(a.length);  // 5

2. we can get the length of string by running a infinte for loop and by using try catch block.
    public static int getLength(String s){
        int length = 0;
        try {
            for(int i=0; ;i++){
                s.charAt(i);
                length++;
            }
        } catch (Exception e) {
            return length;
        }
    }

3.  public static int getLen(String s){
        s = s + '\0';
        int length = 0;
        for(int i=0; ;i++){
            if (s.charAt(i) == '\0')
                return length; 
            length++;
        }
    }

4.  s1=s1+'\0';
    System.out.println(s1.lastIndexOf('\0'));

    
class Solution {
    public int FirstUniqueChar(String S) {
        int[] a = getFreq(s);
        for(int i=0; i<s.length();i++) {
            char c = s.charAt(i);
            if(a[c-97] == 1)
                return i;
        }
        return -1;
    }
    public static int[] getFraq(String s) {
        int[] a = new int[26];
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            a[c-97]++;
        }
        return a;
    }
}

# Split(String regex) :-
    Split method takes regular expression as an arguments and it gives reluntent split value in string form.

    Exp:-
        String s1 = "mohan is here";
        String[] b = split(" ");     // [[mohan][is][here]]
        sop(b.length);      // 3
        for(String p:b)
            sop(p);     // mohan is here

Note-
    String is a immutable object which we can't be hanged or modified once it is created. java provides two cluase such as 
    1. String Builder
    2. String Buffer
    Which provides a mutuable string that can change or get modified again and again.

# String Builder :-
    this is a class which is used to create to mutuable string Objects.

    Exp:-
        StringBuilder s1 = new StringBuilder("mohan");
        String s2 = "john";
        String s3 = new String("john");
        StringBuilder s4 = new String("s1");
        StringBuilder s5 = new String("s2");

    