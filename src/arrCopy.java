import java.util.Arrays;

public class arrCopy {
	public static void main(String[]args) {
		
		/***int[]a= {10,20,30};
		int[]copy=Arrays.copyOf(a, a.length);
		System.out.print("Copy of the array: ");
		System.out.println(Arrays.toString(copy));
		
		int[]d= {10,20,30};

		int[]copyrange= Arrays.copyOfRange(d,1,4);
		System.out.print("cor: ");
		System.out.println(Arrays.toString(copyrange)); 
		
		int[]d= {10,20,30};
		
		int index=Arrays.binarySearch(d, 30);
		System.out.println(index); 
		
		int[]f=new int[10];
		Arrays.fill(f, 7);
		System.out.println(Arrays.toString(f));
		
				
				
		int[]a= {10,20,40,30,60,50};
		Arrays.sort(a);
		System.out.println("Max: "+a[a.length-1]);
		System.out.println("Min: "+a[0]); ***/
		
		int[]a= {1,2,3,4,5};
		int[]rev=new int[a.length];
		int b=0;
		
		for(int i=a.length-1; i>=0;i--)
		{
			rev[b]=a[i];
			b++;
		}
				
		System.out.println(Arrays.toString(rev));		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
