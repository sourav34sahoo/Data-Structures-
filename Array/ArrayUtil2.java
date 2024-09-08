public class ArrayUtil2
{
	public void printArray(int[] arr)
	{
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+"");
		}
	}
	public void arrayDemo()
	{
		int[] myArray = new int[5];
		myArray[0]=5;
		myArray[1]=1;
		myArray[2]=8;
		myArray[3]=2;
		myArray[4]=20;
		myArray[3]=30;
		printArray(myArray);  // 5 1 8 2-update to->30 20 
	}
	public static void main(String...args)
	{
		ArrayUtil2 arrayUtil = new ArrayUtil2();
		arrayUtil.arrayDemo();
	}
}