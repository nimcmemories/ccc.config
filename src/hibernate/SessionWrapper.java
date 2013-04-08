package hibernate;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import bean.BaseBean;

public class SessionWrapper {
	private Session sessionWrapper = null;
	/*
	 * 
	 * */
	public Object readBean(String bean,String propertyName,String value){
		try{
			sessionWrapper = HibernateUtil.getSessionFactory().openSession();
			Criteria criteria = sessionWrapper.createCriteria(bean).add(Restrictions.eq(propertyName, value));
			return criteria.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sessionWrapper.flush();
			sessionWrapper.close();
		}
		return null;
	}//END OF READ BEAN METHOD
	public Iterator<BaseBean> readListOfBean(Class classObject){
		ArrayList<BaseBean> baseBean = null;
		try{
			sessionWrapper = HibernateUtil.getSessionFactory().openSession();
			baseBean =(ArrayList<BaseBean>)sessionWrapper.createCriteria(classObject).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sessionWrapper.flush();
			sessionWrapper.close();
		}
		return baseBean.iterator();
	}
	
}
