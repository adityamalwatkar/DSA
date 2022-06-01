
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
	    {
	        int n = sc.nextInt();
	        int[] ar = new int[n];
	        for(int i = 0;i<n;i++) ar[i] = sc.nextInt();
	        int start = 0;
	        int end = n-1;
	        while(start<end)
	        {
	            int temp = ar[start];
	            ar[start] = ar[end];
	            ar[end] = temp;
	            start++;
	            end--;
	        }
	        for(int i=0;i<n;i++) System.out.print(ar[i]+" ");
	        System.out.println();
	    }
	    
	}
}