package SystemandMain;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import CategoryObj.Category;
import PersonInheritance.Admin;
import PersonInheritance.Candidate;


public class QuizMain {
	public static ArrayList<Category> categoryArray = new ArrayList<>();
	
	public static void main(String[] args) throws FileNotFoundException {
		//Frames and FileReadSys.readFromFiles()  will be called. So if txt file contains different
		//data different types of quizzes will be available for the user
		
		// TODO Auto-generated method stub
			
			//QuizMainFrame mainFrame = new  QuizMainFrame();
			
			
			//mainFrame.setVisible(true);
		
		Admin a = new Admin();
		a.displayActivity();
		a.toString();
		Candidate b = new Candidate();
		b.toString();
		System.out.println(a.toString());
		System.out.println(b.toString());
		
	
	
		   
		
			
	}

}
