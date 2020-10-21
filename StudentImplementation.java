import java.util.Scanner;
import java.util.Arrays;

public class StudentImplementation{
   public static void main(String[] args) {
     Scanner input=new Scanner(System.in);

     //entering number of grades to input
        System.out.println("Enter number of Students to input:");
         int numberOfStudents=input.nextInt();







     System.out.println("Enter student's name:");

     //getting name from the user
     String name=input.next();

//grades array
      double grade[]=new double[3];
      double grades[]=new double[grade.length];

     //entering grades
			System.out.println( "Enter three grades for the Student:");
			for(int x=0;x<3;x++){
				grade[x]=input.nextDouble();
        grades[x]=grade[x];
      }
//creating the student object
    Student student1=new Student(name,grades,numberOfStudents);

//printing out the student's detals
   System.out.println(student1.printStudentDetails());

  }
}
