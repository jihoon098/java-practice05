package prob5;

public class MyStack{
	private int top = -1;
	private String[] buffer;

	
	//버퍼의 크기를 잘고려해야함.
	
	
	//top++;
	//buffer[top] ;
	
	public MyStack(int stackSize) {
		buffer = new String[stackSize];
	}
	
	
	
	public void push(String s) {
		
		
		++top;
		if(top > buffer.length-1) {
			String[] temBuffer = new String[buffer.length];  //기존 버퍼의 내용을 옮길 임시 버퍼만들기
			temBuffer = buffer;
			buffer = new String[buffer.length * 2]; //기존 버퍼의 크기2배인 버퍼만들기
						
			for(int i = 0; i < temBuffer.length; ++i) {
				buffer[i] = temBuffer[i];
			}
			
		}
		buffer[top] = s;

		
	}
	
	public String pop() throws MyStackException {
		
		if(top < 0) {
			String s = "stack is empty";
			MyStackException e = new MyStackException(s);
			throw e;
		}
			
		String s = buffer[top];		
		buffer[top] = null;
		top--;
		return s;
	}



	public boolean isEmpty() {
		
		if(top == -1) {
			return true;
		}else {
			return false;			
		}
		
	}
	
	
	
	
	
	
	
}