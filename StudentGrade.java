/**
 * StudentGrade class
 * Contains the definition for a class to hold a student name
 * and multiple grades.  The class provides methods for toString,
 * equals, and get/set for the attributes.  
 * @author (you can put your name here)
 */

public class StudentGrade {

	private String name;
	private double quiz1;
	private double quiz2;
	private double quiz3;
	private double midterm;
	private double finalexam;
	
	
	final int numQuestions=15;
	private double computeAverage()
	{
		//TODO: complete. Remove stub code.
		double quiz= (((quiz1+quiz2+quiz3)/numQuestions)*100)*.25;
		double exam1=midterm*.35;
		double exam2=finalexam*.40;
		double avg = (quiz+exam1+exam2);
		return avg;
	}
	
	//TODO: no-argument constructor
	public StudentGrade() {
		name = null;
		quiz1=0;
		quiz2=0;
		quiz3=0;
		midterm=0;
		finalexam=0;
		
	}
	//TODO: constructor with a parameter for the name
	public StudentGrade(String name)
	{
		this.name=name;
	}
	/** 
	 * toString
	 * This method overrides the Object class' toString method
	 * @return the student information as a string.  All attributes are
	 * included, plus a call to the computeAverage() method for determining
	 * class average.
	 */
	
	public String toString()
	{
		//TODO: complete. Remove stub code.
		String str1= String.format("Name: %s\nQuiz 1: %.1f Quiz 2: %.1f Quiz 3: %.1f\nMidTerm Exam: %.1f\nFinal Exam: %.1f\nClass Average: %.1f\n", getName(),getQuiz1(),getQuiz2(),getQuiz3(),getMidTerm(),getFinalExam(),computeAverage());
		
		return str1;
	}
	
	/** 
	 * equals
	 * This method overrides the Object class' equals method
	 * @param 	student2	the student to which to compare this one
	 * @return 	true if student name is the same between this student
	 * 			and the passed in student.  false otherwise.
	 */
	
	public boolean equals(StudentGrade student2)
	{
		return this.getName().equals(student2.getName());
	}

	/**
	 * getName
	 * @return	name	the student's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * setName
	 * @param	n	the value to set our student name
	 */
	public void setName(String n) {
		name = n;
	}
	
	/**
	 * getQuiz1
	 * @return	quiz1	the first quiz score
	 */
	public double getQuiz1() {
		return quiz1;
	}

	/**
	 * setQuiz1
	 * @param	q1	the value to set our first quiz
	 * @return  true if quiz value is in the range 0-5.
	 * false if it is out of range
	 */
	public boolean setQuiz1(double q1) {
		boolean retVal = false;
		if (q1 >=0 && q1 <=5)
		{
			quiz1 = q1;
			retVal = true;
		}
		else {
			System.out.println("Valid quiz scores are 0-5.");
		}
		return retVal;
	}
	/**
	 * getQuiz2
	 * @return	quiz2 the second quiz score
	 */
	public double getQuiz2() {
		return quiz2;
	}
	/**
	 * setQuiz2
	 * @param	q2	the value to set our second quiz
	 * @return  true if quiz value is in the range 0-5.
	 * false if it is out of range
	 */
	public boolean setQuiz2(double q2) {
		boolean retVal = false;
		if (q2 >=0 && q2 <=5)
		{
			quiz2 = q2;
			retVal = true;
		}
		else {
			System.out.println("Valid quiz scores are 0-5.");
		}
		return retVal;
	}
	/**
	 * getQuiz3
	 * @return	quiz3 the third quiz score
	 */
	public double getQuiz3() {
		return quiz3;
	}
	/**
	 * setQuiz3
	 * @param	q3	the value to set our third quiz
	 * @return  true if quiz value is in the range 0-5.
	 * false if it is out of range
	 */
	public boolean setQuiz3(double q3) {
		boolean retVal = false;
		if (q3 >=0 && q3 <=5)
		{
			quiz3 = q3;
			retVal = true;
		}
		else {
			System.out.println("Valid quiz scores are 0-5.");
		}
		return retVal;
	}
	/**
	 * getMidTerm
	 * @return	midterm the Midterm exam score
	 */
	public double getMidTerm() {
		return midterm;
	}
	/**
	 * setMidTerm
	 * @param	m	the value to set our Midterm Exam
	 * @return  true if exam value is in the range 0-100.
	 * false if it is out of range
	 */
	public boolean setMidTerm(double m) {
		boolean retVal = false;
		if (m >=0 && m <=100)
		{
			midterm = m;
			retVal = true;
		}
		else {
			System.out.println("Valid Exam scores are 0-100.");
		}
		return retVal;
	}
	/**
	 * getFinalExam
	 * @return	finalexam the Final Exam score
	 */
	public double getFinalExam() {
		return finalexam;
	}
	/**
	 * setFinalExam
	 * @param	grade	the value to set our final exam
	 * @return  true if exam value is in the range 0-100.
	 * false if it is out of range
	 */
	public boolean setFinalExam(double grade) {
		boolean retVal = false;
		if (grade >=0 && grade <=100)
		{
			finalexam = grade;
			retVal = true;
		}
		else {
			System.out.println("Valid Exam scores are 0-100.");
		}
		return retVal;
	}
	
	
	
	
	
	
}