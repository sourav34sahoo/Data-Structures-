public class ArrayUtil4
{
	public void printArray(int[] arr)
	{
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+"");  // 5 1 9 2 10
		}
	}
	public static void main(String...args)
	{
		ArrayUtil4 arrayUtil = new ArrayUtil4();
		arrayUtil.printArray(new int[] {5,1,9,2,10});
	}
}