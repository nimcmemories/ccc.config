package bean;

import net.sf.json.JSONObject;

public abstract class BaseBean {
	abstract public JSONObject toJSON() throws Exception;
}
