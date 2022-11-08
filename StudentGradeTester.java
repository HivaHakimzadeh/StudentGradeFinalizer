/**
 * StudentGradeTester class
 * Contains the code to test the methods of the StudentGrade class
 * Creates an instance of a StudentGrade, fills it with data, and displays
 * all information to the screen.  
 * Created 10/11/2022
 * @author Hiva Hakimzadeh 1437-200
 */

import java.util.Scanner;

public class StudentGradeTester {

	public static void main(String[] args) {
		String name1;
		Scanner kbd = new Scanner(System.in);
		System.out.println("Welcome to the Student Grades Program");
		System.out.print("Enter the name for the student: ");
		name1 = kbd.nextLine();
		
		//create an instance of StudentGrade, passing in the name given above
		StudentGrade s1 = new StudentGrade(name1);
		
		//prints out all current information about the student - their name and default
		//values of 0 for all scores and average
		System.out.println("Here is the current data for this student: ");
		System.out.println(s1);
		
		System.out.println("Please enter the following information for " + s1.getName());
	
		//TODO: complete the code to ask for quiz scores 1-3, the midterm exam, and the final exam
		double quiz1;
		do{
			System.out.print("Quiz 1: ");
			quiz1=kbd.nextDouble();
		}while(s1.setQuiz1(quiz1)==false);
		
		double quiz2;
		do{
			System.out.print("Quiz 2: ");
			quiz2=kbd.nextDouble();
		}while(s1.setQuiz2(quiz2)==false);
		
		
		double quiz3;
		do{
			System.out.print("Quiz 3: ");
			quiz3=kbd.nextDouble();
		}while(s1.setQuiz3(quiz3)==false);
		
		
		double midTerm1;
		do{
			System.out.print("Midterm Exam: ");
			midTerm1=kbd.nextDouble();
		}while(s1.setMidTerm(midTerm1)==false);
		
		double finalExam;
		do{
			System.out.print("Final Exam: ");
			finalExam=kbd.nextDouble();			//System.out.println();
		}while(s1.setFinalExam(finalExam)==false);
	
		//prints out all current information about the student, including average
		System.out.println("Here is the current data for this student: ");
		System.out.println(s1);
		kbd.close();
		
	}

}
