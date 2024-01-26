import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Product
{
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    public Product(String firstName, String lastName, String ID, String title, int YOB)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getID()
    {
        return ID;
    }

    public String getTitle()
    {
        return title;
    }

    public int getYOB()
    {
        return YOB;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setYOB(int YOB)
    {
        this.YOB = YOB;
    }
    public String fullName()
    {
        return firstName + " " + lastName;
    }

    public String formalName()
    {
        return title + " " + fullName();
    }

    public String getAge()
    {
        return getAge(Calendar.getInstance().get(Calendar.YEAR));
    }

    public String getAge(int year)
    {
        int age = year - YOB;
        return Integer.toString(age);
    }

    public String toCSVDataRecord()
    {
        return String.format("%s,%s,%s,%s,%d", firstName, lastName, ID, title, YOB);
    }
}