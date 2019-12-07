package stack;

public class Stack {
	
	int[] arr;
	int top;
	int maxSize;
	
	
	Stack(int size){
		this.top=-1;
		arr = new int[size];
		this.maxSize = size;
	}

	public void push(int data) {
		if(!isFull()) {
		arr[++top]= data;
		}else {
			System.out.println(" Stack is Full");
		}
	}
	
	public int pop() {
		int data = -1;		
		if(!isEmpty()) {
			data = arr[top--];
		}else {
			System.out.println("Stack is Empty");
		}
		return data;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == (maxSize-1));
	}
	
}
