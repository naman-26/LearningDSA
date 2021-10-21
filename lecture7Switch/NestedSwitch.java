package com.naman.lecture7Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch (empID) {
            case 1:
                System.out.println("Naman Agrawal");
                break;
            case 2:
                System.out.println("Disha");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department");
                }
                break;
            default:
                System.out.println("Enter correct value");
        }
    }
}
