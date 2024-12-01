package Nov_oop_2022_Q1;

import java.util.Scanner;

public class RegisteredCus extends Customer{
    private double rewardPoints;
    private double netAmount;

    public RegisteredCus(int id, String name) {
        super(id,name);
        this.rewardPoints = 0;
        this.netAmount = 0;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public double getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(double rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public double calculateBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bill amount :");
        double billAmount = scanner.nextDouble();
        if (billAmount > 950) {
            rewardPoints = billAmount * 0.15;
        } else {
            rewardPoints = 0;
        }
        return netAmount;
    }

    @Override
    public void display() {
        calculateBill();
        System.out.println("Customer ID :" +getId());
        System.out.println("Customer ID :" +getName());
        System.out.println("Reward Points: " + rewardPoints);
        System.out.println("Net Amount: $" + netAmount);
    }
    public static void main(String[] args) {
        RegisteredCus customer = new RegisteredCus(1, "Jane Doe");
        customer.display();
    }
}
