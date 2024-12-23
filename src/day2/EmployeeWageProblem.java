package day2;

public class EmployeeWageProblem {
    public static final int PART_TIME_EMPLOYEE = 0;
    public static final int FULL_TIME_EMPLOYEE = 1;
    public static final int HOURLY_WAGE = 20;

    public static void main(String[] args) {
        // Step 1 - Display Welcome Message
        System.out.println("Welcome to the Employee Wage Calculation System");

        // Determine Employee Type (Part-Time or Full-Time)
        int employeeType = (int) (Math.random() * 100) % 2;

        // Step 2 - Check Employee Attendance
        boolean isEmployeePresent = verifyAttendance(employeeType);
        System.out.println(isEmployeePresent ? "The employee is present today." : "The employee is absent today.");

        // Step 3 - Calculate Daily Wage Based on Employee Type
        System.out.println("Daily Wage: Rs. " + computeDailyWage(employeeType, HOURLY_WAGE));
    }

    // Method to Verify Employee Attendance
    public static boolean verifyAttendance(int employeeType) {
        return employeeType == FULL_TIME_EMPLOYEE; // Employee is present if type matches FULL_TIME_EMPLOYEE
    }

    // Method to Calculate Daily Wage Based on Employee Type
    public static int computeDailyWage(int employeeType, int hourlyWage) {
        int totalWorkHours = 0; // Initialize work hours to zero

        if (employeeType == FULL_TIME_EMPLOYEE) {
            totalWorkHours = 8; // Full-time employees work 8 hours
        } else {
            System.out.println("The employee is absent, so the daily wage is Rs. 0.");
        }

        return totalWorkHours * hourlyWage; // Calculate wage based on total work hours
    }
}

