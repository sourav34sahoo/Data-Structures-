public class StackImp
{
	public static void main(String...args){
		Stack num = new Stack();
		num.push(10);
		num.push(15);
		num.push(8);
		
		System.out.println(num.peek());
		
		//System.out.println(num.pop());
		num.show();
	}
}