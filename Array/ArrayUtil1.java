public class ArrayUtil1
{
	public void printArray(int[] arr)
	{
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+"");
		}
		System.out.println();
	}
	public void arrayDemo()
	{
		int[] myArray=new int[5];
		myArray[0]=5;
		myArray[1]=1;
		myArray[2]=8;
		myArray[3]=2;
		myArray[4]=10;
		printArray(myArray);  // 5 1 8 2 10
	}
	public static void main(String...args)
	{
		ArrayUtil1 arrUtil = new ArrayUtil1();
		arrUtil.arrayDemo();
	}
}