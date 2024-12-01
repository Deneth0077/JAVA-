package Collection_2023_V_B;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        //create employee arraylist
        ArrayList<String> Employee = new ArrayList<>();
        //get user inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name ('done' to exit ): ");

        //user input enter the names
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            Employee.add(name);
        }
    //Remove employee name
        System.out.println("Enter the name user wont remove employee:");
        String nameRemove = sc.nextLine();
        boolean removed = Employee.remove(nameRemove);
        if(removed){
            System.out.println("Employee name :"+nameRemove +"Successfully removed");
        }else{
            System.out.println("Employee name :"+nameRemove +"Failed");
        }

        //find the total no of employee
        int totalEmployees = Employee.size();
        System.out.println("Total No of Employees:" + totalEmployees);

        System.out.println("Print the all employee list :");
        for(String name : Employee){
            System.out.println(name);
        }

    }
}
