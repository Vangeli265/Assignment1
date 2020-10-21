public class Student{
  //declaring variables
private String name;
private double[] grades;
private int totalNoOfStudents;

Student(){}

  //constructor
Student(String name,double []grades,int totalNoOfStudents){
  this.name=name;
  this.totalNoOfStudents=totalNoOfStudents;
  this.grades=grades;
}

//setting name
  public void setName(String name){
    this.name=name;
  }
  //get name method
  public String getName(){
    return name;
  }

  //setting grades method
  public void setGrades(double[] grades){
      this.grades=grades;
  }
  //getting grades method
  public double[] getGrades(){
      return grades;

  }
  //set number of student method
  public void setNoOfStudents(int totalNoOfStudents){
    this.totalNoOfStudents=totalNoOfStudents;
  }
  //getting number of students method
  public int getNoOfStudents(){
    return totalNoOfStudents;
  }
  //calculating average
  public double getAverageGrade(double []grades){
    int sum=0;
      for(int x=0;x<3;x++){
      sum +=grades[x];
      }

    //calculating average of the grades
     double average=sum/3;
   return average;

  }
  //printing the student details
  public String printStudentDetails(){
  return "Student name is " + this.name + ", average grade is " + getAverageGrade(grades) + " and the current number of students is " + this.totalNoOfStudents;
  }
}
