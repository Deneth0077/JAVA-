package Nov_2022_Vation_A;

import java.util.ArrayList;

public class DemoApp {
    public static void main(String[] args) {
        ArrayList<PermanentEmp> permanentEmpList = new ArrayList<>();

        permanentEmpList.add(new PermanentEmp(1, "kamal", 12000));
        permanentEmpList.add(new PermanentEmp(2, "kamal", 12000));

        for (PermanentEmp emp : permanentEmpList) {
            emp.calculateNetSalary();
            emp.display();
        }
        ArrayList<TemporaryEmp> temporaryEmpList = new ArrayList<>();
        temporaryEmpList.add(new TemporaryEmp(3, "kamal", 10, 1200)); // Fixed the otRate
        temporaryEmpList.add(new TemporaryEmp(4, "kamal", 15, 1200)); // Fixed the otRate

        for (TemporaryEmp emp : temporaryEmpList) {
            emp.calculateNetSalary();
            emp.display();
        }
    }
}