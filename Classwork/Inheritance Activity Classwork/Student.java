public class Student extends LehighPerson{
    private String major;
    private String anticipatedGradDate;
    private static int totalCSEnrollment = 0;
    
    //CONSTRUCTORS
    public Student(){
        super();
    }
    public Student(String name, String address, String birthdate, String lin, String email){
        super(lin,email,name,address,birthdate);//order sensitive to parent method
    }
    public Student(String lin, String email){
        super(lin,email);
    }



    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
        if(major.equals("CS")){
            totalCSEnrollment++;
        }
    }
    
    public String getAntipatedGradDate(){
        return anticipatedGradDate;
    }
    public void setAntipatedGradDate(String GradDate){
        this.anticipatedGradDate = GradDate;
    }
    public int getTotalCSEnrollment(){
        return totalCSEnrollment;
    }
    public String toString(){
        return (super.toString() + "Major: " + major + "\n" + "anticipatedGradDate: " + anticipatedGradDate + "\n"); 
    }

}