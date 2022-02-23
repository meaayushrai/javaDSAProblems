import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int x= scn.nextInt();
        int[] arr = new int[x];
        for(int i = 0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        System.out.println("reversed array is :");
        int i=0;
        int j=arr.length-1;
        int temp=0;
        while ( i<  j){
            temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        for( int a=0;a<arr.length;a++){
            System.out.print( arr[a]+"\t");
        }
    }
}
