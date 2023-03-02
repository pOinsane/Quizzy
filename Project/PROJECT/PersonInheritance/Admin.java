package PersonInheritance;
import java.sql.Date;
import java.util.HashMap;

import Interface.AuditLog;

public class Admin extends Person implements AuditLog {

	private static final int ADMIN_ID = 22003159;
	private static final String ADMIN_PASS = "1111";
	private HashMap<String,Candidate> adminActivity = new HashMap<>();
	
	public Admin(){}
	

	public Admin(String type, Date dateCreated) {
		this.type = type;
		this.dateCreated = dateCreated;
	}
	

	public HashMap<String, Candidate> getAdminActivity() {
		return adminActivity;
	}

	public void setAdminActivity(HashMap<String, Candidate> adminActivity) {
		this.adminActivity = adminActivity;
	}

	public static int getAdminId() {
		return ADMIN_ID;
	}

	public static String getAdminPass() {
		return ADMIN_PASS;
	}


	public String getInfo() {
		return "You entered as an admin now you can\n do Candidate addition, deletion,search ,\n update ,display opearations as the admin";
		
	}
	public String displayActivity() {
		String res = "";
		for(String obj : adminActivity.keySet()) {
			res+= obj + "action done on candidate" + adminActivity.get(obj).getName() +"with id"+adminActivity.get(obj).getId() + "\n";
			
		}
		return res;
		
	}
	
	public void setAdminActivity(String activiy, Candidate doneOnCandidate) {
		adminActivity.put(activiy, doneOnCandidate);
		
	}
	//set activity 
}
