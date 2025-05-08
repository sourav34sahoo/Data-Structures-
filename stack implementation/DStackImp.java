public class DStackImp
{
	public static void main(String...args) {
		DStack num = new DStack();
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
		
		num.pop();
		num.show();
		num.pop();
		num.show();
		num.pop();
		num.show();
		num.pop();
		num.show();
		
	}
}
/* O/P
10 0
10 20
10 20 30 0
10 20 30 40
10 20 30 40 50 0 0 0
10 20 30 40 0 0 0 0
10 20 30 0 0 0 0 0
10 20 0 0
10 0
*/