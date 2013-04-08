package bean;

import java.util.ArrayList;

import net.sf.json.JSONObject;

public class UserBean extends BaseBean {
	private int id,loginid;
	private String firstname,lastname,mob,midname;
	
	public String getMidname() {
		return midname;
	}
	public void setMidname(String midname) {
		this.midname = midname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	@Override
	public JSONObject toJSON() {
		JSONObject jsonObject = new JSONObject();
		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add(this.getId());
		arrayList.add(this.getFirstname());
		arrayList.add(this.midname);
		arrayList.add(this.lastname);
		arrayList.add(this.getMob());
		jsonObject.put("UserBean", arrayList);
		return jsonObject;
	}
}
