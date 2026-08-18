// TODO 1: Declare the abstract Person class
public abstract class Person{
    String name;
    Date dob;
    public Person(String name,Date dob){
        this.name = name;
        this.dob = dob;
    }
    public abstract String getDetails();
}