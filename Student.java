package icardgeneratorsystem;

//Student Form
import java.util.Scanner;
public class Student 
{
    int rollNo;
    String name;
    String semester;
    String year;
    String address;
    void setStudentRecord()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll No");
        rollNo=sc.nextInt();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter Semester");
        semester=sc.next();
        System.out.println("Enter year");
        year=sc.next();
        System.out.println("Enter Address");
        address=sc.next();
    }
    void showStudentRecord()
    {
        System.out.println("Roll no. is => "+rollNo);
        System.out.println("Name is => "+name);
        System.out.println("Semester is => "+semester);
        System.out.println("Year is => "+year);
        System.out.println("Address is => "+address);
    }
    public static void main(String args[])
    {
        Student obj=new Student();
        obj.setStudentRecord();
        obj.showStudentRecord();
    }
}
