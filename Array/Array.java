public class Array {

    public static boolean checkPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }    
        }       
        return true;
    }
    public static void countPrime(int s, int r){
        int count=0;
        for(int i=s; i<r; i++){
            if(checkPrime(i)){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nTotal Prime Number in this Range : "+count);
    }

    public static void printFrequency(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count=count+1;
                    arr[j]=arr[n-1];
                    n--;    j--;
                }
            }
            System.out.println(arr[i]+" is : "+count+" times");
        }
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");   // 12 8 5 10  
    }

    // 12 is : 5 times
    // 8 is : 1 times 
    // 5 is : 2 times 
    // 10 is : 1 times

    public static void frequency(int[] arr){
        int[] freq = new int[100];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        for(int i=0; i<freq.length; i++){
            if (freq[i]>0) {
                System.out.println(i+" is : "+freq[i]+" times");
            }
        }
    }
    // 5 is : 2 times
    // 8 is : 1 times 
    // 10 is : 1 times
    // 12 is : 5 times

    public static void printDuplicate(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count=count+1;
                    arr[j]=arr[n-1];
                    n--;    j--;
                }
            }
            if(count > 1)
                System.out.println(arr[i]+" ");     // 12 5
        }
    }

    public static void printUnique(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count=count+1;
                    arr[j]=arr[n-1];
                    n--;    j--;
                }
            }
            if(count == 1)
                System.out.print(arr[i]+" ");       // 8 10 
        }
    }

    public static void printMax(int[] arr){
        int max = 0;
        int element = arr[0];
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count=count+1;
                    arr[j]=arr[n-1];
                    n--;    j--;
                }
            }
            if(count > max){
                max = count;
                element = arr[i];
            }            
        }
        System.out.println("The Element with maximum frequency is: "+element);      // 12.
    }

    // Design a methos to rotate all the elements of array one time into right side
    public static void rotateOnceRight(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        // for(int i=0; i<n; i++)
        //     System.out.print(arr[i]+" ");   // 12 12 8 5 12 5 12 10 12
    }

    // design a method to rotate each elements of an array k times to right side
    public static void rotateKthRight(int[] arr, int k){
        for(int i=0; i<k; i++){
            rotateOnceRight(arr);       // 3 times run
        }
        // for(int i=0; i<arr.length; i++)
        //     System.out.print(arr[i]+" ");       // 10 12 12 12 8 5 12 5 12 
        for(int x: arr){
            System.out.print(x+" ");
        }
    }

    // design a method to rotate all the elements of array one time into left side
    public static void rotateOnceLeft(int[] arr){
        int temp = arr[0];
        int n = arr.length;
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        // for(int i=0; i<n; i++)
        //     System.out.print(arr[i]+" ");   // 8 5 12 5 12 10 12 12 12
    }

    // design a method to rotate each elements of an array k times to left side    
    public static void rotateKthLeft(int[] arr, int k){
        for(int i=0; i<k; i++){
            rotateOnceLeft(arr);       // 3 times run
        }
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");       // 12 5 12 10 12 12 12 8 5  
    }

    public static void rotateZero(int[] arr){
        for(int i=0, j=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
            
            if(i!=j)
                arr[i]=0;
            j++;
            }
        }
        for(int x: arr)
            System.out.print(x+" ");
    }

    public static void reverse(int[] arr, int start, int end){
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArrayRight(int[] arr, int k){
        k = k%arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);

        for(int x: arr)
            System.out.print(x+" ");    // 10 12 12 12 8 5 12 5 12 
            
    }

    public static void rotateArrayLeft(int[] arr, int k){
        k = k%arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);

        for(int x: arr)
            System.out.print(x+" ");    // 10 12 12 12 8 5 12 5 12             
    }

    public static void getBiggestAndSecondBiggest(int[] arr){
        int biggest = arr[0];
        int sec_biggest = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > biggest){
                sec_biggest = biggest;
                biggest = arr[i];
            }
            else if(arr[i] > sec_biggest && arr[i]!=biggest){
                sec_biggest = arr[i];
            }
        }
        System.out.println("Biggest Element is "+biggest);
        System.out.println("Second Biggest Element is "+sec_biggest);
    }

    public static void getSmallestAndSecondSmallestt(int[] arr){
        int smallest = arr[0];
        int sec_smallest = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                sec_smallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < sec_smallest && arr[i]!=smallest){
                sec_smallest = arr[i];
            }
        }
        System.out.println("Biggest Element is "+smallest);
        System.out.println("Second Biggest Element is "+sec_smallest);
    }

    public static void sortArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(i>j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // int count = 0;
        // int count1 = 0;
        // for(int i=0; i<arr.length; i++){
        //     if (arr[i] == 0) {
        //         count++;
        //     }else if (arr[i] == 1) {
        //         count1++;
        //     }
        // }
        // for(int i=0; i<arr.length; i++){
        //     if(i<count)
        //         arr[i]=0;
        //     else if(i<count+count1)
        //         arr[i]=1;
        //     else
        //         arr[i]=2;
        // }
        for(int x: arr){
            System.out.print(x+" ");
        }
    }

    public static void bubbleSortArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int x = 0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    x++;
                }
            }
            if(x==0)    
                break;
        }
        for(int x : arr)
            System.out.print(x+" ");
    }

    public static void selectionSortArray(int[] arr){
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
        for(int x : arr)
            System.out.print(x+" ");
    }

    public static void insertionSortArray(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int x : arr)
            System.out.print(x+" ");
    }

    public static int binarySearch(int[] arr, int element,int s, int e){
        if(s>e){
            System.out.println("Element nearest position");
            return s;
        }
            int mid = s + (e-s)/2;
            if(arr[mid] == element){
                System.out.println("Element is fount at position");
                return mid;
            }
            else if(arr[mid] > element)
                return binarySearch(arr, element, s, mid-1);
            else
                return binarySearch(arr, element, mid+1, e);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 8, 25, 65, 67, 78, 83, 84, 95};
        // int[] arr = {12, 8, 5, 12, 5, 12, 10, 12, 12};
        // int[] array = {1, 0, 5, 3, 0, 6, 9};
        // int[] arr = {80, 80, 30, 12, 45, 55, 60, 43, 12, 30};
        // int[] arr = {0,2,0,1,2,1,0,2};

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Kth position to rotate the Array : ");
        // int k = sc.nextInt();

        // printFrequency(arr);
        // frequency(arr);
        // printDuplicate(arr);
        // printUnique(arr);
        // printMax(arr);
        // rotateOnceRight(arr);
        // rotateOnceLeft(arr);
        // rotateKthRight(arr, k);
        // rotateKthLeft(arr, k);
        // System.out.println(checkPrime(18));
        // countPrime(100,200);
        // rotateZero(array);
        // rotateArrayRight(arr, k);
        // rotateArrayLeft(arr, k);
        // getBiggestAndSecondBiggest(arr);
        // getSmallestAndSecondSmallestt(arr);
        // sortArray(arr);
        // bubbleSortArray(arr);
        // selectionSortArray(arr);
        // insertionSortArray(arr);
        int pos = binarySearch(arr, 78, 0, arr.length);
        System.out.println(pos);
    }
}