package helper;

import hibernate.SessionWrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import view.BaseView;

import bean.BaseBean;

import net.sf.json.JSONArray;

public abstract class BaseHelper {
	BaseHelper(){}
	public BaseHelper(HttpServletRequest req) {
		
	}
	abstract public void validateRequest(HttpServletRequest request,BaseBean baseBean);
	
	final public void insertOperation(HttpServletRequest request,BaseBean baseBean){
		validateRequest(request, baseBean);
		if(baseBean!=null){
			
		}
	}
	public  Object readRecord(String bean,String propertyName,String value){
		SessionWrapper sw = new SessionWrapper();
		return sw.readBean(bean, propertyName, value);
	}
	abstract public void prepareManagePage(HttpServletRequest request,BaseView baseView);
}
