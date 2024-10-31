
package lab4;
public class CollegeSystem {
    public static void main(String[] args) {
        Course c1 = new Course("Data Structures", 4, 12, "Dr.Mahmoud");
        Course c2 = new Course("Programming", 3, 10, "Dr.Christine");
        Course c3 = new Course("intro to ai", 2, 103, "Dr.Tamer");
        
        student s1 = new student("rewan mostafa","23010121");
        student s2 = new student("sarah mohareb","23010085");

        
        s1.enroll_on_a_Course(c1);
        s1.enroll_on_a_Course(c2);
        s2.enroll_on_a_Course(c1);
        s2.enroll_on_a_Course(c3);
        
        System.out.println("Enrolled courses for "+s1.student_name+":");
        s1.printEnrolledCourses();
        s1.printTotalCreditHours();
        System.out.println();
        
        System.out.println("Enrolled courses for "+s2.student_name+":");
        s2.printEnrolledCourses();
        s2.printTotalCreditHours();
        System.out.println();
        
        System.out.println("Courses by Lecturer Dr.Mahmoud for " + s1.student_name+ ":");
        s1.printLecturerCourses("Dr.Mahmoud");
        System.out.println();
        
        System.out.println("Courses by Lecturer Dr.Christine for " + s2.student_name+ ":");
        s2.printLecturerCourses("Dr.Christine");
    }
}