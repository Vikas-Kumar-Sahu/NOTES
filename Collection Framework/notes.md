1. Collection Framework is a group of many interfaces and classes which works together to store a group of elements and perform crud opertaions efficiently.
2. Collection Framework is available in java.util package we have to import java.util package to use the collection framework interfaces and the classes.
 
# DIFFERNCE BETWEEN ARRAY AND COLLECTION FRAMEWORK
1. In Array we can store only similer type of elements but in collection framework we can store hetrogenious types of elements.
2. Array is fixed in size but collection framework is dynamic which can grow or srync as per requirements.
3. Array is not good in memory management but collection framework is best for memory management.
4. Array does't have any support of inbuilt methods so code complexity increases in array but collection framework provides a large amount of inbuilt features by which code becomes simple and more readable.
5. In Array we can store primitive or non-primitive data but in collection framework only non-primitive data or object type data is allowed to store.
6. Array provide faster performence but collection framework is slower in performance than array.

To overcome the above mentionted limitation of array java provide collection framework with two diff hierarchy
1. Collection Hierarchy      
2. Map Hierachy

# Collection Hierarchy :-
Collection hierachy in java.util package it conatins various interfaces and classes which are used to store a group of objects and perform crud operations. The top most interface in collection hierarchy is Iterabel and it is extended by collection interface.*

Collection Interface has three child interface
1. List
2. Set
3. Queue

# Collection Interface :-
Collection is an Interface available in java.util package which is used to store a group of objects and perform crud operations efficiently.

# Creation of Collection :-
We can create object of any class on collection reference so that a Collection will be created where we can store a group of Objects.
Exp :- Collection c1 = new ArrayList();
       Collection c1 = new LinkedList();
       Collection c1 = new Hashset();
       Collection c1 = new Treeset();

# Methods of Collection :-
1. To add:-
        a) add(Object o):-
        by this method we can add one object or one element into collection.
        Exp:- c1.add(14);     c1.add(15);     c1.add(16);

        b) addAll(Collection c):-
        by this method we can add a group of objects into collection.
        Exp:- c2.addAll(c1);

    Notes:-
        if elements are added then it will return true otherwise it return false.
    
2. To Remove:-
        a) remove(Object):-
        this method will remove the first occurence of the given objects if the element is found. if element is not found then element will not be remove and false will be return.
        Exp:- c1 = [12,18,15,18,20,12,17,12,15];
              c2 = [12,15,18];
            c1.remove(c2);
            sop(c1); // [18,20,12,17,12,15]

        b) removeAll(Collection c):-
        by this method all the elements of a given Collection will be removed.
        Exp:- c1 = [12,18,15,18,20,12,17,12,15];
              c2 = [12,15,18];
            c1.removeAll(c2);
            sop(c1); // [20,17]
        
        c) retainAll(Collection c):-
        by this method all the elements of given collection will be retained.The other type of element will be removed from Collection.
        Exp:- c1 = [12,18,15,18,20,12,17,12,15];
              c2 = [12,15,18];
            c1.retainAll(c2);
            sop(c1); // [12,18,15,18,12,12,15]

        d) clear():-
        by this method all the elements of a Collection will be removed.
        Exp:- c1 = [12,18,15,18,20,12,17,12,15];
            c1.clear();
            sop(c1); // []

3. To Search:-
        a) Contains(Object o):-
        by this method we can search wheather a given element is available in the Collection or not. the element will return true if element is available or it will return false.
        Exp:- c1 = [12,18,15,18,20,12,17,12,15];
              c1.Contains(15); // true
              c1.Contains(16); // false 

        b) ContainsAll(Collection c):-
        by this method we can checked whether a group of elements are available in Collection or not.
        Exp:- c1 = [12,18,15,18,20,12,17,12,15];
              c2 = [12,15,18];
              sop(c1.ContainsAll(c2));  // true

4. Other Method:-
        a) size():-
        by this method we can get the size of collection.

        b) isEmpty():-
        by this method we can checked whether Collection is empty or not.

        c) hashCode():-
        this method gives hashCode value of the Collection.

        d) toArray():-
        by using this method we can convert the elements of Collection into Array.
        Exp:- c1 = [12,18,15,18,20,12,17,12,15];
              Object[] x = c1.toArray();

        e) iterator():-
        iterator is a method which is used to create curser on Collection. By using the curser we can iterate over the Collection one by one.

