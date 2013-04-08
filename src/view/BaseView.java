package view;

import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import bean.BaseBean;

import hibernate.HibernateUtil;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

abstract public class BaseView {
	private ArrayList<String> columnHeadings = null;
	private ArrayList<JSONObject> columnData = null;
	abstract public void readParam(BaseBean baseBean);
	abstract public void prepareView();
	abstract public void setColumnList(String string);
	/**
	 * @return the columnList
	 */
	BaseView(){
		columnData = new ArrayList<JSONObject>();
		columnHeadings = new ArrayList<String>();
	}
	
	public void addColmnList(String string){
		columnHeadings.add(string);
	}
	public ArrayList<String> getColumnHeadings() {
		return columnHeadings;
	}
	public void setColumnHeadings(ArrayList<String> columnHeadings) {
		this.columnHeadings = columnHeadings;
	}
	public String getColumnData() {
		Iterator<JSONObject> iterator  = columnData.iterator();
		String jsonString= new String("");
		while(iterator.hasNext())
			jsonString = jsonString + iterator.next();
		return jsonString;
	}
	public void setColumnData(JSONObject columnData) {
		this.columnData.add(columnData);
	}
}
