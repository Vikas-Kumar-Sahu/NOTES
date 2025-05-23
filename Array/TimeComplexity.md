# Complexity:-
Complexity is a algorithm or majorment to idetify how effieciently algorithm can solve the problem. Complexity is majored in two ways -
1.) Time Complexity         2.) Space Complexity

Time Complexity:-
This is a majorment to identify in how much time and algorithm will solve the problem.

Space Complexity:-
This is a majorment to idetify in how much space and algorithm will solve the problem.

SwapNumbers):-
    a = 12;    b = 30;      
    temp = a;
    a = b;
    b = temp;
    O(time) => O(3) => O(1) => O(Constant)
    O(space) => O(1) => O(Constant)
    O(28) => O(1000) => O(Constant)

1. for(int i=1; i<=n; i++){

    }
    O(time) => O(n)
    O(space) => O(Constant)

2. for(int i=1; i<=3*n+40; i++){

    }
    O(time) => O(3*n+40) => O(n)
    O(space) => O(Constant)

3. for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){

        }
    }
    O(time) => O(n*n) => O(n^2)
    O(space) => O(Constant)

4. for(int i=1; i<=3*n+5; i++){
        for(int j=1; j<=2*n-3; j++){

        }
    }
    O(time) => O((3*n-5)*2*n-3) => O(6n^2+n-16) => O(n^2)
    O(space) => O(Constant)  

5. for(int i=1; i<=n; i++){

    }
    for(int i=1; i<=n; i++){

    }
    O(time) => O(n+n) => O(2n) => O(n)
    O(space) => O(Constant)

6. for(int i=1; i<=3n+5; i++){

    }
    for(int i=1; i<=9n+3; i++){

    }
    for(int i=1; i<=7n+3; i++){

    }
    O(time) => O(3n+5+9n+3+7n+3) => (19n+11) => O(19n) => O(n)
    O(space) => O(Constant)

7. for(int i=1; i<=n; i=i*2){

    }
    O(time) => O(logn)  // Base 2
    O(space) => O(Constant)

    <!-- 2^k <= n    
         2^k = n     
         logn = k 
    -->

<!-- Note:- logn faster than n. -->

8. for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j=j*2){

        }
    }
    O(time) => O(nlogn)  // Base 2
    O(space) => O(Constant)

9.  int p = 1;
    for(int i=1; i<=n; i++){
        p = p + i;
    }

    <!--
    1+2+3+4+...+k = n
    k(n+1) / 2 = n
    k^2 + k = 2n
    k^2 = n
    k = /n 
    -->
    O(time) => O(/n)
    O(space) =>  O(constant)

# Note :-
    T.C. => O(1) < O(logn) < O(/n) < O(n) < O(nlogn) < O(n^2)
    S.C. => O(1)