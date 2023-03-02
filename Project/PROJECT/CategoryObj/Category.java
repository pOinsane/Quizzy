package CategoryObj;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import QuestionObj.Question;

public class Category {
	
	private String CategoryLevel, CategoryType,CategoryName;
	private ArrayList<Question> questions ;
	private static final int QUESTION_COUNT = 5;
	
	
	public Category(){}

	public Category(String categoryLevel, String categoryType, String categoryName, ArrayList<Question> questions) {
		super();
		CategoryLevel = categoryLevel;
		CategoryType = categoryType;
		CategoryName = categoryName;
		this.questions = questions;
	}

	public String getCategoryLevel() {
		return CategoryLevel;
	}

	public void setCategoryLevel(String categoryLevel) {
		CategoryLevel = categoryLevel;
	}

	public String getCategoryType() {
		return CategoryType;
	}

	public void setCategoryType(String categoryType) {
		CategoryType = categoryType;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
	
	

	@Override
	public String toString() { 
		String res = "Category \nCategoryLevel = " + CategoryLevel + "\nCategoryType = " + CategoryType + "\nCategoryName = "
		+ CategoryName + "\n\nQUESTIONS OF THE CATEGORY\n ";
		for(Question obj : questions) {
			res += obj.toString() + "\n";
		}
		return res;
	}

	public static int getQuestionCount() {
		return QUESTION_COUNT;
	}
		
		

}
