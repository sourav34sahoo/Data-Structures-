public class LLImp
{
	public static void main(String...args){
		
		LinkedList l = new LinkedList();
		l.insert(5);
		l.insert(25);
		
		
		l.insertAt(2,100);
		
		l.insertAtStart(15);
		l.insertAt(0,200);
		l.deleteAt(2);
		l.show();
	}
}

/* O/P 
Before delete
200
15
5
25
100
After delete
200
15
25
100
*/