import java.util.ArrayList;

public class InheritanceDemo
{

    public static void main(String[] args)
    {
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

        simulatePayPeriods(workersList, 3);
        }
    public static void simulatePayPeriods(ArrayList<Worker> workers, int weeks) {
        for (int week = 1; week <= weeks; week++) {
            System.out.println("Week " + week + " Payroll:");
            System.out.printf("%-15s %-15s %-10s %-15s %-15s %-10s\n", "ID", "Name", "Title", "Hourly Rate", "Weekly Pay", "Yearly Salary");
            System.out.println("--------------------------------------------------------------------------------------------");

            for (Worker worker : workers) {
                double hoursWorked;
                if (week == 2) {
                    hoursWorked = 50.0;
                } else {
                    hoursWorked = 40.0;
                }

                double weeklyPay = worker.calculateWeeklyPay(hoursWorked);
                double yearlySalary = (worker instanceof SalaryWorker) ? ((SalaryWorker) worker).getAnnualSalary() : 0;

                System.out.printf("%-15s %-15s %-10s $%-14.2f $%-14.2f $%-10.2f\n",
                        worker.getIDNum(), worker.fullName(), worker.getTitle(), worker.getHourlyPayRate(), weeklyPay, yearlySalary);
            }
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println();
        }
    }
}