# Design of Iterator Method:-
    public Iterator iterator(){
    // (Iterator is return type) , (iterator is method name)
    }

# Iterator(I):-    
    iterator is an interface available in java.util package. iterator interface provide some important method which are used to operate on iterator curser.

# Methods of Iterators:-
1. hasNext():-
    this method will return true if element is available at current position of curser otherwise it will return false.

2. next():-
    this method will return the element at current position of curser at after that curser will be shifted to the next position.

3. remove():-
    this method will remove the element from current position of curser.

# Iterator Curser Creation and It's Use:-
    we can create itertor curser by calling Iterator method. Once curser is created then we can use this curser loop to access the element one by one.
    Exp:-  Collection c = new ArrayList();
            c -> [12,18,10,15,16,30,40];
            Iterator itr = c.iterator();    // it create curser at the first position of curser
            while(itr.hasNext){
                sop(itr.next);  // o/p:- 12 18 10 15 16 30 40
            }

# Exp Program to understand iterator():-    
1.  class Fruit{
        public String test(){
            return "Mohan is Here";
        }
    }

    class drive{
        public static void main(String[] args) {
            Fruit f1 = new Fruit();
            String s1 = f1.test();
            sop(s1.length());   // 13
            sop(s1.charAt(3));  // a
            sop(s1.toUpperCase());  // MOHAN IS HERE
        }
    }

2.  class Fruit{
        public Fruit fruit(){
            return new Fruit();
        }
        public void eat(){

        }
        public void makeJuice(){

        }
    }

    class drive{
        public static void main(String[] args){
            Fruit f = new Fruit();
            Fruit x = new Fruit();
                            // x have access like f -> [fruit() -> eat() -> makeJuice()]
            x.eat();
            f.makeJuice();
        }
    }

Q.1) Design a method which will accept a Collection and will remove all the String type element from Collection.
Q.2) Design a method which will accept a Collection and will remove all the String which are not the string.
Q.3) Design a method which will accept a Collection and will remove all the integer from a collection.
Q.4) Design a method which will accept a Collection and will remove all the String which are not the integer.
Q.5) Design a method which will count the integer elements available in a Collection.
Q.6) Design a method which will count even integer numbers froam a Collection.
Q.7) Design a method which will print the sum of all integer number from Collection.
Q.8) Design a method which will print the sum of all the even integer number from Collection.
Q.9) Design a method which will print the biggest and smallest integer number from Collection.

# Run a loop through Collection:-
1.) for loop
2.) for-each loop/Enhanced for loop
3.) Iterator

1.) for loop:-
    for loop is used to access element one by one on index based data structure such as Array, List, ArrayList etc.
    When indexing is not available then we can't run normal for loop. We can run for loop only if Collection is converted into Array in case Collection does't have Indexing.
Exp:-
    int[] a = {12, 18, 17, 15, 40};

    [12, 18, 17, 15, 40]
     0   1   2   3   4  // Indexing is Available

    for(int i=0; i<a.lentgh; i++)
        sop(i);

2.) for-each loop:-
    For each loop is used to iterate array or Collection elements one by one.
    Syntax:-
        for(datatype var_name : Array(Collection Reference)){
            // loop body
        }

    Exp:-
        c1 = [12,18,30,45,47];
        for(object x : c1){
            sop(x);                 // 12 18 30 45 47
        }

    Note:-
        1.) When for each loop runs on a Collection then internally a cursor is generated on Collection. while cursor is created on Collection then we can't modify the Collection. if we will try to modify then execution will be terminated and it will give exeception called "concurrentModificationException".
        2.) Iterator cursor is applicable to all the collection so it is called "universal cursor".
        3.) we are provideed Iterator curser becuase it provides more control and flexibility over for each loop.

# List(Interface):-
    List is an interface which extends Collection interface.

    features of List:-
        1.) List is an index based data structure so that we can add, remove, search, or update the element of list by using the index.
        2.) List allowed duplicate element to be added.
        3.) We can store multiple null elements into list.
        4.) List maintains the insertion order of the elements. so elements will be accessed in the same sequence in which they were added.

