import java.net.StandardSocketOptions;
import java.util.Scanner;

public class FindElement {
    public static  void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int counter=0;

        System.out.println("Enter size of elements");
        int n = scn.nextInt();
        int[] arr= new int[n];
        System.out.println("Elements :");
        for (int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Element to be searched :");
        int d = scn.nextInt();

        for(int i = 0;i< arr.length;i++){
            if(arr[i]==d){
                System.out.println("Element found at "+arr[i]);
                counter += 1;

                break;
            }


        }
        if(counter==0)
            System.out.println("Element not found");



    }
}
