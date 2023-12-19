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

    public OfferedCourse(){
        super();
        this.instructorName = "";
        this.term = "";
        this.classTime = "";
        numOfferings++;
    }
    public OfferedCourse(String instructorName, String term, String classTime){
        super();
        this.instructorName = instructorName;
        this.term = term;
        this.classTime = classTime;
        numOfferings++;
    }

    public String getInstructorName(){
        return instructorName;
    }

    public String getTerm(){
        return term;
    }

    public String getClassTime(){
        return classTime;
    }

    public void setInstructorName(String instructorName){
        this.instructorName = instructorName;
    }
    public void setTerm(String term){
        this.term = term;
    }
    public void setClassTime(String classTime){
        this.classTime = classTime;
    }
    public String toString(){
        return (super.toString()); //+ " Instructor: " + getInstructorName() + "\n Term: " + getTerm() + "\n Class time: " + getClassTime());
    }
    public static int getNumOfferings(){
        return numOfferings;
    }
}