# Method of List:-
    1.) To add:-
        a.) add(int index, object O):-
        by using this method we can add one elements from the given index.

        b.) addAll(int index, object O):-
        by using this method we can add more than one elements from the given index.

    Note:-
        Collection grows one by one, so there must be element at previous position to add element at next position otherwise it will give exeception "IndexOutOfBoundsExeception".
    
    2.) To Remove:-
        a.) remove(int index):-
            by this method the element will be removed from the given index.

    3.) To Access:-
        a.) get(index):-
            by this method we can get the elements from the list at the given index.
        Exp:-
            List l1 -> [12,null,30,40,47];
                         0  1    2  3  4
                sop(l1.get(2));     // 30
                sop((Integer)l1.get(3)+100);        // 140
    
# Run for loop on list:-
    List<Integer> l1 = new ArrayList();
    l1.add(34);
    l1.add(45);
    l1.add(74);
    l1.add(91);
    for(int i=0; i<l1.size; i++){
        sop(l1.get(i));
    }

    4.) To Search:-
        a.) indexof(object O):-
            the method is used to search and get the index value of the object. it multiple elements are available with same value then it will give the index of element which has appeared first, if element is not available then it will return -1.
    
        b) lastIndexOf(object o):-
        it will give the index of element which has appeared in the last.

5. To Check Equility:-
    a) equals(Collection):-
        by this method we can Check two whether is equal or not. if two collection will be equal in size and sequence then it will be true.
    Exp:-
        l1 -> [12,18,20,30]
        l2 -> [30,18,12,20]
        l3 -> [12,18,20,30]
        sop(l1.equals(l2));     // false
        sop(l1.equals(l3));     // true

# Run loop / Iterator over list:-
1) for loop
2) for-each loop
3) Iterator loop
4) ListIterator

# ListIterator :-
    ListIterator is an interface which gives a cursor to iterate to on list.

# Creation of ListIterator Cursor :-
    ListIterator Cursor is created by the use of method listIterator.
    Exp :-
        l1 = [12,18,20,30];
        ListIterator lit = l1.listIterator();  // Here,ListIterator cursor is created on l.

    a.)listIterator(int index):-
        This method is used to create cursor from any given index for a list of objects.
    Exp:-
        List l1 = [12,18,20,30];
        ListIterator lit = l1.listIterator(l1.size());
                                // ^ here cursor gets generated at the end of list
        
# Methods of listIterator:-
    1.) hasNext()
    2.) next()
    3.) hasPrevious()
    4.) previous()
    5.) nextIndex():-
            it returns the next index value where cursor is available.
    6.) previousIndex():-
            it returns the previous index value where cursor is available.
    7.) remove():-
            This method will remove the element which is provided by next() or previous().
    8.) set(E e):-
            This method will replace the value which is last access by next() or previous().
    9.) add(E e):-
            by this method and element will be added in the given list and the size of list will be increase.

# Diff b/w iterator and listIterator.
1. iterator is universal cursor which is aplicable everywhere in collection but listIterator is not an universal cursor beacuse it is aplicable only for list interface.
2. By iterator we can iterate only in forward but by listiterator we can itearate forward as well as backward.
3. iterators provide only one method for modification for remove() but listIterator provides multiple methods for modification which are remove(),add(),set().

# Generics:-
    Parametrized type is called Generics. Generics is introduced in java in java5 update. Genericsis Designed by using diamond operator (<>). Generics provides various advantages so it is recommended to use with collection.

# Generics with Classes :-
    we achieve Generics for class by Designing parametrized class as below
    Exp:-
        public class Box<T> {
            T t;
            Box(T t) {
                this.t = t;
            }
            public void get value() {
                sop("value is : "+t);
            }
        }

    Box<Integer> b = new Box<>(12);     // parametrized type which is Generics

# Generics type Method :-
    we can Design Generics type method by providing appropreat Generics decelration of method.
    Exp:-
        class CattleHouse {
            public <T> void checkObject(T t) {      // it will allow any type object
                sop("Objects is being checked");
            }
            public <T extends Animal> void getAnimal(T t) {     // it will allow only Animal type object
                sop("Animal is being feed");
            }
            public void addAnimal(Animal a) {
                sop("Animal is added");
            }
        }

