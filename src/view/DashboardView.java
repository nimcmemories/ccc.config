package view;

import hibernate.HibernateUtil;
import hibernate.SessionWrapper;

import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import bean.BaseBean;
import bean.UserBean;

public class DashboardView extends BaseView{
	private String userColumns = "firstname,lastname";
	public DashboardView() {
		super();
	}
	@Override
	public void readParam(BaseBean baseBean) {
		
	}

	@Override
	public void prepareView() {
		setColumnList(userColumns);
		Iterator listBean =  new SessionWrapper().readListOfBean(UserBean.class);
		while(listBean.hasNext()){
			UserBean userBean = (UserBean)listBean.next();
			setColumnData(userBean.toJSON());
		}
	}
	public void setColumnList(String string) {
		addColmnList(string);
	}

}
