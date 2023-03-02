package SystemandMain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import CategoryObj.Category;
import QuestionObj.Question;

public class FileReadSys {

	//readdromFile 
	public static final String categoryFileName ="categories.txt";
	public static final String questionFileName = "questions.txt";
	
	
	private static ArrayList<Category> categoryArray =  new ArrayList<>();
	private static final int QUESTION_COUNT = 5;
	private static final int OPTION_COUNT = 3;

	//Reads file from two files simultaneously  and creates category objects 
	public static void  readFromFiles() throws FileNotFoundException {
		
		File categoryFile = new File(categoryFileName);
		File questionFile = new File(questionFileName);
		
		
		Scanner categoryScanner =  new Scanner(categoryFile);
		Scanner questionScanner = new Scanner(questionFile);
		
		
		String categoryLine;
		String[] categoryContent;
		
		String questionLine;
		String[] questionContent;
		
		String[] optionContent = new String[OPTION_COUNT];
		int optionIndex = 0;
		
		Category categoryObj;
		Question questionObj;
		ArrayList<Question> questionArray;
		
		
		
		
		while(categoryScanner.hasNext()) {
			
			categoryLine = categoryScanner.nextLine();
			categoryContent =  categoryLine.split(",");
			
			questionArray = new ArrayList<Question>();
			
			for(int i = 0; i < QUESTION_COUNT; i++) {
				
				questionLine = questionScanner.nextLine();
				//System.out.println(questionLine);
				questionContent = questionLine.split(",");
				
				//System.out.println(Arrays.toString(questionContent));
				
				String[] toIterate = questionContent[2].split("%");
				
				//System.out.println(Arrays.toString(toIterate));
				
				for(String option : toIterate ) {
					optionContent[optionIndex] = option;
					optionIndex++;
					//System.out.println("here");
		
				}
				optionIndex = 0;
				questionObj = new Question(questionContent[0],questionContent[1],optionContent);
				questionArray.add(questionObj);
				//System.out.println(questionObj.toString());
				
				//System.out.println(Arrays.toString(optionContent));
				//System.out.println("Question Array" + questionArray);
				
				
			}
			
			categoryObj = new Category(categoryContent[0],categoryContent[1],categoryContent[2],questionArray);
			categoryArray.add(categoryObj);
			
			
			
		}
		
	
		}
	
	public static String displayCategoryObjects(){
		String res = "";
		for(Category categoryObj: categoryArray) {
			res +=  categoryObj.toString() + "\n\n";
		}
		return res;
	}
	
	
	
	
	

	
	
	
	
}
