/* Devin Pombo
 * 11/16/22
 * CSE007 - Classwork
 * Purpose: Practice inheritance/object oriented programming
 */

public class OfferedCourse extends Course{
    private String instructorName;
    private String term;
    private String classTime;
    private static int numOfferings = 0;

    public CourseOffered(String instructorName, String term, String classTime){
        Super();
        this.instructorName = instructorName;
        this.term = term;
        this.classTime = classTime;
    }
}