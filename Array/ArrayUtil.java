public class ArrayUtil
{
	public void printArray(int[] arr)
	{
		int n=arr.length;
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public void arrayDemo()
	{
		int[] myArray = new int[5];
		printArray(myArray);        // Default values 0 0 0 0 0
	}
	public static void main(String...args)
	{
		ArrayUtil arrUtil = new ArrayUtil();
		arrUtil.arrayDemo();
	}
}