# Advantage of Generics :-
1. by Generics we can allow only a particular type also to be added as per requirements.
2. by the use of Generics we don't have to perform downcasting.
3. by the use of Generics type safety is achieved.
4. by the use of Generics we can identify error of compilation instead of getting error at run time.

# Synchronization :-
    it is a mechanism, where the given resources can be used by only one thread(user) at a time.
    Synchronization is achieved in java by using "Synchronized" keyword.
    if a method is decelared by using "Synchronized" keyword, then it can be only accessed by one thread at a time.

    public Synchronized void bookTicket() {
        // Synchronized method, it can be used by only one thread at a time.
    }

# Asynchronization :-
    it is a mechanism, where multiple thread can access the given resources at a time simultaneously.
    if a method is not declared by using "Synchronized" keyword then such method is called Asynchronus method.
    Asynchronus method can be used by multiple threads at a time.

    public void watchCricket() {
        // Asynchronus method, it can be used by many thread at a time.
    }

# DIFFERNCE BETWEEN Synchronization AND Asynchronization :-
1. Only one thread is allowed to access resources at a time but in Asynchronization multiple thread are allowed to access as given resources at a time.
2. Synchronization provides slower performance and Asynchronization provides faster performence.
3. Synchronization provides thread safety but Asynchronization does't give guaranty of thread safety.
4. Synchronization is recommended to use in a multithread enviroment where the resources will be modified but Asynchronization is recommended to use in an enviroment where resource will not be modified.

# ArrayList(C) :-
    It is a class which implements list interface of collection framework.

# Features of ArrayList :-
1. ArrayList internally uses dynamic array as the internal implemention of data structure which can grow or shrink.
2. arrayList allows duplicate elements.
3. ArrayList provides indexing.
4. we can store multiple null elements into arrayList.
5. ArrayList provides very fast access operations.
6. ArrayList is slow in modification(insertion or deletion) becuase if elements are added or removed from arrayList then all the remaining elements will have to shift one place its right ot its left.
7. ArrayList is recommended to use if the frequency operations is access operations but it is not recommended to use if the frequency operations is fast insertion or deletion.

# DrawBack :-
    ArrayList a1:[1,5,6,7,21,14,..........,81];
    add(3,30);  // insert in 3rd position other elements shift right which is time taking or costly.
    remove(3);  // from 4th index all the element will have to shift one place left.

# Construction of ArrayList :-
1. ArrayList() :-
    this Constructor creates an empty arrayList with capacity of 10, which grow once 70% of capacity is filled arrayList approximaty increase capacity by 50%.

2. ArrayList(int initialCapacity) :-
    By this Constructor an empty ArrayList is created with the provided capacity.

3. ArrayList(Collection C) :-
    by this Constructor we can pass a collection directly into ArrayList.

# LinkedList(C) :-
    it is a class which implememnts list interface as well as deque interface of collection framework.

# Features of LinkedList :-
1. LinkedList internally uses "double Linked node" as the internal implemention of data structure where we can operate it either from start or from end;
2. LinkedList allows duplicate.
3. LinkedList provides indexing.
4. LinkedList probides faster modification operations where element can be added or removed in start time.
5. LinkedList is slow in accessing the element becuase we have to traverse each node of the LinkedList one by one which is time taking process.
6. LinkedList is recommended to use if our frequency operations is "modification" but it not recommended to use if our frequency operation is fast access.

# DIFFERNCE BETWEEN ArrayList AND LinkedList :-
1. arrayList internally uses "dynamic array" to store the elements, but LinkedList internally uses "double Linked node" to store the element.
2. in arrayList all the element are store in continous block of memory but in LinkedList elements are store in the random block of memory by using node.
3. arrayList provides fast access in constant time but LinkedList is slow in accessing the element.
4. arrayList is slow in insertion or deletion but LinkedList is fast in insertion or deletion operation becuase it is performed in constant time.
5. arrayList is recommended if the requirements of application is fast access but LinkedList is recommended is fast modification.

