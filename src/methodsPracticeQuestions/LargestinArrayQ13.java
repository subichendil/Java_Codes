package methodsPracticeQuestions;

public class LargestinArrayQ13 {
	static void findLargest(int[]arr)
	{
		int largest=arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println("Largest Element in the array: "+largest);
	}

	public static void main(String[]args)
	{
		int[]numbers= {10,20,40,50,30,100};
		findLargest(numbers);
	}
}
