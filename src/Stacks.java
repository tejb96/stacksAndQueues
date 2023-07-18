import java.util.Arrays;
public class Stacks {
	int max=10;
	String stack[] = new String[max];
	int top=-1;
	
	public void push(String data) {
		if(top==max-1) {
			System.out.println("Stack full");
			return;
		}
		else {
			top+=1;
			stack[top]=data;
//			System.out.println(data+"pushed into stack");
		}
	}
	
	public String pop() {
		String data;
		if(top==-1) {
			System.out.println("stack empty");
			return "";
		}
		
		else {
			data=stack[top];
			stack[top]="";
			top-=1;
		}
//		System.out.println("popped from stack");
		return data;
	}
	
	public void display() {
		System.out.println(Arrays.toString(stack).replace("[", "").replace("]", "").replace(",", ""));	
	}

}