# Vector :-
    Vector is a class which implememnts list interface of collection framework.

# Features of Vector :-
1. Vector internally uses dynamic array to store the group of objects.
2. vector has indexing so we can add,remove,search access the element by using index.
3. duplicate are allowed in vector.
4. vector is Synchronized so only one thread can be used on vector at a time.
5. vector is thread safe.
6. vector is slow in performance then arrayList.

# Constructors of Vector :-
1. Vector() :-
    by this Constructor a vector or dynamic array is created with default capacity 10 when 70% of it capacity is filled then a new vector will be created with double in capacity.

2. Vecor(int capacity,initialCapacity) :-
    by this Constructor a vector is created with the provided capacity.
    
3. Vector(int capacity,double loadfactor) :-
    by this Constructor a new vector will be created with the provided capacity that will grow once the provided load factor will be created.

4. Vector(Collection C) :-
    by this Constructor we can pass a collection directly into vector.

# DIFFERNCE BETWEEN ArrayList AND Vector :-
1. arrayList is not a legacy class but vector is a legacy class.
2. arrayList is not Synchronized but vector is Synchronized.
3. arrayList is not thread safe but vector is thread safe.
4. arrayList is provides fast performance but vector is slow in performance.

# Methods of Vector :-
1. Capacity() :-
    this method gives the current capacity of vector.

2. elementAt(int index) :-
    by this method we can get the element available at the correct index of vector.

3. ensureCapacity(int minCapacity) :-
    by this method minimum capacity of the vector will be maintained as per the given value.

4. insertElement(Object o, int index) :-
    by this method we can insert the given object at provide index.

5. firstElement() :-
    by this method the element at index 0 will be returned.

6. lastElement() :-
    by this method the element last index will be returned or it will return the element available at end position of vector.

7. removeAllElement() :-
    this method will clear the vector and size will become zero.

8. set(int index,Object element) :-
    this method will set an object at the given index.

# Stack :-
    Stack is a legacy class which implememnts list and extends vector.

# Features of Stack :-
1. Stack uses a linear data structure to store the element.
2. main features of Stack is to follow last in first our mechanism.
3. elements are always pushed on top and also remove from top.
4. duplicate are allowed in stack.
5. stack will have indexing.
6. stack is recommended to use if we want to work LIFO mechanism.

# Method of Stack :-
1. Push(E item) :-
    pushes an item on top of the stack.

2. Pop() :-
    remove the object at the top of this.

3. peek() :-
    looks at the object at the top of this stack without removing from the stack.

4. empty() :-
    it returns true if stack is empty.

5. Search(Object o) :-
    it will search and if element is found then it will give position of element from top otherwise it will return -1;

# Set :-
    set is an interface which extends collection interface.

# Features of Set :-
1. set is a unique type collection where duplicate are not allowed.
2. set does't provide indexing so we can't add,remove,search or access the element of set by using indexing.
3. set may or may not maintain the insertion order of the element.
4. in set we can store only one null element at max.

# HashSet(C) :-
    HashSet is a class which implememnts set index of collection framework.

# Features of HashSet :-
1. only unique element can be stored in HashSet.
2. indexing is not available in Hashset.
3. Hashset does't maintain the insertion order of the element so we can can't predict which will be accessed first and which will be accessed next 
4. HashSet internally uses a mechanism called hashing to store the elements in hashset.
5. in hashing mechanism a hash table is used to store every object by using the hashcode of the object.
6. the default capacity of hashtable is 16 and it will grow as per the requirements.
7. hashset provides fast performance becuase of hashing mechanism.

# Constructor Of HashSet :-
1. HashSet() :-
    by this Constructor one empty Hashset will be created with the default capacity 16. it will grow once 75% of capacity is filled.

2. HashSet(int initialCapacity) :-
    by this Constructor we can provide initial capacity is Hashset.

3. HashSet(int initialCapacity, float loadfactor) :-
    by this Constructor we can provide initial capacity along with load factor.

4. HashSet(Collection C) :-
    by this Constructor we can pass a collection directly into Hashset.

# Linked HashSet :-
    Linked Hashset is a class which implememnts set interface and extends Hashset of collection framework.

