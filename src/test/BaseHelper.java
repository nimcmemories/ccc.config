package test;

public class BaseHelper {
	public String display(String hello){
		System.out.println("display of base");
		return "don";
	}
	public void getdata(){
		System.out.println(this.getClass());
	}
}
