import java.util.Scanner;

public class StudentGradeCalculator {

    public static void calculator(String name){
        Scanner sc = new Scanner(System.in);
        System.out.println("MATHS: ");
        int maths = sc.nextInt();
        System.out.println("SCIENCE: ");
        int science = sc.nextInt();
        System.out.println("COMPUTER: ");
        int computer = sc.nextInt();
        System.out.println("SOCIAL SCIENCE: ");
        int socialsc = sc.nextInt();
        System.out.println("ENGLISH: ");
        int english = sc.nextInt();

        int totalMarks=maths+science+computer+socialsc+english;
        int percentage= totalMarks/5;
        char grade='p';
        if(percentage>90 && percentage<=100)
        {
            grade='A';
        }
        else if(percentage>80 && percentage<=90)
        {
            grade='B';
        }
        else if(percentage>70 && percentage<=80)
        {
            grade='C';
        }
        else if(percentage>60 && percentage<=70)
        {
            grade='D';
        }
        else if(percentage>50 && percentage<=60)
        {
            grade='E';
        }
        else if(percentage<=50)
        {
            grade='F';
        }
        else {
            System.out.println("Invalid");
        }
        System.out.println();
        System.out.println("NAME: "+name);
        System.out.println("Total Marks: "+totalMarks+" \nAverage Percentage: "+percentage+"%");
        if(grade=='F')
        {
            System.out.println("Grade: FAIL");
        }
        else
        {
            System.out.print("Grade: "+grade);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Please Enter Your Marks Below (out of 100): ");
        calculator(name);
    }
}
