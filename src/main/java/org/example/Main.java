package org.example;
import org.example.Employee;
import java.util.Scanner;
import java.util.Locale;

// teste pro github //

public class Main {
    public static void main() {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Employee roger = new Employee();

        System.out.print("Put the salary of the Employee: ");
        roger.baseSalary = sc.nextDouble();
        System.out.print("Put the bonus: ");
        roger.bonus = sc.nextDouble();

        System.out.printf("Salary: %.2f \n", roger.finalSalary());

        if(roger.finalSalary() < 3000.00) {
            System.out.println("TARGET NOT REACHED");
            System.out.printf("MISSING AMOUNT: %.2f", roger.missingSalary());
        }

        sc.close();

        }
    }

