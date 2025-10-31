import java.util.Scanner;

public class TestPayslip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect Lecturer Type: ");
            System.out.println("1. Full Time");
            System.out.println("2. Part Time");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            if (choice == 3) break;
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Lecturer ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            System.out.print("Enter Email: ");
            String mail = sc.nextLine();
            System.out.print("Enter Phone: ");
            String phone = sc.nextLine();

            switch (choice) {
                case 1:
                    FullTime ft = new FullTime(name, id, address, mail, phone);
                    ft.work();
                    break;
                case 2:
                    System.out.print("Enter Hours Worked: ");
                    double hours = sc.nextDouble();
                    PartTime pt = new PartTime(name, id, address, mail, phone, hours);
                    pt.work();
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}