package HN_KS24_CNTT4_NguyenTuanMinh_02.ra.entity;

import java.util.Scanner;

public class Employee {
    protected String empId;
    protected String empName;
    protected int age;
    protected double salary;

    public Employee() {
    }

    public Employee(String empId, String empName, int age, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Hay nhap id cua nhan vien: ");
        empId = scanner.next();
        System.out.println("Hay nhap name cua nhan vien: ");
        empName = scanner.next();
        System.out.println("Hay nhap tuoi cua nhan vien: ");
        age = scanner.nextInt();
        System.out.println("Hay nhap luong cua nhan vien: ");
        salary = scanner.nextDouble();
    }

    public void displayData() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Age: " + age + ", Salary: " + salary);
    }

    public static String checkEmpId(Scanner sc) {
        while (true) {
            System.out.println("Hay nhap id nhan vien: ");
            String empId = sc.nextLine().trim();
            if(empId.isEmpty()) {
                System.out.println("ID khong duoc de trong");
            } else {
                return empId;
            }
        }
    }

    public static String checkEmpName(Scanner sc) {
        while (true) {
            System.out.println("Hay nhap ten nhan vien: ");
            String empName = sc.nextLine().trim();
            if(empName.isEmpty()) {
                System.out.println("Ten khong duoc de trong");
            } else {
                return empName;
            }
        }
    }

    public static int checkAge(Scanner sc) {
        while (true) {
            System.out.println("Hay nhap id nhan vien: ");
            try {
                int age = Integer.parseInt(sc.nextLine().trim());
                if(age < 0) {
                    System.out.println("Tuoi khong duoc am");
                } else {
                    return age;
                }
            } catch (NumberFormatException e) {
                System.out.println("Tuoi phai la so nguyen");
            }
        }
    }

    public static double checkSalary(Scanner sc) {
        while (true) {
            System.out.println("Hay nhap luong nhan vien: ");
            try {
                double salary = Double.parseDouble(sc.nextLine().trim());
                if(salary < 0) {
                    System.out.println("Luong khong duoc am");
                } else {
                    return salary;
                }
            } catch (NumberFormatException e) {
                System.out.println("Phai co luong");
            }
        }
    }
}
