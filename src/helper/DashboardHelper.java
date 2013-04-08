package helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;


import net.sf.json.JSONObject;

import view.BaseView;

import bean.BaseBean;

public class DashboardHelper extends BaseHelper{
	public DashboardHelper(HttpServletRequest req) {
		super(req);
	}
	public void prepareView(){
		
	}
	@Override
	public void validateRequest(HttpServletRequest request, BaseBean baseBean) {
		
	}
	@Override
	public void prepareManagePage(HttpServletRequest request,BaseView baseView) {
		baseView.prepareView();
	}
	public static JSONObject listBranch(String depot) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				 Runtime.getRuntime().exec("ls -1 " + depot).getInputStream()));
		JSONObject jsonObject = new JSONObject();
		String directory =null;
		
		ArrayList<JSONObject> jsonArrayList = new ArrayList<JSONObject>();
		while((directory=reader.readLine())!=null){
			File file = new File(depot+"/"+directory);
			System.out.println(file.toString());
			if(file.isDirectory()){
				//IS BRANCH CAN BUILD ITSELF
				//File BBCEXISTS = new File(directory+"/bbc");
				//if(BBCEXISTS.isDirectory()){
				JSONObject jobject  = new JSONObject();
				jobject.put("Action","Action");
				jobject.put("Branch",file.getName());
				jobject.put("Process","Proc");
				jsonArrayList.add(jobject);
				System.out.println(jsonArrayList);
				//}
			}
		}
		jsonObject.put("BranchList",jsonArrayList);
		System.out.println(jsonObject);
		return jsonObject;
	}
}
