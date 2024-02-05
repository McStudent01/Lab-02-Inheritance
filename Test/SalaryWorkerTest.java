import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest
{

    @Test
    public void testCalculateWeeklyPay()
    {
        SalaryWorker salaryWorker = new SalaryWorker("123", "John", "Doe", "Mr.", 1990, 0, 60000);
        double weeklyPay = salaryWorker.calculateWeeklyPay(0);
        assertEquals(1153.85, weeklyPay, 0.01);
    }

    @Test
    public void testDisplayWeeklyPay()
    {
        SalaryWorker salaryWorker = new SalaryWorker("123", "John", "Doe", "Mr.", 1990, 0, 60000);
        String expectedOutput = "Weekly Pay Information (Salary Worker):\n" +
                "Weekly Pay: $1153.85\n" +
                "This is a fraction of the yearly salary.";
        assertEquals(expectedOutput, salaryWorker.displayWeeklyPay(0));
    }

    @Test
    public void testSetAnnualSalary()
    {
        SalaryWorker salaryWorker = new SalaryWorker("123", "John", "Doe", "Mr.", 1990, 0, 60000);
        salaryWorker.setAnnualSalary(70000);
        assertEquals(70000, salaryWorker.getAnnualSalary(), 0.01);
    }
}