import java.time.LocalDate;
import java.util.Calendar;

public class Person
{
    private String IDNum;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public Person(String IDNum, String firstName, String lastName, String title, int YOB)
    {
        this.IDNum = IDNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getIDNum() {
        return IDNum;
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String fullName()
    {
        return firstName + "" + lastName;
    }
    public String formalName()
    {
        return title + "" + fullName();
    }
    public int getYOB()
    {
        return YOB;
    }
    public void setYOB(int YOB)
    {
        if (YOB >= 1940 && YOB <= 2000) {
            this.YOB = YOB;
        } else {
            throw new IllegalArgumentException("Year of birth must be between 1940 and 2000.");
        }
    }
    public String getAge()
    {
        LocalDate today = LocalDate.now();
        int age = today.getYear() -YOB;
        return String.valueOf(age);
    }
    public String getAge(int year)
    {
        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.set(YOB, Calendar.JANUARY, 1);

        Calendar specifiedYearCalendar = Calendar.getInstance();
        specifiedYearCalendar.set(year, Calendar.JANUARY, 1);

        int age = specifiedYearCalendar.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR);

        if (specifiedYearCalendar.before(birthCalendar))
        {
            age--;
        }
        return String.valueOf(age);
    }
    public String toCSVDataRecord()
    {
        return String.format("%s,%s,%s,%s,%d", getIDNum(), getFirstName(), getLastName(), getTitle(), getYOB());
    }

}
