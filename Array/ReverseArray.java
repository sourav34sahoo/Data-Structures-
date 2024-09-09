public class ReverseArray
{
	public static void reverse(int[] numbers, int Start, int End)
	{
		while(Start<End){
			int temp = numbers[Start];
		    numbers[Start] = numbers[End];
		    numbers[End] = temp;
		    Start++;
		    End--;
		}
	}
	public static void printArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+"");
		}
		System.out.println();
	}
	public static void main(String...args)
	{
		int[] numbers = {2,11,5,10,7,8};
		printArray(numbers);    // 2 11 5 10 7 8
		reverse(numbers,0,numbers.length-1);
		printArray(numbers);    // 8 7 10 5 11 2
	}
}