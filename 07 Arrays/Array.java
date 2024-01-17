import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String args[]) {
       
        //Array : array is a homogeneous collection of data .which is stored at contigious memory locations
        // int num;//1 block is created in memory
        // int arr[5]; //error (not valid in java)
        // new int[5];// creates 5 block of type integer but it isn't reusable without a variable name 
        //new is used to allocate the memory at runtime
        // int arr[];
        // arr=new int[5];
        // // or 
        // int arr2[]=new int[5];
        // int []arr3=new int[5];
        // int[] arr4=new int[5];

        // int arr5[]={10,20,45,34,35,67,98};
        // // or
        // int arr6[];
        // arr6=new int[]{10,2,45,7,7,8,8,98};
        // //or
        // int arr7[]=new int[]{56,87,98,534,98,32};

        // System.out.println("the value at array's 3rd index is "+arr7[3]);

        // arr[0]=56;
        // arr[1]=67;
        // arr[2]=34;
        // arr[3]=343;
        // arr[4]=344;
        
        // System.out.println("Printing through normal for loop");
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println(arr[i]);
        // }

        // System.out.println("\nPrinting through array.length in for loop");
        // System.out.println("array length is "+arr.length);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }

        // System.out.println("\nPrinting through for each loop (enhanced for loop)");
        // for(int e :arr)
        // {
        //     System.out.println(e);
        // }

        // System.out.println("\nPrinting through Arrays.toString");
        // System.out.println(Arrays.toString(arr));

        //taking user defined value in fixed size array

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];

        System.out.println("enter array elements :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter "+i+"th element :");
            arr[i]=sc.nextInt();
        }
        System.out.println("\nPrinting through array.length in for loop");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}