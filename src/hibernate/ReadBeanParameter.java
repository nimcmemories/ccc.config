package hibernate;

public class ReadBeanParameter {
	public String string;
	public String propertyName;
	public String value;

	public ReadBeanParameter(String string, String propertyName, String value) {
		this.string = string;
		this.propertyName = propertyName;
		this.value = value;
	}
}