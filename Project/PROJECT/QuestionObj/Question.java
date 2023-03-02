package QuestionObj;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question {

	private static final int  OPTION_SIZE = 3;
	private String questionText, questionAnswer;
	private String[] questionOptions =  new String[OPTION_SIZE];
	
	
	public Question(){};
	
	
	

	public Question(String questionText, String questionAnswer, String[] questionOptions) {
		super();
		this.questionText = questionText;
		this.questionAnswer = questionAnswer;
		this.questionOptions = questionOptions;
	}


	public String getQuestionText() {
		return questionText;
	}

	@Override
	public String toString() {
		return "Question \nquestionText = " + questionText + "\nquestionAnswer = " + questionAnswer + "\nquestionOptions = "
				+ Arrays.toString(questionOptions) + "\n";
	}




	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}


	
	public String[] getQuestionOptions() {
		return questionOptions;
	}



	public void setQuestionOptions(String[] questionOptions) {
		this.questionOptions = questionOptions;
	}
	

	
	
	
	
	
	
	
}
