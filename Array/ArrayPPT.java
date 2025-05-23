public class ArrayPPT {

    // WAJP to print the even index elements of the array.
    public static void printArray(int[] arr){
        for(int x : arr)
            System.out.print(x+" ");
    }

    // WAJP to print the even elements of the array.
    public static void printEvenArray(int[] arr){
        for(int x : arr)
            if(x%2 == 0)
            System.out.print(x+" ");
    }

    // WAJP to count all the even numbers of the array.
    public static void printCountArray(int[] arr){
        for(int x=0; x<arr.length; x++)
            if(x%2 == 0)
            System.out.print(arr[x]+" ");
    }

    // WAJP to print and count all the three digits numbers of the array.
    public static void printCountThreeDigitsArray(int[] arr){
        int count = 0;
        for(int x : arr)
            if (x>=100 && x<=999)
                count = count + 1;
            System.out.print(count);
    }

    // WAJP to print sum and average of all the elements of array.
    public static void printSumAndAverage(int[] arr){
        int sum = 0;
        for(int x : arr)
            sum = sum + x;
        System.out.println("Array sum is : "+sum);
        System.out.println("Array Average is : "+sum/arr.length);
    }

    // WAJP to print the Biggest element,Smallest element and their difference in the array.
    public static void getBiggestAndSmallest(int[] arr){
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int x : arr){
            if(biggest < x)
                biggest = x;
            if(smallest > x)
                smallest = x;
        }
        System.out.println("Biggest Element in Array : "+biggest);
        System.out.println("Smallest Element in Array : "+smallest);
        System.out.println("Difference between them : "+(biggest-smallest));
    }

    // For the given array of Strings,print and count all the Strings which has even number of characters. 
    public static void printEvenString(String[] str){
        int count = 0;
        for(String x : str){
            int n = x.length();
            if(n%2 == 0){
                count = count+1;
                System.out.print(x+" ");
            }
        }
        System.out.print("\n count is Strings : "+count);
    }

    public static void main(String[] args) {
        // int[] arr = {12, 8, 5, 12, 5, 12, 10, 12, 12};
        // String[] str = {"Ram", "Mohan", "Rakesh", "Pappu", "Max", "Raju"};
    }
}