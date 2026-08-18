// TODO 4: Design Student class by extending Person
// TODO 5: Declare two instance attributes: subject and teacher
// TODO 6: Define a constructor for the Student class
// TODO 7: Override the getDetails() method


public class Student extends Person{
    String subject;
    Teacher teacher;

    public Student(String name, Date dob, Teacher teacher, String subject){
        super(name, dob);
        this.teacher = teacher;
        this.subject = subject;
    }

    @Override
    public String getDetails(){
        return "Name of Student: "+ name + "\nDate of Birth: "+ dob.getDate() + "\nName of Teacher: "+ teacher.name + "\nSubject: "+ subject;
    }
}