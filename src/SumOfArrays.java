import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        // creating and taking inputs in first array
        System.out.println("Enter the size of first array and then enter elements respectevily");
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<arr1.length;i++) {
            arr1[i] = scn.nextInt();
        }
        // creating and taking input for second array
        System.out.println("Enter the size of second array and then enter elements respectevily");
         int n2= scn.nextInt();
         int[] arr2 = new int[n2];
         for(int i=0;i<arr2.length;i++){
           arr2[i]= scn.nextInt();
         }
        // initializing variables
         int[] sum = new int[n1>n2?n1:n2];
         int carry=0;
         int addedDigit=0;
         int i=arr1.length-1;
         int j= arr2.length-1;
         int k= sum.length-1;


         //main logic
        while (k>=0){
            addedDigit = carry;
            if(i>=0){
                addedDigit+=arr1[i];
            }
            if (j>=0){
                addedDigit+=arr2[j];
            }
            carry = addedDigit/10;
            addedDigit= addedDigit%10;
            sum[k]=addedDigit;
            i=i-1;
            j=j-1;
            k=k-1;
        }

        // printing the sum array and affixing the carry if exist after last added digit;

        if(carry!=0){
            System.out.print(carry);
        }
        for(int value:sum){
            System.out.print(value);
        }
    }
}
