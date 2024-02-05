import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InheritanceDemoTest
{

    @Test
    void simulatePayPeriods()
    {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        ArrayList<Worker> workersList = new ArrayList<>();
        Worker worker1 = new Worker("W001", "Walter", "O'Reilly", "Corporal", 1990, 15.0);
        Worker worker2 = new Worker("W002", "Margaret", "Houlihan", "Major", 1985, 20.0);
        Worker worker3 = new Worker("W003", "Benjamin", "Pierce", "Captain", 1982, 25.0);

        SalaryWorker salaryWorker1 = new SalaryWorker("S001", "Kelly", "Numoto", "Lieutenant", 1988, 0, 60000);
        SalaryWorker salaryWorker2 = new SalaryWorker("S002", "Maxwell", "Klinger", "Sergeant", 1975, 0, 80000);
        SalaryWorker salaryWorker3 = new SalaryWorker("S003", "Charles", "Winchester", "Major", 1995, 0, 120000);

        workersList.add(worker1);
        workersList.add(worker2);
        workersList.add(worker3);
        workersList.add(salaryWorker1);
        workersList.add(salaryWorker2);
        workersList.add(salaryWorker3);

        InheritanceDemo.simulatePayPeriods(workersList, 3);

        System.setOut(System.out);


        String expectedOutput = "Week 1 Payroll:\n" +
                "ID              Name            Title       Hourly Rate    Weekly Pay    Yearly Salary\n" +
                "--------------------------------------------------------------------------------------------\n" +
                "W001            Walter O'Reilly Corporal    $15.00         $600.00        $0.00\n" +
                "\n" +
                "Week 2 Payroll:\n" +
                "ID              Name            Title       Hourly Rate    Weekly Pay    Yearly Salary\n" +
                "--------------------------------------------------------------------------------------------\n" +
                "W001            Walter O'Reilly Corporal    $15.00         $750.00        $0.00\n" +
                "\n" +
                "Week 3 Payroll:\n" +
                "ID              Name            Title       Hourly Rate    Weekly Pay    Yearly Salary\n" +
                "--------------------------------------------------------------------------------------------\n" +
                "W001            Walter O'Reilly Corporal    $15.00         $600.00        $0.00\n" +
                "\n";

        String actualOutput = outputStreamCaptor.toString().trim();
        assertEquals(expectedOutput, actualOutput);

    }

}
