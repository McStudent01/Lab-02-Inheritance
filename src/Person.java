import java.time.LocalDate;

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
    public String fullName()
    {
        return firstName + "" + lastName;
    }
    public String formalName()
    {
        return title + "" + fullName();
    }
    public int getAge()
    {
        LocalDate today = LocalDate.now();
        return today.getYear() - YOB;
    }
    public int getYOB()
    {
        return YOB;
    }
    public void setYOB(int YOB) {
        if (YOB >= 1940 && YOB <= 2000) {
            this.YOB = YOB;
        } else {
            throw new IllegalArgumentException("Year of birth must be between 1940 and 2000.");
        }
    }

}
