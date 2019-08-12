package prob3;

public abstract class Bird {

	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public abstract void fly();
	
	public abstract void sing();
	
	//자신의 이름을 화면에 표시
	public abstract String toString();
	
	
}
