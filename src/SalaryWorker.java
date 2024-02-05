public class SalaryWorker extends Worker
{

    private double annualSalary;

    public SalaryWorker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary)
    {
        super(IDNum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        return String.format("Weekly Pay Information (Salary Worker):\n" +
                "Weekly Pay: $%.2f\n" +
                "This is a fraction of the yearly salary.", weeklyPay);
    }
}

