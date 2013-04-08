package bean;

import java.util.ArrayList; 

import net.sf.json.JSON;
import net.sf.json.JSONObject;

public class LoginBean extends BaseBean{
	private int id;
	private String username,password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public JSONObject toJSON() {
		JSONObject jsonObj = new JSONObject();
		ArrayList<Object> arrayList  = new ArrayList<Object>();
		arrayList.add(this.getId());
		arrayList.add(this.getUsername());
		arrayList.add(this.getPassword());
		jsonObj.put("LoginBean",arrayList);
		return jsonObj;
	}
	
	
}