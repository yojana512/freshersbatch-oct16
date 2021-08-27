public class Generics_3 
{	
	public static <T> void swapPos(T[] arr, int i, int j)
	{
		T temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static <T> void display(T[] arr) 
	{
		for(T x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Integer[] arr= {11,22,33,44,55,66};
		
		System.out.println("\nArrays before swaping\n");
		display(arr);
		
		swapPos(arr, 3, 5);
		
		System.out.println("\nArrays after swaping\n");
		display(arr);
		
	}
}


