public class Worker extends Person
{
    private double hourlyPayRate;

    public Worker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate)
    {
        super(IDNum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        double standardHours = 40.0;
        double overtimePayRate = 1.5 * hourlyPayRate;

        if (hoursWorked <= standardHours)
        {
            return hoursWorked * hourlyPayRate;
        } else {
            double regularPay = standardHours * hourlyPayRate;
            double overtimeHours = hoursWorked - standardHours;
            double overtimePay = overtimeHours * overtimePayRate;

            return regularPay + overtimePay;
        }
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(hoursWorked - 40, 0);

        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = overtimeHours * (1.5 * hourlyPayRate);
        double totalPay = calculateWeeklyPay(hoursWorked);


        return String.format("Weekly Pay Information:\n" + "Regular Hours: %.2f, Regular Pay: $%.2f\n" + "Overtime Hours: %.2f, Overtime Pay: $%.2f\n" + "Total Pay: $%.2f", regularHours, regularPay, overtimeHours, overtimePay, totalPay);

    }
}