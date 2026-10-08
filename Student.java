import java.util.*;
class Student{
    String studentname;
    int rollnumber;
    double marks;
    String coursename;
    int coursecredits;
    Student(String studentname, int rollnumber, double marks, String coursename, int coursecredits){
        this.studentname = studentname;
        this.rollnumber = rollnumber;
        this.marks = marks;
        this.coursename = coursename;
        this.coursecredits = coursecredits;
    }
        double calculatefee(){
            return coursecredits*1500;
        }
        Boolean checkeligibility(){
            return marks>=50;
        }
        double calculatescholarship(){
            if(marks>=85){
            return 20;
            }
            else if(marks>=70){
                return 10;
            }else{
                return 0;
            }
        }
        double calculatefinalfee(){
            double fee = calculatefee();
            double scholarship = fee*calculatescholarship()/100;
            return fee-scholarship;
        }
        void displaydetails(){
            double fee = calculatefee();
            double scholarship = fee*calculatescholarship()/100;
            double finalfee = calculatefinalfee();
            System.out.println("student course details");
            System.out.println("Student name :"+studentname);
            System.out.println("roll number :"+rollnumber);
            System.out.println("marks :"+marks);
            System.out.println("course name :"+coursename);
            System.out.println("course credits :"+coursecredits);
            System.out.println("eligibility: yes");
            System.out.println("total fee :Rs"+fee);
            System.out.println("scholarship :Rs"+scholarship);
            System.out.println("final fee :Rs"+finalfee);
        }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter student name:");
                String name = sc.nextLine();
                System.out.println("enter roll number:");
                int rollno = sc.nextInt();
                System.out.println("enter marks:");
                double marks = sc.nextDouble();
                sc.nextLine();
                System.out.println("enter course name:");
                String course = sc.nextLine();
                 System.out.print("Enter course credits: ");
                int credits = sc.nextInt();
                Student s = new Student(name,rollno,marks,course,credits);
                 if (s.checkeligibility()){
                    s.displaydetails();
            }else{
                System.out.println("Student is NOT eligible for course registration");
            }
    }
}