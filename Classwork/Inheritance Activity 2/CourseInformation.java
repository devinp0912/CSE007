public class CourseInformation{
    public static void main(String [] args){
         Course myCourse = new Course();
         System.out.println("Courses: "+ Course.getNumCourses());
         OfferedCourse single = new OfferedCourse("Prof. Kalafut", "Spring 2023", "3:00-4:15 PM");
         System.out.println("Courses: "+ Course.getNumCourses());
         System.out.println("Offered Courses: "+ OfferedCourse.getNumOfferings());
         OfferedCourse[] schedule = new OfferedCourse[3];
         System.out.println("Courses: "+ Course.getNumCourses());
         System.out.println("Offered Courses: "+ OfferedCourse.getNumOfferings());

         schedule[0] = new OfferedCourse();
         schedule[0].setClassTime("1:35-2:50PM");
         schedule[0].setInstructorName("Prof. Oudghiri");
         schedule[0].setTerm("Spring2023");
         System.out.println("Courses: "+ Course.getNumCourses());
         System.out.println("Offered Courses: "+ OfferedCourse.getNumOfferings());
         schedule[1]=new OfferedCourse("Prof. Spear", "Spring2023", "10:45-12:00PM");
         schedule[2]=new OfferedCourse("Prof. Chow", "Spring2023", "3:00-4:15PM");
         System.out.println("Courses: "+ Course.getNumCourses());
         System.out.println("Offered Courses: "+ OfferedCourse.getNumOfferings());
         myCourse.setCourseNumber("CSE007");
         myCourse.setCourseTitle("Introduction to Programming");
         System.out.println(myCourse.toString());
         schedule[0].setCourseNumber("CSE 017");
         schedule[0].setCourseTitle("Data Structures (Java Programming)");
         System.out.println(schedule[0].toString());
         System.out.println(" Instructor Name: " + schedule[0].getInstructorName());
         System.out.println(" Term: " + schedule[0].getTerm());
         System.out.println(" Class Time: " + schedule[0].getClassTime());
         System.out.println(myCourse.getCourseNumber().equals(schedule[0].getCourseNumber()));
    }   
    }