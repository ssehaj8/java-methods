import java.util.Random;

public class EmployeeBonus {

    // Method to generate salary and years of service for 10 employees
    public static int[][] generateEmployeeData(int n) {
        Random random = new Random();
        // [salary, years of service]
        int[][] employeeData = new int[n][2]; 

        for (int i = 0; i < n; i++) {
          // Random 5-digit salary
            employeeData[i][0] = 10000 + random.nextInt(90000); 
          // Random years of service (0-10)
            employeeData[i][1] = random.nextInt(11); 
        }
        return employeeData;
    }

    // Method to calculate the new salary and bonus amount
    public static int[][] calculateBonuses(int[][] employeeData) {
      // [old salary, bonus, new salary]
        int[][] updatedData = new int[employeeData.length][3]; 

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;

            int bonus = (int) (salary * bonusPercentage);
            int newSalary = salary + bonus;

            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }

    // Method to calculate and display the total bonus and salaries
    public static void displaySummary(int[][] updatedData) {
        int totalOldSalary = 0;
        int totalNewSalary = 0;
        int totalBonus = 0;

        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Emp#", "Old Salary", "Years", "Bonus", "New Salary");
        for (int i = 0; i < updatedData.length; i++) {
            int oldSalary = updatedData[i][0];
            int bonus = updatedData[i][1];
            int newSalary = updatedData[i][2];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", i + 1, oldSalary, (bonus / (int)(oldSalary * 0.02)), bonus, newSalary);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] employeeData = generateEmployeeData(n);
        int[][] updatedData = calculateBonuses(employeeData);
        displaySummary(updatedData);
    }
}
