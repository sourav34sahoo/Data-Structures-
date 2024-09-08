public class ArrayUtil3
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
		myArray[0]=23;
		myArray[1]=44;
		myArray[2]=42;
		myArray[3]=29;
		myArray[4]=75;
		//myArray[5]=26;  ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		printArray(myArray);
	}
	public static void main(String...args)
	{
		ArrayUtil3 arrayUtil = new ArrayUtil3();
		arrayUtil.arrayDemo();
	}
}