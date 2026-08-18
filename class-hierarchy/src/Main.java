// TODO 14: Inside main(), create Date instances
// TODO 15: Declare Teacher object with initial salary 0
// TODO 16: Declare Student object
// TODO 17: Call setSalary() and assign 50000
// TODO 18: Call getDetails() for teacher and student


public class Main{
    public static void main(String[] args){
        Date dateOfStudent = new Date(15, 8, 2005);
        Date dateOfTeacher = new Date(10, 9, 1980);
        Date dateOfAppointment = new Date(0, 0, 0);
        
        Teacher t1 = new Teacher("Madhavan", dateOfTeacher, dateOfAppointment, "Electronics", "MTech", 0);
        Student s1 = new Student("Belinda", dateOfStudent, t1, "Electronics");
        
        t1.setSalary(50000);
        
        System.out.println(t1.getDetails());
        System.out.println("\n");
        System.out.println(s1.getDetails());    

    }
}