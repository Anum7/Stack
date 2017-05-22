public class Test {
	public static void main(String[] args){
		Stack st = new Stack();
		//creating a stack with 10 elements
		st.push(23);
		st.push(7);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7); 
		st.push(8);
		st.pop();
		st.printElements();
		System.out.println();
		st.peek();
		System.out.println();
		
		if (st.isEmpty()){
			System.out.println("True");
		} else { 
			System.out.println("False");
		}
	
	}
}
