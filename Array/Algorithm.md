# Sorting Algorithm :-
1. Bubble Sort :-
    a => [42,15,18,10,8,30,5];
    
    public static void sortArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int x = 0;
            for(int j=0; j<n-1-i; j++){
                if(arr[i]>arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    x++;
                }
            }
            if(x==0)    
                break;
        }
    }
    T.C. => O(n^2)
    S.C. => O(1)

2. Selection Sort :-
    a => [42,15,18,10,8,30,5];

    public static void sortArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = arr[i];
            int index = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
                arr[i] = min;
        }
    }
    T.C. => O(n^2)
    S.C. => O(1)
    
3. Insertion Sort :-
    a => [42,15,18,10,8,30,5];

    public static void insertionSort(int[] a){
        int n = a.length;
        for(int i=1; i<n; i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[i]>key){
                a[j+1] = a[i];
                j--;
            }
            a[j+1] = key;
        }
    }
    
4. Merge Sort :-
    Merge sort is a Sorting mechanism where elements are sorted by using divide and conquer mechanism.
    1st elements are divided into smallest unit and then small units are conquered and sorted.

    public static void divide(int[] a, int s, int e){
        if(s<e){
            int mid = s+(e-s)/2;
            divide(a, s, mid);
            divide(a, mid+1, e);
            merge(a, s, mid, e);
        }
    }

    public static void merge(int[] a, int s, int e, int mid){
        int[] merged = new int[e-s+1];
        int index1 = s;
        int index2 = mid+1;
        int x = 0;
        while(index1 <=mid && index2 <=e){
            if(a[index1] < a[index2])
                merged[x++] = a[index1++];
            else 
                merged[x++] = a[index2++];
        }
        while(index1 <= mid){
            merged[x++] = a[index1++];
        }
        while(index2 <= e){
            merged[x++] = a[index2++];
        }
        for(int i=0, j=s; i<merged.length; i++,j++){
            a[s] = merged[i];
        }
    }

5. Searching :-
    1.) Linear Search :-
        public static int linearSearch(int[] arr, int element){
            for(int i=0; i<arr.length; i++){
                if(arr[i] == element)
                    return i;
            }
            return -1;
        }
        T.C. => O(n)
        S.C. => O(1)

    2.) Binary Search :-
        public static int binarySearch(int[] a, int element){
            int s = 0; 
            int end = arr.length-1;
            while(s<e){
                int mid = s + (e-s)/2;
                if(a[mid] == element)
                    return mid;
                else if(a[mid] > element)
                    e = mid-1;
                else
                    s = mid+1;
            }
            return -1;
        }
        T.C. => O(logn)
        S.C. => O(1)

        public static int binarySearch(int[] a, int element,int s, int e){
            if(s>e)
                return -1;
                int mid = s + (e-s)/2;
                if(a[mid] == element)
                    return mid;
                else if(a[mid] > element)
                    return binarySearch(arr, element, s, mid-1);
                else
                    return binarySearch(arr, element, mid+, e);
        }
        T.C. => O(logn)
        S.C. => O(1)