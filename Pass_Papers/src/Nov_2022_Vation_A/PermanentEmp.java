package Nov_2022_Vation_A;

import java.util.Scanner;

public class PermanentEmp extends Employee{
    private double basicSal;
    private double commission;

    public PermanentEmp(int id, String name, double basicSal){
        super(id,name);
        this.basicSal = 0;
        this.commission = basicSal * 0.15;
    }

    public double getBasicSal() {
        return basicSal;
    }

    public double getCommission() {
        return commission;
    }

    @Override
    public double calculateNetSalary() {
        return basicSal + commission;
    }

    public void display(){
        System.out.println("Employee  ID :" +getId());
        System.out.println("Employee Name :" +getName());
        System.out.println("Employee Salary :" +getBasicSal());
        System.out.println("Employee Commission :" +getCommission());
        System.out.println("Employee Net Salary :" +calculateNetSalary());
    }


}
