package SystemandMain;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import PersonInheritance.Candidate;

public class CandidateSys {
	
	private static ArrayList<Candidate> candidateArray = new ArrayList<>();
	
	
	public static void readCurrentCandidates(String filename) throws FileNotFoundException //reads the current data from the file 
	//as we want to hold the data from the previous users
	{
		File candidatesToRead = new File(filename);
		Scanner fileScanner = new Scanner(candidatesToRead);
		while(fileScanner.hasNext()) {
			String[] content = fileScanner.nextLine().split("%");
			candidateArray.add(new Candidate(content[0], Integer.parseInt(content[1]), Integer.parseInt(content[2])));
		}
		fileScanner.close();
		
	}
	public static void addCandidate(String name, int id ,String type) { //takes the values from related jFrame and creates a candidate object if it 
		//Doesn't exist and adds to arrayList
		for(Candidate obj : candidateArray) {
			if(obj.checkId(id))
				return;
		}
	
		Date date = new Date();
		
		Candidate newObj = new Candidate(type, date ,name,id);
		candidateArray.add(newObj);
		
		
		
	}
	public static boolean removeCandidate(int id)
	//Removes the candidate from the arrayList
	{
		for(Candidate obj : candidateArray) {
			if(obj.checkId(id)) {
				candidateArray.remove(obj);
				return true;
			}
			
			
		}
		return false;
		
	}
	
	public static Candidate searchCandidate(int id) {//Finds and return the Candidate object
		for(Candidate obj : candidateArray) {
			if(obj.checkId(id))
				return obj;
			
		}
		return null;
	}
	
	public static boolean updateCandidate(String name , int id , int score ){ //Searchs according to id and changes the candidate
		//according to entered input from jFrame (For example admin can cut points from  the specific candidate with this functionality 
		for(Candidate obj : candidateArray) {
			if(obj.checkId(id)) {
				obj.setId(id);
				obj.setScore(score);
				obj.setName(name);
				return true;
				
			}
			
		}
		return false;
		
	}
	
	public static String displayCandidates(){
		String res  = "";
		for(Candidate obj : candidateArray) {
			res+= obj.toString();
			
		}
		return res;
		
	}
	
	public  static int calculateScore(int id) { //Calculates the score of the admin by the info of its activity
		//i.e how many questions this he/she answered correct. As if the answer is correct the value of the array'S second position
		//which corresponds to spesific key will be 1 and otherwise 0 we just added these numbers. 
		
		for(Candidate obj : candidateArray) {
			int score = 0;
			if(obj.checkId(id)){
				for(int[] arr : obj.getCandidateActivity().values()) {
					score += arr[1];
				}
				return score;
			}
		
			
		}
		return -1;		
	}
	
	public static void saveChanges(String filename) throws FileNotFoundException {//When admin finishes his/her operations on candidate array
		//and clicks save button or a candidate logins to the system by entering name and id this function will be called and the new arrayList content will 
		// be written in to the file which will further be opened by  readCurrentCandidates() method in a different runtime. So we saved the data from previous
		//users in this way
		PrintWriter pw = new PrintWriter(filename);

		for(Candidate obj : candidateArray) {
			pw.print(obj.formtoWriteToFile());
		
		}	
	}
	
	

}
