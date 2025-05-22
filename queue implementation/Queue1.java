public class Queue1{
	int queue[] = new int[5];
	int size;
	int rear;
	int front;
	
	public void enQueue(int data){
		if(!isFull()){
			queue[rear] = data;
			rear++;
			size++;
		}
		else {
			System.out.println("Queue is full");
		}
	}
	
	public int deQueue(){
		int data=0;
		if(isEmpty()){
			System.out.println("Queue is empty");
		} else {
			data = queue[front];
			front++;
			size--;
		}
		return data;
	}
	
	public int getSize()
	{
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public boolean isFull(){
		return size==5;
	}
	
	public void show(){
		System.out.print("Elements : ");
		for(int i=0;i<size; i++){
			System.out.print(queue[front+i]+" ");
		}
	}
}