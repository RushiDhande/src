package EmpAttendance;

public class empAttendance {


        public static void main(String[] args) {
            System.out.println("welcome to Employee Wage Computation");

            int IsFullTime = 1;
            // computation
            double EmpCheck = Math.floor(Math.random() *10) % 2;
            if (EmpCheck == IsFullTime)
            {
                System.out.println("Emp Is Present");
            }
            else
            {
                System.out.println("Emp Is Absent");
            }

        }
    }





