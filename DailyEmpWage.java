package EmpAttendance;

public class DailyEmpWage {

    //calculate daily EmployeeWAges

    public static void main(String[] args) {
        System.out.println("Daily Employee Wage");
        int WagePerHr = 20;
        int FullDayHr = 8;
        int PartTimeHr = 8;
        int WorkingDayPerMonth = 20;
        int TotalWorkingHr = 100;


        // computation

        // Daily Employee Wage

        int DailyEmpWage = (WagePerHr * FullDayHr);
        System.out.println("Daily Employee Wage is :" + DailyEmpWage);

        // Part Time Employee Wage

        int PartTimeWage = (WagePerHr * PartTimeHr);
        System.out.println("Part Time Employee Wage is :" + PartTimeWage);

        // Wage Per Month Of

        int WagePerMonth = (WagePerHr * FullDayHr * WorkingDayPerMonth);
        System.out.println("Wage Per Month Of Emp is :" + WagePerMonth);

        // Total Wage In Month

        int TotalWagePerMonth = (WagePerHr * FullDayHr * TotalWorkingHr);
        System.out.println("Wage Per Month Of Emp is :" + TotalWagePerMonth);


    }

}
