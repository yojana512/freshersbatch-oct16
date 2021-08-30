package com.springcore2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private String question;
	//private String answers;
	//private List<String> answers;
	private Set<String> answers;
	//private Map<Integer,String> answers;
	
	
	public Question() {}  
	public Question(int questionId, String question, Set<String> answers) {  
	    super();  
	    this.questionId = questionId;  
	    this.question = question;  
	    this.answers = answers;  
	}  
	  
	public void displayInfo(){  
	    System.out.println(questionId +" Question: "+ question);  
	    System.out.println("Answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
	  

}
