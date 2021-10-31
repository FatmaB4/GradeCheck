import java.util.Scanner;
public class Grade
{
	public static String getLetterGrade()
	{
    Scanner keyboard= new Scanner(System.in);
    System.out.print("Enter a number grade: ");
   int numGrade= keyboard.nextInt();
    if(numGrade>=90){
		  String letGrade="A";
      return letGrade;
    }
    else if(numGrade>=80 && numGrade<90){
      String letGrade="B";
      return letGrade;
    }
    else if(numGrade>=75 && numGrade<80){
      String letGrade="C";
      return letGrade;
    }
    else if(numGrade>=70 && numGrade<75){
      String letGrade="D";
      return letGrade;
    }
    else{
      String letGrade="F";
      return letGrade;
    }
    
	}
}