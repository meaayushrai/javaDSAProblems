import java.util.Scanner;

public class SpnaOfArray {
    public static  void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("What is size of array you want");
        int n = scn.nextInt();
        System.out.println("Enter elements :  ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int max=arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        int min=arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        int span= max-min;

        System.out.println("span of array is " + span);
    }
}
