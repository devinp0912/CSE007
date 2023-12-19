/* Devin Pombo
 * 11/16/22
 * CSE007 - Classwork
 * Purpose: Practice inheritance/object oriented programming
 */

public class Course{
    private String courseNumber;
    private String courseTitle;
    private static int numCourses = 0;


    public Course(){
        this.courseNumber = "";
        this.courseTitle = "";
        numCourses++;
    }
    public Course(String courseNumber, String courseTitle){
        this.courseNumber = courseNumber;
        this.courseTitle = courseTitle;
        numCourses++;
    }

    public String getCourseNumber(){
        return courseNumber;
    }
    public String getCourseTitle(){
        return courseTitle;
    }
    public void setCourseNumber(String courseNumber){
        this.courseNumber = courseNumber;
    }
    public void setCourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }
    public static int getNumCourses(){
        return numCourses;
    }
    //Override toString
    public String toString(){
        return ("Course Information:\n Course Number: " + getCourseNumber() + "\n Course Titled: " + getCourseTitle());
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Course){
            Course c = (Course)obj;
            return courseNumber.equals(c.getCourseNumber());
        }else{
            return false;
        }
    }
}