public class Lecturer {
    protected String name, lecturerId, address, mail, phone;
    protected double basicPay;

    public Lecturer(String name, String lecturerId, String address, String mail, String phone) {
        this.name = name;
        this.lecturerId = lecturerId;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
    }

    protected double computeCNPS() { return 0.10 * basicPay; }
    protected double computeTax() { return 0.05 * basicPay; }
    protected double computeEvaluation() { return 0.15 * basicPay; }
    protected double computeSupervision() { return 0.03 * basicPay; }

    protected void work() {}
}