public class QueueImp
{
	public static void main(String...args){
		Queue1 num = new Queue1();
		num.enQueue(18);
		num.enQueue(29);
		num.enQueue(45);
		num.enQueue(79);
		num.enQueue(45);
		num.enQueue(79);
		
		System.out.println(num.deQueue());
		System.out.println(num.deQueue());
		System.out.println("Size : "+num.getSize());
		System.out.println("Empty : "+num.isEmpty());
		System.out.println("Full : "+num.isFull());
		num.show();
	}
}