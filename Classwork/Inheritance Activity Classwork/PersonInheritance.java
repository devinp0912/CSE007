public class PersonInheritance{
    public static void main(String[]args){
        Person p = new Person("Wyn", "123 Main St.", "19920703");
        Student s = new Student("Huber", "Campus Square", "19930623", "8765908", "ayh224@lehigh.edu");
        LehighPerson lp = new LehighPerson("123456", "smk424@lehigh.edu", "Kalafut", "1216 Davies Drive", "19910623");
        s.setMajor("CS");
        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(lp.toString());
        System.out.println(s.getTotalCSEnrollment());
        Student[] roster = new Student[5];
        for(int i = 0; i < roster.length; i++){
            roster[i] = s;
        }
        for(Student stud : roster){
            System.out.println(stud.toString());
        }
    }
}