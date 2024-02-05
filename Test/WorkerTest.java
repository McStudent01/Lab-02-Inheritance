import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest
    {
        public static void main(String[] args)
        {
            Worker worker = new Worker("456", "Alice", "Smith", "Ms.", 1985, 15.0);

            System.out.println("Personal Information:");
            System.out.println("Full Name: " + worker.fullName());
            System.out.println("Title: " + worker.getTitle());
            System.out.println("Year of Birth: " + worker.getYOB());

            System.out.println("\nWeekly Pay Information:");
            System.out.println(worker.displayWeeklyPay(35));  // Standard hours
            System.out.println(worker.displayWeeklyPay(45));  // Overtime hours
            System.out.println(worker.displayWeeklyPay(30));  // Less than standard hours
        }
    }
