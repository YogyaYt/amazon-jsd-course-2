// TODO 11: Create Teacher class with attributes and constructor
// TODO 12: Override the getDetails() method
// TODO 13: Implement getSalary() and setSalary() methods
public class Teacher extends Employee{
    String subject;
    String qualification;

    public Teacher(String name, Date dob, Date dateOfAppointment,String subject, String qualification, int salary) {
        super(name, dob);
        this.dateOfAppointment = dateOfAppointment;
        this.subject = subject;
        this.qualification = qualification;
        this.salary = salary;
        
    }

    @Override
    public int getSalary() {
        return salary;
        
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getDetails() {
        return "Name: " + name
         + " \nDate of Birth: " + dob.getDate()
         + " \nDate of Appointment: " + dateOfAppointment.getDate()
         + " \nSubject: " + subject
         + " \nQualification: " + qualification
         + " \nSalary: " + salary;
        
    }

}