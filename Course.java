
package lab4;
public class Course {
     String name;
     int credit_hours;
     int id;
     String lecturer_name;
    
    public Course(String name, int credit_hours, int id, String lecturer_name) {
       this.name = name;
       this.credit_hours = credit_hours;
       this.id = id;
       this.lecturer_name = lecturer_name;
    }
}
    
    class student {
        String student_name;
        String phone_number;
        Course[] enrolled_courses;
   
    public student(String student_name, String phone_number) {
        this.student_name = student_name;
        this.phone_number = phone_number;
        this.enrolled_courses = new Course[6];
    }
    
    public void enroll_on_a_Course(Course course) {
       for (Course enrolled_courses : enrolled_courses) {
            if (enrolled_courses != null && enrolled_courses.name.equals(course.name)) {
                System.out.println("You are already enrolled on this course");
                return;  
        } 
    }
      boolean isEnrolled = false;
        for (int i=0;i<enrolled_courses.length;i++) {
            if (enrolled_courses[i] == null) {
                enrolled_courses[i] = course;
                isEnrolled = true;
                break;
            }
        }
        if (!isEnrolled) 
            System.out.println("You have reached the maximum limit");
    }
    public void printEnrolledCourses(){
        for(int i=0;i<enrolled_courses.length;i++){
           if(enrolled_courses[i]!=null ){
               System.out.println("Course "+(i+1)+": "+enrolled_courses[i].name+", "+enrolled_courses[i].credit_hours+", "+enrolled_courses[i].id +", "+enrolled_courses[i].lecturer_name);
               
           } 
        }
    }
    
    public void printTotalCreditHours() {
        int totalCreditHours = 0;
        for (Course enrolledCourse : enrolled_courses) {
            if (enrolledCourse != null) {
                totalCreditHours += enrolledCourse.credit_hours;
            }
        }
        System.out.println("Total credit hours: " + totalCreditHours);
    }
    
 public void printLecturerCourses(String lecturerName) {
        boolean hasCourses = false;
        for (Course enrolledCourse : enrolled_courses) {
            if (enrolledCourse != null && enrolledCourse.lecturer_name.equals(lecturerName)) {
                System.out.println("Course: " + enrolledCourse.name +", " + enrolledCourse.credit_hours + ", " + enrolledCourse.id +", " + enrolledCourse.lecturer_name);
                hasCourses = true;
            }
        }
        if (!hasCourses) 
            System.out.println("No courses for this lecturer");
    }
}