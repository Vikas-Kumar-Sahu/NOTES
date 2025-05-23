# Array is a group of similer types of data.

# Features of Array :-
1. Array is non-primitive type of data.
2. Array represents an object inside heap area.
3. By using array we can store primitive type data and non-primitive type data.
4. Array fixed in size we can't change when Array is created.
5. Array does't have support of inbuild methods so the code written in array becomes larger in size and complexity.
6. Array does't provide good memory management becuase once array is created it starts occupeing the space.
7. Array provide fast performance.

Exp-    int[] a = {12,24,53,25};
        inr[] b = new int[10];
        sop(a.length);   // 4
        sop(b.length);   // 10
        String s1 = "Mohan and Sohan";
        sop(s1.length());   // 15
        String[] p = {"Mohan","Soahn","John"};
        sop(p.length); = 3
        sop(p[0]); = "Mohan"
        sop(p[0].length()); = 5
# Note - Array has length variable but string has length method.

8. Array is a index based data structure so we can store element, access element or update the element by using the indexing.
index start from the 0  and the last index is always 1 less than the total lentgh.
    int[] a = {12, 18, 30, 40, 18};
    a -> 12 18 30 40 18
         0  1  2  3  4
    sop(a[0]); = 12

# Different ways to create Array
Array can be created two ways
1. Without using new keyword.
2. With using new keyword.

# Without using new keyword
we can create a array just by using {} and a group of values inside them.
In this manner one array object gets created inside in heap area with the provided value.



int[] arr = {12,8,5,12,5,12,10,12,12};
int temp = arr[n-1](8);
arr[i](8) = arr[i-1](7);
arr[0] = temp;
