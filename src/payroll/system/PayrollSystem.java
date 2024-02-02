package payroll.system;

import java.util.Scanner;

public class PayrollSystem {
   
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long empNum;
        String empName;
        double hourSalary, weeklyTime, weeklySalary, overTime;
        double regPay, overtimePay, netPay;

        System.out.printf("Enter Employee No.: ");
        empNum = inp.nextLong();
        System.out.printf("Enter Hourly Salary: ");
        hourSalary = inp.nextDouble();
        System.out.printf("Enter Weekly Time: ");
        weeklyTime = inp.nextDouble();
        
        if (empNum == 10001) {
            empName = "Samuel Chua";
        }
        else if (empNum == 10002) {
            empName = "John Paul";
        }
        else if (empNum == 10003) {
            empName = "Timothy Magtibay";
        }
        else if (empNum == 10004) {
            empName = "Jan Daniel Garcia";
        }
        else {
            empName = "Unknown Employee";
        }
        
        if (weeklyTime < 100) {
            weeklySalary = weeklyTime;
            overTime = 0;
            regPay = hourSalary * weeklyTime;
            overtimePay = 0;
            netPay = regPay;
        }
    }
}
