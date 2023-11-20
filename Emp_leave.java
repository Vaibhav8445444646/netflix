import java.util.Scanner;

public class Emp_leave {
    int empno;
    String empname;
    int total_leave = 12;
    double basic;
    double DA;
    double HRA;
    double gross_sal;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        empno = sc.nextInt();
        System.out.print("Enter employee name: ");
        empname = sc.next();
        System.out.print("Enter basic salary: ");
        basic = sc.nextDouble();
        DA = 1.2 * basic;
        HRA = 0.2 * basic;
        gross_sal = basic + DA + HRA;
    }

    public void display() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + empname);
        System.out.println("Total Leave: " + total_leave);
        System.out.println("Basic Salary: " + basic);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross Salary: " + gross_sal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp_leave[] emp = new Emp_leave[100];
        int n = 0;
        int choice;
        do {
            System.out.println("\nMAIN MENU");
            System.out.println("1. Input n employees record");
            System.out.println("2. Grant leave if available and update employee record");
            System.out.println("3. Apply for leave without pay");
            System.out.println("4. Display employee data sorted by empno (table form)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number of employees: ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        emp[i] = new Emp_leave();
                        emp[i].input();
                    }
                    break;
                case 2:
                    System.out.print("Enter employee number: ");
                    int eno = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (emp[i].empno == eno) {
                            if (emp[i].total_leave > 0) {
                                emp[i].total_leave--;
                                System.out.println("Leave granted successfully!");
                            } else {
                                System.out.println("No leave available!");
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter employee number: ");
                    int eno1 = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (emp[i].empno == eno1) {
                            System.out.println("Leave without pay applied successfully!");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Employee Data Sorted by empno (Table Form)");
                    System.out.println("--------------------------------------------------");
                    System.out.println("Empno\tEmpname\tTotal Leave\tBasic\tDA\tHRA\tGross Sal");
                    System.out.println("--------------------------------------------------");
                    for (int i = 0; i < n; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (emp[i].empno > emp[j].empno) {
                                Emp_leave temp = emp[i];
                                emp[i] = emp[j];
                                emp[j] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        emp[i].display();
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}
