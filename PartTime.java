public class PartTime extends Lecturer {
    private double hoursWorked;

    public PartTime(String name, String lecturerId, String address, String mail, String phone, double hoursWorked) {
        super(name, lecturerId, address, mail, phone);
        this.hoursWorked = hoursWorked;
    }

    @Override
    protected void work() {
        basicPay = hoursWorked * 3000;

        double tax = computeTax();
        double eval = computeEvaluation();
        double supervision = computeSupervision();

        double gross = basicPay + eval + supervision;
        double deductions = tax;
        double net = gross - deductions;

        System.out.println("\n=== PART-TIME LECTURER PAYSLIP ===");
        System.out.println("Name: " + name);
        System.out.println("Lecturer ID: " + lecturerId);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Tax (5%): " + tax);
        System.out.println("Evaluation (15%): " + eval);
        System.out.println("Supervision (3%): " + supervision);
        System.out.println("Net Salary: " + net);
        System.out.println("===================================");
    }
}