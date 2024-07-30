import java.util.Scanner;

public class MaxElement   {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,3,32,342};
        int iMax = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > iMax){
                iMax = arr[i];
            }
        }

        System.out.println("The Max number is "+ iMax);
    }
}
