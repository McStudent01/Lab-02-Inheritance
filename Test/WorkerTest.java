import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest
{

    @Test
    public void testCalculateWeeklyPayRegularHours()
    {
        Worker worker = new Worker("123", "John", "Doe", "Mr.", 1990, 15.0);
        double weeklyPay = worker.calculateWeeklyPay(35);
        assertEquals(525.0, weeklyPay, 0.01);
    }

    @Test
    public void testCalculateWeeklyPayOvertimeHours()
    {
        Worker worker = new Worker("456", "Jane", "Smith", "Ms.", 1985, 20.0);
        double weeklyPay = worker.calculateWeeklyPay(50);
        assertEquals(1100.0, weeklyPay, 0.01);
    }

    @Test
    public void testCalculateWeeklyPayNoOvertime()
    {
        Worker worker = new Worker("789", "Bob", "Johnson", "Mr.", 1982, 18.0);
        double weeklyPay = worker.calculateWeeklyPay(40);
        assertEquals(720.0, weeklyPay, 0.01);
    }

    @Test
    public void testDisplayWeeklyPay()
    {
        Worker worker = new Worker("123", "John", "Doe", "Mr.", 1990, 15.0);
        String expectedOutput = "Weekly Pay Information:\n" +
                "Regular Hours: 40.00, Regular Pay: $600.00\n" +
                "Overtime Hours: 0.00, Overtime Pay: $0.00\n" +
                "Total Pay: $600.00";
        assertEquals(expectedOutput, worker.displayWeeklyPay(40));
    }
}

