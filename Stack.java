public class Stack {
	private static final int capacity = 10; 
	public int ary[];
	int top = -1;
	
	//Constructor
	public Stack() {
		this.ary = new int [capacity];
	}
	
	//delete the element on the top of the stack
	public boolean pop(){
		if (top>=0){
			System.out.println("Pop operation done! \n"+ ary[top] + " is popped");
			top--;
			return true;
		} else{
			System.out.println("Stack overflow!");
			return false;
		}
	}
	
	//pushes the element c onto the stack
	public boolean push(int c){
		if(top < capacity-1){
			top++;
			ary[top]=c;
			System.out.println("Element " + c + " is pushed to Stack!");
			printElements();
			System.out.println();
			return true;
		} else {
			System.out.println("Stack Overflow1");
			return false;
		}
		
	}
	
	//returns the element on the top of the stack (doesn’t remove it!)
	public int peek(){
		if (top == -1) {
            System.out.println("Cannot peek into empty stack");
            return 0;
		} else {
		int a = ary[top];
		System.out.println("Peek is: "+ a);
		printElements();
		return a;
		}
	}
	
	//check whether the stack is empty
	public boolean isEmpty(){
		System.out.print("Is the stack empty? " );
		if(top == -1){
			return true;
		}else {
			return false;
		}
	}
	//printing out the array
	public void printElements(){
		if(top>=0){
			System.out.println("Elements in stack are(top->bottom)");
			for(int i = top; i>=0; i--){
				System.out.print(ary[i] + " ");
			}
			System.out.println();
		}
	}
}
