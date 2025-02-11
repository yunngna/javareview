package lambdaStream;

public class EmpVO {
	String name;
	int sal;
	
	//생성자 
	
	//기본생성자
	public EmpVO() {}
	
	public EmpVO(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	
	//string으로 출력 되도록 추가 ToString 추가
	@Override
	public String toString() {
		return "EmpVO [name=" + name + ", sal=" + sal + "]";
	}

	//setter, getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
