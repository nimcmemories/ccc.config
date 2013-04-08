package test;

public class ChildHelper extends BaseHelper{
	private String prop = null;
	
	
	public String display(String hello){
		System.out.println("child");
		return "child";
	}


	/**
	 * @return the prop
	 */
	public String getProp() {
		return prop;
	}


	/**
	 * @param prop the prop to set
	 */
	public void setProp(String prop) {
		this.prop = prop;
	}
}
