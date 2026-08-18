// TODO 8: Declare an abstract Employee class as extension of Person
// TODO 9: Include attributes: dateOfAppointment and salary
// TODO 10: Include abstract getter and setter for salary

public abstract class Employee extends Person{
    Date dateOfAppointment;
    int salary;
    public Employee(String name, Date dob) {
        super(name, dob);
        
    }
    public abstract int getSalary();

    public abstract void setSalary(int salary);
    
    
}