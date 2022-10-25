//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		Stack<Integer> result = new Stack<>();
		result = helper(result, s, s.peek());
		return result;
	}
	public Stack<Integer> helper(Stack<Integer> result, Stack<Integer> inputStack, int currentTopElement){
		
		if(result.isEmpty()) {
			result.push(currentTopElement);
		}
		
		else if(currentTopElement < result.peek()) {
			Stack<Integer> auxStack = new Stack<Integer>();
			//emtpy result
			while(!result.isEmpty() && result.peek() > currentTopElement) {
				auxStack.push(result.pop());
			}
			result.push(currentTopElement);
			
			//refill result
			while(!auxStack.isEmpty()) {
				result.push(auxStack.pop());
			}
			
		}
		else {
			result.push(currentTopElement);
		}
		inputStack.pop();
		if(inputStack.isEmpty()) {
			return result;
		}
		result = helper(result, inputStack, inputStack.peek());
		return result;
	}
}