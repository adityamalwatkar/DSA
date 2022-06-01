import java.util.*;

public class MaxMinElement
{

	public static int MaximumElement(int arr[], int iSize)
	{
		int max = 0;

		for(int i = 0; i < iSize; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}

		return max;
	}

	public static int MinimumElement(int arr[], int iSize)
	{
		int min = arr[0];

		for(int i = 0; i< iSize; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}

		return min;
	}

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);

		int iMax; 
		int iMin;

		System.out.println("Enter the number of elements: ");
		int iSize = sobj.nextInt();

		int []arr = new int[iSize];

		for(int i = 0; i<iSize; i++)
		{
			arr[i] = sobj.nextInt();
		}

		iMax = MaximumElement(arr, iSize);
		iMin = MinimumElement(arr, iSize);

		System.out.println("Max : "+iMax);
		System.out.println("Min : "+iMin);

	}
}