# Features of Linked HashSet :-
1. Linked Hashset maintains insertion order of the elements element will be accessed in the same order in which it was added.
2. duplicates are not allowed in Linked Hashset.
3. indexing is not available in Linked Hashset.
4. Linked Hashset internally uses hashing mechanism along with Linked implemention to store the elements.
5. Linked Hashset provides fast performance but slower them Hashset.
6. Hashset and Linked Hashset are both not Synchronized.
7. Linked Hashset is recommended to use where we want to store unique elements by maintaining the insertion order of the element.

# Construction of Linked Hashset :-
1. Linked HashSet() :-
    construct a new empty Linked Hashset with the default initialCapacity of 16 and load factor of 75%.

2. Linked HashSet(int initialCapacity) :-

3. Linked HashSet(int initialCapacity,float loadfactor) :-

4. Linked HashSet(Collection C) :-

# TreeSet(C) :-
    TreeSet is a class which implememnts set interface of collection framework.

# Features of TreeSet :-
1. TreeSet is stores the element in sorted manner where natural sorting mechanism is used.
2. only unique elements are stored in TreeSet.
3. in inerst only similer type of element should be added becuase it is internally compared to store in sorted manner.
4. we can store one null element in Hashset and Linked has but TreeSet does't allow any null element is added in TreeSet them it will give exeception called NullPointerException.
5. TreeSet is not Synchronized.
6. tree internally used red-black tree as the internal data structure to store the element.

# Construction of TreeSet :-
1. TreeSet()
2. TreeSet(Collection C)

# Queue(I) :-
    Queue is an interface which extends collection framework.

# Features of Queue :-
1. Queue works an a mechanism called FIFO mechanism. The element added first will be served or removed first.
2. Queue internally used a linear data structure where element is always added from tail & remove from head.
3. duplicates can be stored in Queue.
4. Queue does't have indexing.

# Methods of Queue :-
1. add() :-
    it will insert the given element into Queue.

2. offer() :-
    it is Queue specific method which inserts an element into Queue.

3. remove() :-
    retrives and removes the head of this Queue id gives exeception no such element exeception it Queue is empty.

4. poll() :-
    retrives and removes the head of this Queue or return null if this Queue is empty.

5. element() :-
    retrives but does't remove the head of this Queue and throws NoSuchElementException if this Queue is empty.

6. peek() :-
    retrives but does't remove the head of this Queue and return null if this Queue is empty.
 

# Priority Queue(C) :-
    Priority Queue is a class which implememnts Queue interface of collection framework.

# Features of PriorityQueue :-
1. we can store duplicate element into PriorityQueue.
2. PriorityQueue always gives Priority to the element with least value.
3. the head element will be the least elements and once it is Removed then another least value element will become the head element.
4. Queue does't provide indexing so PriorityQueue does't provide indexing.
5. PriorityQueue does't allow any null value if it added them it will give NullPointerException.
6. in PriorityQueue only similar types of element should be stored otherwise it will cause exeception called classCastException.

# Deque(I) :-
    deque is an interface which extends Queue interface of collection framework. deque is a doubly ended Queue which offers operation from both side of the Queue.
    the classes which implememnts deque are LinkedList and ArrayDeque.

# Features of Deque :-
1. addFirst() :-
    inserts the specified element at the front of this Queue.

2. addLast() :-
    inserts the specified element at the last of this Queue.

3. offerFirst() :- same as addFirst()

4. offerLast() :- same as addLast()

5. removeLast() :- retrives and removes the last element of deque.

6. removeFirst() :- retrives and removes the first element of deque.

7. pollFirst() :- retrives and removes the first element of deque.

8. pollLast() :- retrives and removes the last element of deque.

9. getLast() :- retrives but does't removes the last element of deque.

10. getFirst() :- retrives but does't removes the first element of deque.

11. peekFirst() :- retrives but does't remove the first element of deque.

12. peekLast() :- retrives but does't remove the last element of deque.

13. removeFirstOccurence() :-
    remove the first occurence of the specified element from this deque.

14. removeLastOccurence() :- 
    remove the last occurence of the specified element from this deque.

