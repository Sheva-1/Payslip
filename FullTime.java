public class FullTime extends Lecturer {
    public FullTime(String name, String lecturerId, String address, String mail, String phone) {
        super(name, lecturerId, address, mail, phone);
    }

    @Override
    protected void work() {
        basicPay = 250000;
        double hoursWorked = 45;
        if (hoursWorked < 50) {
            basicPay = hoursWorked * 3000 * 1.5;
        }

        double cnps = computeCNPS();
        double tax = computeTax();
        double eval = computeEvaluation();
        double supervision = computeSupervision();

        double gross = basicPay + eval + supervision;
        double deductions = cnps + tax;
        double net = gross - deductions;

        System.out.println("\n=== FULL-TIME LECTURER PAYSLIP ===");
        System.out.println("Name: " + name);
        System.out.println("Lecturer ID: " + lecturerId);
        System.out.println("Gross Salary: " + gross);
        System.out.println("CNPS (10%): " + cnps);
        System.out.println("Tax (5%): " + tax);
        System.out.println("Evaluation (15%): " + eval);
        System.out.println("Supervision (3%): " + supervision);
        System.out.println("Net Salary: " + net);
        System.out.println("===================================");
    }
}