import java.util.Scanner;

class Grade {
    int noOfSubject, marks, i;
    double totalMarks = 0;
    double average, percentage;

    public void Subject() {
        System.out.println("ENTER NUMBER OF SUBJECTS:-");
        Scanner sc = new Scanner(System.in);
        noOfSubject = sc.nextInt();

    }

    public void Marks() {
        for (i = 1; i <= noOfSubject; i++) {
            System.out.println("Enter marks for subject" + i);
            Scanner sc = new Scanner(System.in);
            marks = sc.nextInt();
            totalMarks = totalMarks + marks;
        }
        System.out.println("Total Marks :-"+totalMarks);
        average = totalMarks / (i-1);
        System.out.println("Average number is:-" + average);
        percentage = totalMarks /(i-1) ;
        System.out.println("Percentage:-" + percentage+"%");
       if(percentage>=90){
        System.out.println("Grade is'A'");
       }
       else if(percentage>=80 ){
        System.out.println("Grade is'B'");
       }
        else if(percentage>=70 ){
        System.out.println("Grade is'C'");
       }   
       else if(percentage>=60 ){
        System.out.println("Grade is'D'");
       }   
       else if(percentage>=50 ){
        System.out.println("Grade is'E'");
       }  
        else if(percentage>=40 ){
        System.out.println("Grade is'E-'");
       }   
       else {
        System.out.println("Grade is'F' or Fail");
       }
    }
    
}

public class Student_Grading_System {
    public static void main(String args[]) {
        Grade obj = new Grade();
        obj.Subject();
        obj.Marks();

    }

}
