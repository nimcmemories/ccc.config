package map;

import bean.BaseBean;
import helper.BaseHelper;

public interface MapHelperBean {
	public Class<BaseBean> getBeanClass(String className);
	public Class<BaseHelper> getHelperClass(String className);
}
