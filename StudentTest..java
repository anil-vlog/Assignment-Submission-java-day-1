import java.util.Scanner;

public class StudentTest
{
    private String name;
	private int  rollno;
    private int eng;
    private int hn;
    private int mts;
    private double total;
    
    public void input () 
	{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = in.nextLine();
		System.out.print("Enter student rollno: ");
        rollno = in.nextInt();
        System.out.print("Enter marks in English: ");
        eng = in.nextInt();
        System.out.print("Enter marks in Hindi: ");
        hn = in.nextInt();
        System.out.print("Enter marks in Maths: ");
        mts = in.nextInt();
    }
    
    public void total() 
	{
        total = eng + hn + mts;
    }
    
    public void display() {
        System.out.println("Name: " + name);
		System.out.println("Rollno: " + rollno);
        System.out.println("Marks in English: " + eng);
        System.out.println("Marks in Hindi: " + hn);
        System.out.println("Marks in Maths: " + mts);
        System.out.println("Total Marks: " + total);
    }
    
    public static void main(String args[]) {
        StudentTest obj = new StudentTest();
        obj.input();
        obj.total();
        obj.display();
    }
}