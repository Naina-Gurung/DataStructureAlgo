package stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st = new Stack(5);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		st.pop();

	}

}
