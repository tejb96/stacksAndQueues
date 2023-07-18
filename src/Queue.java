import java.util.Scanner;
public class Queue {
	private Stacks inputStack;
	private Stacks outputStack;
	
	public Queue() {
		inputStack =new Stacks();
		outputStack =new Stacks();
	}
	
	public void enqueue(String data) {
		inputStack.push(data);
	}
	
	public String dequeue() {
		if(inputStack.top==-1&&outputStack.top==-1) {
			System.out.println("Queue is empty");
		}
		if(outputStack.top==-1) {
			transferElements();
		}
		return outputStack.pop();
	}
	
	void transferElements(){
		while(inputStack.top!=-1) {
			outputStack.push(inputStack.pop());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter 10 string elements: ");
		
		System.out.println();
		
		for(int i=0; i<10;i++) {
			q.enqueue(reader.next());
		}
		reader.close();
		System.out.println();
		
		System.out.println("Initial stack after pushing all inputs:");
		q.inputStack.display();
		
		System.out.println();
		
		System.out.println("Final stack output to mimic queue operation:");
		for(int i=0; i<10;i++) {
			System.out.print(q.dequeue()+" ");
		}
		
		System.out.println();
		
		System.out.println('\n' +"Logic: Two instances of the Stacks class are used in Queue class(inputStack, and outputStack).");
		System.out.println("The enqueue method pushes the words onto inputStack.");
		System.out.println("The dequeue method transfers and reorders the words onto outputStack ensuring FIFO and returns first word using Stacks pop method");

	}

}
