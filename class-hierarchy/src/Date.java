// TODO 2: Declare the Date class with date, month, year
// TODO 3: Include the getDate() method
public class Date {
    int date;
    int month;
    int year;

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String getDate() {
        return "Date: " + date + " Month: " + month + " Year: " + year;
    }
}