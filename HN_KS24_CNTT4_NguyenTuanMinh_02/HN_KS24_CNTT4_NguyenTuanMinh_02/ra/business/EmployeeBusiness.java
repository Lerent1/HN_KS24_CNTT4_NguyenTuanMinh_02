package HN_KS24_CNTT4_NguyenTuanMinh_02.ra.business;

import HN_KS24_CNTT4_NguyenTuanMinh_02.ra.entity.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeBusiness {
    protected static EmployeeBusiness instance;
    protected static List<Employee> employee;

    protected EmployeeBusiness() {
        employee = new ArrayList<>();
    }

    public static EmployeeBusiness getInstance() {
        if (instance == null) {
            instance = new EmployeeBusiness();
        }
        return instance;
    }

    protected static List<Employee> getEmployee() {
        return employee;
    }

    public void showMenu() {
        if (employee.isEmpty()) {
            System.out.println("Danh sach rong");
        } else {
            System.out.println("Danh sach sinh vien: ");
            System.out.println("=====================================");
            System.out.println("| ID | Ten nhan vien | Tuoi | Luong |");
            System.out.println("=====================================");
            for (Employee e : employee) {
                System.out.printf("| %-10s | %-15s | %-5d | %.2f%n |", e.getEmpId(), e.getEmpName(), e.getAge(), e.getSalary());
            }
            System.out.println("=====================================");
        }
    }

    public boolean addEmployee(Employee e) {
        boolean check = employee.stream().anyMatch(emp -> emp.getEmpId().equalsIgnoreCase(e.getEmpId()));
        if (check) {
            System.out.println("Ma nhan vien da ton tai");
            return false;
        }
        employee.add(e);
        System.out.printf("Them nhan vien thanh cong");
        return true;
    }

    public void updateEmployee(Employee e) {

    }

    public void deleteEmployee(String empId) {
        int size = employee.size();
        employee.removeIf(emp -> emp.getEmpId().equalsIgnoreCase(empId));
        if(employee.size() == size) {
            System.out.println("Ma nhan vien khong ton tai");
        } else  {
            System.out.println("Xoa nhan vien thanh cong");
        }
    }

    public void searchEmployee(String empId) {
        List<Employee> search = new ArrayList<>();
        for (Employee e : employee) {
            if (e.getEmpId().equalsIgnoreCase(empId)) {

            }
        }
    }

    public void sortEmployee() {
        if (employee.isEmpty()) {
            System.out.println("Danh sach rong");
        } else {
            employee.sort(Comparator.comparing(Employee::getSalary).reversed());
            System.out.println("Sap xep theo muc luong giam dan thanh cong");
        }
    }

    public void filterEmployee() {
        employee.stream().filter(emp -> emp.getSalary() > 15000000).forEach(Employee::displayData);
    }
}