# Creation of Deque :-
    List l1 = new LinkedList();
    Queue q1 = new LinkedList();
    Deque dq = new LinkedList();
    LinkedList ll = new LinkedList();
    Queue l1 = new arrayDeque();
    Deque l1 = new arrayDeque();

# Map(I) :-
    map is an iterface which is used to key value pair key and value in map are stored in the form of object in the map. the key value pair is called entry and it is refered as Map.Entry key can't have duplicate values but values can have duplicates. every key will refer exactly one value and this reletion is called one to one reletion.
    Exp :-
        Map.Entry<Integer,String>

# Methods of Map :-
    1.) size() :-
        return the numbers of key value mapping in the map.

    2.) isEmpty() :-
        return if this map contains a mapping for no single arguments.

    3.) containsKey() :-
        this method is taking key if key is available then true otherwise it return false.
        
    4.) containsValue() :-
        return the value to which the specified key is mapped.
        This method takes a value and if that value is available then it returns true itherwise false.

    5.) get(Object Key) :-
        This method accept a key and it returns the corresponding value mapped and it returns mapped by the given key.

    6.) put(K Key, V Value) :-
        This method will add a new entry if the provided key is not already added in map if the provided key already avaible then it will update the corresponding value of the key. 

    7.) remove(Object key) :-
        this methods takes key-value and if the key is available then that will be removed.

    8.) PutAll(Map m) :-
        This method will add one method directly into another map.

    9.) clear() :- it will remove all the entries from map.

    10.) Set<k> keySet() :-
        this method provides all type of this method is set so when this method is called we store all the keys in set.
        Exp :-
            Set<Integer> x = m1.keySet<>();

    11.) Collection<V> values() :-
        this method returns all the values in the form of collection.
        Exp :-
            Collection<String> x = m1.value();

    12.) Set<Map.entry<k,v>> entrySet() :-
        this methods returns all the entries of the map in the form of set.
        Exp :-
             Set<Map.entry<Integer,String>> es = m1.entrySet(); 

    13.) equals(Object O) :-
        by this method we can check weather two maps are equal or not.

    14.) putIfAbsent(K Key,V Value) :-
        by this method we can add on entry into map only if the it is not already available in map.

    15.) remove(Object key,Object value) :-
        this method will take key & value and if the provided key is available with the provided value then only entry will be removed.

    16.) replace(K key,v oldValue,v newValue) :-
        this method will match old key and value and if it will matches then only new value will be updated.
        Exp :-
            m1.replace(20,"abc","xyz");     // here no replacement
            m1.replace(20,"abcd","xvyz");     // here, key 20 will replace vale abcd to xvyz

    17.) replace(k key,v value) :-
        by this method we can replace an entry value if the provided key is available.

# Map.Entry<k,v> Interface :-
    entry is the inner interface of map interface and so it is refered as Map.Entry
    Exp :-
        Class A{
            Class B{

            }
        }

        interface Map{
            interface Entry<k,v>{

            }
        }

# Methods of Interface :-
    1.) getKey() :-
        this method will return the key form the current entry.

    2.) getvalue() :-
        this method will return the value form the current entry.

    3.) setValue(V Value) :-
        by this method we can change or update the value at current entry.

# Run the loop on MAP Key :-
    Map m1 = [[12,"abc"],[15,"pqr"],[13,"xyz"]];
    Set<Integer> key = m1.keySet();
    for(int p : key)
        sop(p);     // 12 15 13
OR    
    Iterator<Integer> itr = key.iterator();
    while(itr.hasNext())
        sop(itr.next());    // 12 15 13

# Run the loop on MAP Values :-
    Map m1 = [[12,"abc"],[15,"pqr"],[13,"xyz"]];
    Collection<String> val = m1.values();
    for(int p : val)
        sop(p);     // abc pqr xyz
OR
    Iterator<String> itr = val.iterator();
    while(itr.hasNext())
        sop(itr.next());    // abc pqr xyz
    
# Run the loop on MAP Entries :-
    Map m1 = [[12,"abc"],[15,"pqr"],[13,"xyz"]];
    Set<Map.Entry<Integer,String>> ent = m1.entrySet();
    sop(ent);       // [[12,"abc"],[15,"pqr"],[13,"xyz"]]
    for(Map.Entry<Integer,String> p : ent)
        sop(p);     // [12,"abc"] [15,"pqr"] [13,"xyz"]
