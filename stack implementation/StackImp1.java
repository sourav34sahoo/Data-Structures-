public class StackImp1
{
	public static void main(String...args){
		Stack1 num = new Stack1();
		num.push(10);
		num.show();
		num.push(20);
		num.show();
		num.push(30);
		num.show();
		num.push(40);
		num.show();
		num.push(50);
		num.show();
		System.out.println(num.pop());
		System.out.println(num.pop());
		System.out.println(num.pop());
		System.out.println(num.pop());
		System.out.println(num.pop());
		System.out.println(num.pop());
		
	}
}