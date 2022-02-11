import java.util.Scanner;

public class DifferenceOfArrays {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter elements of first array which is assumed to be larger one");
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i =0;i<arr1.length;i++){
            arr1[i]= scn.nextInt();
        }

        // Second array which is supposed to be smaller one
        System.out.println("Enter elements of first array which is assumed to be smaller one");
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i =0;i<arr2.length;i++){
            arr2[i]= scn.nextInt();
        }
        int[] diff = new int[n1];

        int borrow=0;
        int diffdigit=0;
        int i= arr1.length-1;
        int j= arr2.length-1;
        int k= diff.length-1;

        while (k>=0) {
            int a2val = j < 0 ? 0 : arr2[j];

            if (arr1[i] + borrow >= a2val) {
                diffdigit= arr1[i]+borrow-a2val;
                borrow=0;
            }
            else {
                diffdigit= arr1[i]+10+borrow-a2val;
                borrow=-1;
            }
            diff[k]=diffdigit;
            i--;
            j--;
            k--;
        }
        for (int val:diff) {
            System.out.print(val);

        }


    }
}