OR
    for(Map.Entry<Inetger,String> p : ent)
        sop("key is:"+p.getkey()+" Value is:"+p.getvalue());    
        // key is 12 value is abc
        // key is 15 value is pqr
        // key is 13 value is xyz
        
Q.1) From the given array return the number with the maximum frequency.
Q.2) Print the element which is the first non-repeating element in the array. if such element is
     not found then print -1.
Q.3) print the element as well as for the first non-repeating number. if element is not found
     then print -1,-1.
Q.4) print all the numbers of the array which has appeared for exactly one time.
Q.5) print all the element of array which has appeared for more then once.
Q.6) print all the elemens of array along with it's frequency if it has appeared for even number
     of time.
Q.7) perform all this operations on String for Character.

# Utility Class :-
    Arrays and Collection are called utility classes which are available in java.util package.

# Arrays :-
    Arras is a class in java.util package which is Designed to help array by providing various methods.
    Exp :-
        int[] a = {12, 18, 30, 15, 17, 23};
        sop(a);     // [@hexadecimal]
        sop(Arrays.toString(a));        // [12, 18, 30, 15, 17, 23]

        Arrays.sort(a);
        sop(Arrays.toString(a));        // [12, 15, 17, 18, 23, 30]
    
# Collection Class :-
    Collection is a class in java.util package which provides various utility methods to help Collection framework.
    Exp :-
        List l1 = {12, 18, 30, 15, 17, 23};
        sop(l1);        // 12, 18, 30, 15, 17, 23
        Collection.sort(l1);
        sop(l1);        // [12, 15, 17, 18, 23, 30]

# Working of Sort Method :-
    Sort method uses lightly optimized merge sort algorithm to sort the elements by using the diff b/w them.
    if diff b/w then it will be positive then two elements will swap the position otherwise they will remain at position.

    Lis l1 = [12, 15, 17, 18, 23, 30];
              e1  e2
    Case 1 :
    e1 > e2 both e1 & e2 will swap position => e1-e2 if true
    e1 & e2 diff => +value

    Case 2 :
    e1 < e2 
    e1 == e2    // both will remain at same position
    e1 & e2 diff is o and -ve.

# Costum Sorting :-
    To achieve sorting for custom type object java provides two interface comparable and comparator.

# Comparable Interface :-
    Comparable is a Interface available in java.lang package.
    Comparable interface is used to achieve sorting sequence for custom type Objects.
    We can sort the Object as Name, Age, Id, Salary, RollNo etc.
    Comparable interface has one method compareTo so it is also called functional type interface.

    @functionalInterface
    interface Comparable <E> {
        public int compareTo(E e);
    }

    S1.compareToIgnoreCar(s2)
        is a method & sorting

    To achieve single sorting sequence by comparable interface. we must implement this to our class and it's method compare to should be provided with the logic for comparison.
    Collection.sort() internally uses compare method logic to sort collection of element.

# Comparator Interface :-
    Comparator interface is available in java.util package this interface is used to achieve multiple sorting sequence for custom 
    type Objects. 
    By using comparator interface we can sort the elements on name,id,salary at the same time.

# Structure of Comparator :-
    
    interface Comparator<E> {
        public int compare(E e1, E e2);

    }

    To achieve multiple sorting sequence we have to Design multiple classes and the class should implement comparator interface.

    Collection.sort(l1);        // to sort by using comparator

    Comparator.sort(l1, new NameComaprator());          // to sort by using comparator on name
    
    Collection.sort(l1, new SalaryHighToLowComparator());           // to sort by using comparator on High To Low Salary

# DIFFERNCE BETWEEN Comparable AND Comparator :-
1. comparable is avaible in java.lang package but comparator is avaible in java.util package
2. comparable is used to achieve single sorting sequence but comparator is used to achieve multiple sorting sequence
3. comparable provides sorting by using only one Class but comparator uses multiple class to provide multiple sorting sequence
4. comparable has method compareTo but comparator has method compare 
