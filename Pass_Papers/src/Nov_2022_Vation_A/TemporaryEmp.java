package Nov_2022_Vation_A;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TemporaryEmp extends Employee{
    private int OtHrs;
    private double OtRate;
    private double minWage;

    public TemporaryEmp(int id, String name,double otRate, double OtHrs){
        super(id,name);
        this.OtRate = getOtRate();
        this.OtHrs = getOtHrs();
        this.minWage = 15000;

    }

    public int getOtHrs() {
        return OtHrs;
    }

    public double getOtRate() {
        return OtRate;
    }

    public double getMinWage() {
        return minWage;
    }

    @Override
    public double calculateNetSalary(){
     return minWage + (OtHrs * OtRate);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("OtHrs: " + OtHrs);
        System.out.println("OtRate: " + OtRate);
        System.out.println("MinWage: " + minWage);
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}
